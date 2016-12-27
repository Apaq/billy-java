package com.previsto.billy.repository;

import com.previsto.billy.model.Product;
import java.time.LocalDateTime;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.response.DefaultResponseCreator;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.junit.Assert.*;
import org.springframework.test.web.client.RequestMatcher;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;

public class ProductResourceTest extends ResourceTestBase<Product> {

    public ProductResourceTest() {
        super(new ProductResource(buildRestTemplate(), "http://server/Api"));
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(Util.readResourceFromFile("products_single.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(Util.readResourceFromFile("products_list.json"), MediaType.APPLICATION_JSON);
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
    protected RequestMatcher generateExpectedSaveRequest() {
        return jsonPath("$.product.id").value(generateSingularId());
    }

    @Override
    protected void doCheckEntity(Product entity) {
        if ("ksSgZEGPQmGohQ9eWxVOoQ".equals(entity.getId())) {
            assertEquals("WC_PREVISTO", entity.getProductNo());
            return;
        }

        
        throw new RuntimeException("Unexpected entity [id=" + entity.getId() + "]");
    }

}
