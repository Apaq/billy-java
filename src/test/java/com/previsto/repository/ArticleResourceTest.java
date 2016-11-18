package com.previsto.repository;

import com.previsto.repository.Resource;
import com.previsto.model.Article;
import java.time.Instant;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.response.DefaultResponseCreator;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.junit.Assert.*;
import org.springframework.test.web.client.RequestMatcher;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;

public class ArticleResourceTest extends ResourceTestBase<Article> {

    public ArticleResourceTest() {
        super(new Resource<>(Article.class, "Article", buildRestTemplate(), "http://server/Api"));
    }

    @Override
    protected DefaultResponseCreator generateExpectedGetResponse() {
        return withSuccess(readResourceFromFile("article_42.json"), MediaType.APPLICATION_JSON);
    }

    @Override
    protected DefaultResponseCreator generateExpectedFindAllResponse() {
        return withSuccess(readResourceFromFile("article_list.json"), MediaType.APPLICATION_JSON);
    }
    
    

    protected RequestMatcher generateExpectedSaveRequest() {
        return jsonPath("$.Id").value(42);
    }

    @Override
    protected void doCheckEntity(Article entity) {
        if (entity.getId() == 42) {
            assertEquals(1, entity.getVersion());
            assertEquals(false, entity.isDeactivated());
            assertEquals(10926, entity.getFiscalSetupId());
            assertEquals(Instant.parse("2016-02-05T08:38:00Z"), entity.getCreatedAt());
            assertEquals(11025766, (long) entity.getCreatedBy());
            return;
        }

        if (entity.getId() == 43) {
            assertEquals(3, entity.getVersion());
            assertEquals(false, entity.isDeactivated());
            assertEquals(10926, entity.getFiscalSetupId());
            assertEquals(Instant.parse("2016-02-05T08:14:56Z"), entity.getCreatedAt());
            assertNull(entity.getCreatedBy());
            return;
        }

        throw new RuntimeException("Unexpected article entity [id=" + entity.getId() + "]");
    }

}
