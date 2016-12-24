package com.previsto.billy.repository;

import com.previsto.billy.model.Contact;
import com.previsto.billy.model.Invoice;
import java.time.LocalDateTime;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.response.DefaultResponseCreator;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.junit.Assert.*;
import org.springframework.test.web.client.RequestMatcher;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;

public class InvoiceResourceTest extends ResourceTestBase<Invoice> {

    public InvoiceResourceTest() {
        super(new InvoiceResource(buildRestTemplate(), "http://server/Api"));
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("invoices_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("invoices_list.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected String generateExpectedGetQueryParams() {
        return "?include=invoice.lines:embed";
    }

    @Override
    protected String generateSingularId() {
        return "cSHBqWWITexZvQy29lqpYg";
    }
    
    @Override
    protected RequestMatcher generateExpectedSaveRequest() {
        return jsonPath("$.invoice.id").value(generateSingularId());
    }

    @Override
    protected void doCheckEntity(Invoice entity) {
        if ("UdsHDvAESV2eCZHSCYOfzA".equals(entity.getId())) {
            assertEquals(LocalDateTime.parse("2016-12-23T08:18:20"), entity.getCreatedTime());
            return;
        }

        if ("cSHBqWWITexZvQy29lqpYg".equals(entity.getId())) {
            assertEquals(LocalDateTime.parse("2016-12-23T08:16:46"), entity.getCreatedTime());
            return;
        }

        if ("o9bpexuzTb25IfEgW7E1Wg".equals(entity.getId())) {
            assertEquals(LocalDateTime.parse("2016-12-23T08:13:48"), entity.getCreatedTime());
            return;
        }
        throw new RuntimeException("Unexpected contact entity [id=" + entity.getId() + "]");
    }

}
