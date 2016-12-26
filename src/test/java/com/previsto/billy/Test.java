package com.previsto.billy;

import com.previsto.billy.model.Account;
import com.previsto.billy.model.Contact;
import com.previsto.billy.model.Invoice;
import com.previsto.billy.model.InvoiceLine;
import com.previsto.billy.model.Organization;
import com.previsto.billy.model.Product;
import com.previsto.billy.model.enums.ContactType;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        
        BillyClient client = new BillyClient("66d361eea7c89d4f9c4d56ef66b7e9bce20784e7", "https://api.billysbilling.com/v2");
        
        Organization org = client.getOrganizationResource().getCurrent();
        
        //Page<Contact> contacts = client.getContactResource().findAll(new PageRequest(0, 2));
        Contact contact = new Contact(ContactType.Company, "Apaq", "DK");
        contact.setSupplier(true);
        
        // Create
        contact = client.getContactResource().save(contact);
        // Update
        contact = client.getContactResource().save(contact);
                //client.getContactResource().get("X1rMtELASOi9K5bJvkmXZQ");
        System.out.println(contact);
        
        Account account = null;
        List<Account> accounts = client.getAccountResource().findAll();
        for(Account current : accounts) {
            if(current.getNatureId().equals("revenue") && current.getAccountNo() == 1110) {
                account = current;
                break;
            }
            
            if(current.getNatureId().equals("revenue")) {
                account = current;
            }
        }
        Product product = new Product();
        product.setName("Vinduespolering");
        product.setProductNo("WC_PREVISTO");
        product.setAccountId(account.getId());
        product = client.getProductResource().save(product);
        
        Invoice invoice = new Invoice();
        invoice.setContactId(contact.getId());
        invoice.setCurrencyId("DKK");
        InvoiceLine line = new InvoiceLine();
        line.setUnitPrice(200);
        line.setDescription("Test");
        //line.setDiscountValue(0);
        //line.setDiscountMode(DiscountMode.PercentageDiscount);
        line.setProductId(product.getId());
        invoice.getLines().add(line);
        invoice = client.getInvoiceResource().save(invoice);
        invoice = client.getInvoiceResource().save(invoice);
        System.out.println(invoice);
        //client.getInvoiceResource().delete(invoice);
        //client.getContactResource().delete(contact);
        
    }
}
