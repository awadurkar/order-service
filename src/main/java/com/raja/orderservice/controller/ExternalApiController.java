package com.raja.orderservice.controller;

import com.raja.orderservice.client.MockApiClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/external-api")
public class ExternalApiController {

    private final MockApiClient mockApiClient;

    public ExternalApiController(MockApiClient mockApiClient) {
        this.mockApiClient = mockApiClient;
    }

    @GetMapping("/ping")
    public String ping() {
        return mockApiClient.ping();
    }
}