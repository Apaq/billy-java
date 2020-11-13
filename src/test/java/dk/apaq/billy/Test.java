package dk.apaq.billy;

import dk.apaq.billy.model.Contact;
import dk.apaq.billy.model.Organization;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class Test {

    public static void main(String[] args) {
        
        BillyClient client = new BillyClient("40ef845e70e0c417cc184efd915e8d36bebf9ced", "https://api.billysbilling.com/v2", true   );

        Organization org = client.getOrganizationResource().getCurrent();
        
        Page<Contact> contacts = client.getContactResource().findAll(PageRequest.of(192, 100));
        System.out.println(contacts.getContent().get(0).getCreatedTime());
        System.out.println(contacts.getContent().get(0).getName());
        System.out.println(contacts.getTotalElements());
        /*Contact contact = new Contact(ContactType.Company, "Apaq", "DK");
        contact.setSupplier(true);
        contact = client.getContactResource().save(contact);
        
        System.out.println(contact);
        
        Product product = new Product();
        product.setName("Vinduespolering");
        product.setProductNo("TEST_CODE5");
        product.setAccountId(org.getDefaultSalesAccountId());
        //product.setSalesTaxRulesetId(org.getDefaultSalesTaxRulesetId());
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
        
        //client.getInvoiceResource().approve(invoice.getId());
        
        Invoice invoice2 = new Invoice();
        invoice2.setContactId(contact.getId());
        invoice2.setCurrencyId("DKK");
        line = new InvoiceLine();
        line.setUnitPrice(200);
        line.setDescription("Test");
        //line.setDiscountValue(0);
        //line.setDiscountMode(DiscountMode.PercentageDiscount);
        line.setProductId(product.getId());
        invoice2.getLines().add(line);
        invoice2 = client.getInvoiceResource().save(invoice2);
        invoice2 = client.getInvoiceResource().save(invoice2);
        System.out.println(invoice);
        
        //client.getInvoiceResource().approve(invoice2.getId());

        client.getInvoiceResource().approve(invoice2.getId());


        BankPayment payment = new BankPayment();
        payment.setContactId(invoice2.getContactId());
        payment.setEntryDate(LocalDate.now());
        payment.setSubjectCurrencyId("DKK");
        payment.setCashSide(CashSide.Debit);
        payment.setCashAmount(200);
        payment.setCashAccountId(org.getDefaultBillBankAccountId());
        payment.getAssociations().add(new Association("invoice:" + invoice2.getId()));
        client.getBankPaymentResource().save(payment);

        invoice2 = client.getInvoiceResource().get(invoice2.getId());

        client.getInvoiceResource().delete(invoice);
        client.getInvoiceResource().delete(invoice2);
        client.getContactResource().delete(contact);
        client.getProductResource().delete(product);*/
        
    }
}