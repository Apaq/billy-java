package com.previsto.repository;

import com.previsto.model.OrderContext;
import com.previsto.model.Partner;
import com.previsto.model.PartnerTelephoneNumber;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.client.RestTemplate;

public class PartnerResource extends Resource<Partner>{

    public PartnerResource(RestTemplate restTemplate, String fiscalUrl) {
        super(Partner.class, "Partner", restTemplate, fiscalUrl);
    }

    @Override
    protected void loadRelations(Partner entity) {
        Resource contextResource = new Resource(OrderContext.class, "Context", restTemplate, fiscalUrl, resolveServicePath(entity.getId()));
        Resource phoneResource = new Resource(PartnerTelephoneNumber.class, "TelephoneNumber", restTemplate, fiscalUrl, resolveServicePath(entity.getId()));
        entity.setContexts(new ArrayList(contextResource.findAll()));
        entity.setTelephoneNumbers(new ArrayList<>(phoneResource.findAll()));
    }

    @Override
    protected boolean saveRelations(Partner entity, Partner orgEntity) {
        boolean changed = false;
        if(orgEntity.getContexts()!= null) {
            List<OrderContext> contexts = orgEntity.getContexts();
            List<PartnerTelephoneNumber> phoneNumbers = orgEntity.getTelephoneNumbers();
            
            entity.setContexts(new ArrayList<>());
            Resource<OrderContext> lineResource = new Resource<>(OrderContext.class, "PartnerContext", restTemplate, fiscalUrl);
            for(OrderContext line : contexts) {
                line.setPartnerId(entity.getId());
                entity.getContexts().add(lineResource.save(line));
                changed = true;
            }
            
            entity.setTelephoneNumbers(new ArrayList<>());
            Resource<PartnerTelephoneNumber> phoneResource = new Resource<>(PartnerTelephoneNumber.class, "PartnerTelephoneNumber", restTemplate, fiscalUrl);
            for(PartnerTelephoneNumber number : phoneNumbers) {
                number.setPartnerId(entity.getId());
                entity.getTelephoneNumbers().add(phoneResource.save(number));
                changed = true;
            }
        }
        return changed;
    }

}
