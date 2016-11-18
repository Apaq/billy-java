package com.previsto.repository;

import com.previsto.model.OrderInvoiceTransaction;
import org.springframework.web.client.RestTemplate;

public class OrderInvoiceTransactionResource extends Resource<OrderInvoiceTransaction> {
    
    public OrderInvoiceTransactionResource(RestTemplate restTemplate, String fiscalUrl) {
        super(OrderInvoiceTransaction.class, "OrderInvoiceTransaction", restTemplate, fiscalUrl);
    }
    
    public void requestPayment(long orderInvoiceTransactionId, long subscriptionTicketId) {
        String url = fiscalUrl + resolveServicePath(orderInvoiceTransactionId) + "/RequestPayment/" + subscriptionTicketId;
        restTemplate.put(url, null);
    }
}
