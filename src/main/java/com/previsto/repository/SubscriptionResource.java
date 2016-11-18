package com.previsto.repository;

import com.previsto.model.Subscription;
import com.previsto.model.SubscriptionInvoice;
import com.previsto.model.SubscriptionLine;
import com.previsto.model.SubscriptionTicket;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.client.RestTemplate;

public class SubscriptionResource extends Resource<Subscription>{

    public SubscriptionResource(RestTemplate restTemplate, String fiscalUrl) {
        super(Subscription.class, "Subscription", restTemplate, fiscalUrl);
    }

    @Override
    protected void loadRelations(Subscription entity) {
        Resource lineResource = new Resource(SubscriptionLine.class, "SubscriptionLine", restTemplate, fiscalUrl, resolveServicePath(entity.getId()));
        entity.setSubscriptionLines(new ArrayList(lineResource.findAll()));
        
        Resource invoiceResource = new Resource(SubscriptionInvoice.class, "Invoice", restTemplate, fiscalUrl, resolveServicePath(entity.getId()));
        entity.setInvoices(new ArrayList(invoiceResource.findAll()));
    }

    @Override
    protected boolean saveRelations(Subscription entity, Subscription orgEntity) {
        boolean changed = false;
        if(orgEntity.getSubscriptionLines() != null) {
            List<SubscriptionLine> lines = orgEntity.getSubscriptionLines();
            // If entity has subscription lines, then persist each line
            entity.setSubscriptionLines(new ArrayList<>());
            Resource<SubscriptionLine> lineResource = new Resource<>(SubscriptionLine.class, "SubscriptionLine", restTemplate, fiscalUrl);
            for(SubscriptionLine line : lines) {
                line.setSubscriptionId(entity.getId());
                entity.getSubscriptionLines().add(lineResource.save(line));
                changed = true;
            }
        }
        
        if(changed) {
            double costTotal = 0, discountTotal = 0, marginTotal = 0, priceNettTotal = 0, vatEstTotal = 0;
            for(SubscriptionLine line : entity.getSubscriptionLines()) {
                costTotal += line.getCostTotal();
                discountTotal += toPrimitive(line.getDiscount());
                marginTotal += line.getMarginTotal();
                priceNettTotal += line.getPriceNettTotal();
                vatEstTotal += line.getVatEstTotal();
            }
            entity.getTotals().setCostTotal(costTotal);
            entity.getTotals().setDiscountTotal(discountTotal);
            entity.getTotals().setMarginTotal(marginTotal);
            entity.getTotals().setPriceNettTotal(priceNettTotal);
            entity.getTotals().setVatEstTotal(vatEstTotal);
        }
        return changed;
    }
    
    public SubscriptionTicket setSubscriptionTicketId(long subscriptionId, String ticketId, String cardNumberMasked, String cardTypeName) {
        String url = fiscalUrl + resolveServicePath(subscriptionId) + "/" + "Ticket";
        SubscriptionTicket ticket = new SubscriptionTicket(ticketId, cardNumberMasked, cardTypeName);
        return restTemplate.postForEntity(url, ticket, SubscriptionTicket.class).getBody();
    }
    
    public void activateSubscription(long subscriptionId) {
        String url = fiscalUrl + resolveServicePath(subscriptionId) + "/" + "Activate";
        restTemplate.put(url, null);
    }
    
    public void deactivateSubscription(long subscriptionId) {
        String url = fiscalUrl + resolveServicePath(subscriptionId) + "/" + "Deactivate";
        restTemplate.put(url, null);
    }
    
    public double toPrimitive(Double value) {
        if(value == null) {
            return 0;
        } else {
            return value;
        }
    }

}
