package com.previsto.billy.net;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.AbstractClientHttpResponse;
import org.springframework.http.client.ClientHttpResponse;

public class ResultAdapterResponse extends AbstractClientHttpResponse {

    private static final JsonFactory JSON_FACTORY = new JsonFactory();
    private static final List<String> ENTITY_FIELDS = Arrays.asList(new String[]{
        "contact", "contacts", "invoice", "invoices"
    });
    private static final String CITIES_FIELD = "cities";
    private static final String META_FIELD = "meta";

    private final ClientHttpResponse wrappedResponse;
    private final HttpHeaders headers;
    private final ByteArrayOutputStream storage = new ByteArrayOutputStream();

    public ResultAdapterResponse(ClientHttpResponse wrappedResponse) throws IOException {
        this.wrappedResponse = wrappedResponse;
        this.headers = wrappedResponse.getHeaders();

        JsonParser jParser = JSON_FACTORY.createParser(wrappedResponse.getBody());
        JsonGenerator jGenerator = JSON_FACTORY.createGenerator(storage);

        Map<String, String> cityMap = new HashMap<>();

        while (jParser.nextToken() != JsonToken.END_OBJECT) {
            String fieldname = jParser.getCurrentName();
            matchMeta(fieldname, jParser);
            matchCities(fieldname, jParser, cityMap);

            if (ENTITY_FIELDS.contains(fieldname)) {
                jParser.nextToken();
                jGenerator.copyCurrentStructure(jParser);
            }
        }
        jGenerator.flush();
    }

    private void matchMeta(String fieldname, JsonParser jParser) throws IOException {
        if (META_FIELD.equals(fieldname)) {
            jParser.nextToken();
            if (jParser.getCurrentToken() == JsonToken.START_OBJECT) {
                while (jParser.nextToken() != JsonToken.END_OBJECT) {

                }
            }
        }
    }

    private void matchCities(String fieldname, JsonParser jParser, Map<String, String> cityMap) throws IOException {
        if (CITIES_FIELD.equals(fieldname)) {
            jParser.nextToken();
            if (jParser.getCurrentToken() == JsonToken.START_ARRAY) {
                jParser.nextToken();
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
                    if (jParser.getCurrentToken() == JsonToken.START_OBJECT) {
                        String id = null;
                        String city = null;
                        while (jParser.nextToken() != JsonToken.END_OBJECT) {
                            jParser.nextToken();
                            fieldname = jParser.getCurrentName();
                            if ("id".equals(fieldname)) {
                                id = jParser.getText();
                            }
                            if ("name".equals(fieldname)) {
                                city = jParser.getText();
                            }

                        }

                        if (id != null) {
                            cityMap.put(id, city);
                        }
                    }
                }
            }
        }
    }

    @Override
    public int getRawStatusCode() throws IOException {
        return wrappedResponse.getRawStatusCode();
    }

    @Override
    public String getStatusText() throws IOException {
        return wrappedResponse.getStatusText();
    }

    @Override
    public void close() {
        wrappedResponse.close();
    }

    @Override
    public InputStream getBody() throws IOException {
        return new ByteArrayInputStream(storage.toByteArray());
    }

    @Override
    public HttpHeaders getHeaders() {
        return headers;
    }

}
