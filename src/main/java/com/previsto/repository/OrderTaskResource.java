package com.previsto.repository;

import com.previsto.model.OrderLine;
import com.previsto.model.OrderTask;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.client.RestTemplate;

public class OrderTaskResource extends Resource<OrderTask> {

    public OrderTaskResource(RestTemplate restTemplate, String serviceUrl) {
        super(OrderTask.class, "OrderTask", restTemplate, serviceUrl);
    }
    
    public OrderTaskResource(RestTemplate restTemplate, String serviceUrl, String servicePath) {
        super(OrderTask.class, "OrderTask", restTemplate, serviceUrl, servicePath);
    }

    @Override
    protected void loadRelations(OrderTask entity) {
        // Load all the lines for the task
        Resource<OrderLine> lineResource = new Resource(OrderLine.class, "OrderLine", restTemplate, fiscalUrl, resolveServicePath(entity.getId(), true));
        entity.setOrderLines(new ArrayList(lineResource.findAll()));
    }

    @Override
    protected boolean saveRelations(OrderTask entity, OrderTask orgEntity) {
        boolean changed = false;
        if (orgEntity.getOrderLines() != null) {
            List<OrderLine> lines = orgEntity.getOrderLines();
            
            // If entity has order lines, then persist each line
            entity.setOrderLines(new ArrayList<>());
            Resource<OrderLine> lineResource = new Resource(OrderLine.class, "OrderLine", restTemplate, fiscalUrl);
            for (OrderLine line : lines) {
                line.setOrderTaskId(entity.getId());
                entity.getOrderLines().add(lineResource.save(line));
                changed = true;
            }
        }
        
        return changed;
    }

}
