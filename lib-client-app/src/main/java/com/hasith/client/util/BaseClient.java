package com.hasith.client.util;

import org.springframework.web.client.RestTemplate;

/**
 * Created by hasith on 7/1/2017.
 */
public abstract class BaseClient {
    private RestTemplate restTemplate = new RestTemplate();
    protected static final String BASE_URL = "http://localhost:2222";

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
}
