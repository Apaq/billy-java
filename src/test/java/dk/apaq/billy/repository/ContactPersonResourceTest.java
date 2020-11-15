package dk.apaq.billy.repository;

import dk.apaq.billy.model.ContactPerson;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.client.response.DefaultResponseCreator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class ContactPersonResourceTest extends ResourceTestBase<ContactPerson> {

    public ContactPersonResourceTest() {
        super(new ContactPersonResource(buildRestTemplate(), "http://server/Api", null), ContactPerson.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("contactPersons_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("contactPersons_list.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected String generateExpectedGetQueryParams() {
        return "";
    }

    @Override
    protected String generateSingularId() {
        return "xv1MBXjMQvmwdRcWvqze3A";
    }

    @Override
    protected ContactPerson generatePersistenceEntity() throws ReflectiveOperationException {
        ContactPerson cp = new ContactPerson();
        cp.setContactId("cp_id");
        cp.setName("name");
        cp.setEmail("email");
        return cp;
    }

    @Override
    protected List<RequestMatcher> generateExpectedSaveRequest() {
        List<RequestMatcher> matchers = new ArrayList<>();
        matchers.add(jsonPath("$.contactPerson.name").isString());
        matchers.add(jsonPath("$.contactPerson.email").isString());
        matchers.add(jsonPath("$.contactPerson.contactId").isString());
        matchers.add(jsonPath("$.contactPerson.id").doesNotExist());
        return matchers;
    }

    @Override
    protected void doCheckEntity(ContactPerson entity) {
        if ("xv1MBXjMQvmwdRcWvqze3A".equals(entity.getId())) {
            assertEquals("Brian Philip", entity.getName());
            return;
        }

        if ("zTW5wbnbTAi0im12veoEDg".equals(entity.getId())) {
            assertEquals("Michael Krog", entity.getName());
            return;
        }

        throw new RuntimeException("Unexpected contact entity [id=" + entity.getId() + "]");
    }

}
