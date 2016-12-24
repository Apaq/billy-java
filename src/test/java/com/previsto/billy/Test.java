package com.previsto.billy;

import com.previsto.billy.model.Contact;
import com.previsto.billy.model.Invoice;
import com.previsto.billy.model.InvoiceLine;
import com.previsto.billy.model.enums.ContactType;
import com.previsto.billy.model.enums.DiscountMode;

public class Test {

    public static void main(String[] args) {
        
        BillyClient client = new BillyClient("66d361eea7c89d4f9c4d56ef66b7e9bce20784e7", "https://api.billysbilling.com/v2");
        
        
        //Page<Contact> contacts = client.getContactResource().findAll(new PageRequest(0, 2));
        Contact contact = new Contact(ContactType.Company, "Apaq", "DK");
        contact.setSupplier(true);
        
        // Create
        contact = client.getContactResource().save(contact);
        // Update
        contact = client.getContactResource().save(contact);
                //client.getContactResource().get("X1rMtELASOi9K5bJvkmXZQ");
        System.out.println(contact);
        
        
        Invoice invoice = new Invoice();
        invoice.setContactId(contact.getId());
        invoice.setCurrencyId("DKK");
        InvoiceLine line = new InvoiceLine();
        line.setAmount(200);
        line.setDescription("Test");
        line.setDiscountValue(200);
        line.setDiscountMode(DiscountMode.CashDiscount);
        invoice.getLines().add(line);
        invoice = client.getInvoiceResource().save(invoice);
        invoice = client.getInvoiceResource().save(invoice);
        System.out.println(invoice);
        client.getInvoiceResource().delete(invoice);
        client.getContactResource().delete(contact);
        
    }
}
