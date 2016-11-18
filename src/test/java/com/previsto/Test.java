package com.previsto;

public class Test {

    public static void main(String[] args) {
        
        BillyClient client = new BillyClient("6082ebbc-0447-4c62-adcf-cd77ebe14ada", "https://test.xena.biz/Api");
        
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
                
        //OrderInvoiceTransaction oit = client.getOrderInvoiceTransactionResource().get(11085154);
        //System.out.println(oit);
    }
}
