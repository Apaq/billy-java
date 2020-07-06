package dk.apaq.billy.repository;

import dk.apaq.billy.model.BankPayment;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class BankPaymentResourceTest extends ResourceTestBase<BankPayment> {

    public BankPaymentResourceTest() {
        super(new BankPaymentResource(buildRestTemplate(), "http://server/Api"), BankPayment.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("bankPayments_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("bankPayments_list.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected String generateExpectedGetQueryParams() {
        return "";
    }

    @Override
    protected String generateSingularId() {
        return "ksSgZEGPQmGohQ9eWxVOoQ";
    }

    @Override
    protected List<RequestMatcher> generateExpectedSaveRequest() {
        return Arrays.asList(new RequestMatcher[]{});
    }
    

    @Override
    protected void doCheckEntity(BankPayment entity) {
        if ("IlJRiEaWTHWjC3Qcq7gvLQ".equals(entity.getId())) {
            assertEquals("SwPeX7U1T2WWkaNxv0wBEw", entity.getCashAccountId());
            return;
        }

        
        throw new RuntimeException("Unexpected entity [id=" + entity.getId() + "]");
    }

}
