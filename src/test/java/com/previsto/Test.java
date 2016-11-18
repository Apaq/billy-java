package com.previsto;

import com.previsto.BillyClient;
import com.previsto.model.Address;
import com.previsto.model.OrderInvoiceTransaction;
import com.previsto.model.Partner;
import com.previsto.model.Subscription;
import com.previsto.model.SubscriptionLine;
import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
        
        BillyClient client = new BillyClient(10926, "6082ebbc-0447-4c62-adcf-cd77ebe14ada", "https://test.xena.biz/Api");
        
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
                
        OrderInvoiceTransaction oit = client.getOrderInvoiceTransactionResource().get(11085154);
        System.out.println(oit);
    }
}
