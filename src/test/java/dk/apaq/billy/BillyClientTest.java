package dk.apaq.billy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BillyClientTest {

    private BillyClient client;

    @Before
    public void setUp() {
        client = new BillyClient("key", "https://host");
    }

    @Test
    public void testResources() {
        assertNotNull(client.getAccountResource());
        assertNotNull(client.getBankPaymentResource());
        assertNotNull(client.getContactPersonResource());
        assertNotNull(client.getInvoiceResource());
        assertNotNull(client.getContactResource());
        assertNotNull(client.getOrganizationResource());
        assertNotNull(client.getProductResource());
        assertEquals("key", client.getApiKey());
        assertEquals("https://host", client.getServiceUrl());
    }

}