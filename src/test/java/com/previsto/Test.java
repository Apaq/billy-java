package com.previsto;

import com.previsto.model.Contact;
import com.previsto.model.ContactType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class Test {

    public static void main(String[] args) {
        
        BillyClient client = new BillyClient("66d361eea7c89d4f9c4d56ef66b7e9bce20784e7", "https://api.billysbilling.com/v2");
        
        /*Partner partner = new Partner();
        partner.setAddress(new Address("Pudserman A/S", "Samsøgade 20", "9000", "aalborg", "DK"));
        partner = client.getPartnerResource().save(partner);
        
        Subscription sub = new Subscription();
        sub.setDescription("Månedligt abonnement på Skveege");
        sub.setCustomerId(partner.getId());
        sub.setNextRunDate(LocalDate.now().plusMonths(1).withDayOfMonth(1));
        
        SubscriptionLine line = new SubscriptionLine();
        line.setDescription("Månedligt abonnement på Skveege");
        line.setArticleId(11026473L);
        
        sub.getSubscriptionLines().add(line);
        sub = client.getSubscriptionResource().save(sub);
        
        client.getSubscriptionResource().delete(sub);
        client.getPartnerResource().delete(partner);*/
         
        
        //Page<Contact> contacts = client.getContactResource().findAll(new PageRequest(0, 2));
        Contact contact = new Contact(ContactType.Company, "Apaq", "DK");
        contact.setSupplier(true);
        contact = client.getContactResource().save(contact);
                //client.getContactResource().get("X1rMtELASOi9K5bJvkmXZQ");
        System.out.println(contact);
    }
}
