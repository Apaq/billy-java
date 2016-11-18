package com.previsto.repository;

import com.previsto.exception.UnknownException;
import com.previsto.model.Order;
import com.previsto.model.OrderActionResult;
import com.previsto.model.OrderBookkeepData;
import com.previsto.model.OrderJournalEntry;
import com.previsto.model.OrderTask;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class OrderResource extends Resource<Order>{

    private static final Logger LOG = LoggerFactory.getLogger(OrderResource.class);
    
    public OrderResource(RestTemplate restTemplate, String fiscalUrl) {
        super(Order.class, "Order", restTemplate, fiscalUrl);
    }

    @Override
    protected void loadRelations(Order entity) {
        if(entity != null) {
            // Load all the tasks for the order
            OrderTaskResource taskResource = new OrderTaskResource(restTemplate, fiscalUrl, resolveServicePath(entity.getId()));
            entity.setOrderTasks(new ArrayList(taskResource.findAll(true)));
            
            // Load journals
            Resource journalResource = new Resource(OrderJournalEntry.class, "Journal", restTemplate, fiscalUrl, resolveServicePath(entity.getId()));
            entity.setJournalEntrys(new ArrayList(journalResource.findAll()));
        
        }
    }

    @Override
    protected boolean saveRelations(Order entity, Order orgEntity) {
        boolean changed = false;
        if(orgEntity.getOrderTasks()!= null) {
            List<OrderTask> tasks = orgEntity.getOrderTasks();
            // If entity has order tasks, then persist each line
            entity.setOrderTasks(new ArrayList<>());
            OrderTaskResource taskResource = new OrderTaskResource(restTemplate, fiscalUrl);
            for(OrderTask task : tasks) {
                task.setOrderId(entity.getId());
                entity.getOrderTasks().add(taskResource.save(task));
                changed = true;
            }
        }
        return changed;
    }

    /*@Override
    public Order save(Order entity) {
        Order order = super.save(entity);
        
        // Order is changed asynchronously - lets reload until we are allowed to invoice it.
        int reloadCount = 0;
        while(!order.getOrderTasks().isEmpty() && !order.getSummary().isCanInvoice()) {
            if(reloadCount++ > 5) {
                throw new UnknownException("Unable to get persisted order. Tried to wait and reload five times to give Xena time to update the order behind the scenes.");
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {}
            LOG.debug("Reloading order to check for asynchronously updated order. [count={}]", reloadCount);
            order = get(order.getId());
        }
        return order;
    }*/
    
    
    
    public OrderActionResult bookkeep(long orderId, OrderBookkeepData bookkeepData) {
        String url = fiscalUrl + resolveServicePath(orderId) + "/" + "Bookkeep";
        HttpEntity entity = new HttpEntity(bookkeepData);
        return restTemplate.exchange(url, HttpMethod.PUT, entity, OrderActionResult.class).getBody();
    }
}
