package dk.apaq.billy.repository;

import dk.apaq.billy.model.ContactPerson;
import dk.apaq.billy.model.Organization;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.response.DefaultResponseCreator;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.junit.Assert.*;
import org.springframework.test.web.client.RequestMatcher;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;

public class OrganizationResourceTest extends ResourceTestBase<Organization> {

    public OrganizationResourceTest() {
        super(new OrganizationResource(buildRestTemplate(), "http://server/Api", null), Organization.class);
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("organizations_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("organizations_list.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected String generateExpectedGetQueryParams() {
        return "";
    }

    @Override
    protected String generateSingularId() {
        return "07WgjDjARrWDUR0FAqEVEg";
    }
    
    @Override
    protected List<RequestMatcher> generateExpectedSaveRequest() {
        return Arrays.asList(new RequestMatcher[]{jsonPath("$.organization.logoUrl").doesNotExist()});
    }

    @Override
    protected void doCheckEntity(Organization entity) {
        if ("07WgjDjARrWDUR0FAqEVEg".equals(entity.getId())) {
            assertEquals(LocalDateTime.parse("2016-11-12T13:28:50"), entity.getCreatedTime());
            return;
        }

       throw new RuntimeException("Unexpected entity [id=" + entity.getId() + "]");
    }

    @Test
    public void testGetCurrent() {
        // Arrange
        System.out.println("getCurrent");
        mockServer.expect(requestTo(resource.serviceUrl + "/organization")).andExpect(method(HttpMethod.GET))
                .andRespond(generateExpectedGetResponse());

        // Act
        Organization org = ((OrganizationResource) resource).getCurrent();

        // Assert
        assertNotNull(org);
        mockServer.verify();
    }

    @Test
    public void testGetCurrentWithId() {
        // Arrange
        System.out.println("getCurrent");
        resource.organizationId = "123";
        mockServer.expect(requestTo(resource.serviceUrl + "/organizations/123")).andExpect(method(HttpMethod.GET))
                .andRespond(generateExpectedGetResponse());

        // Act
        Organization org = ((OrganizationResource) resource).getCurrent();

        // Assert
        assertNotNull(org);
        mockServer.verify();
    }
}
