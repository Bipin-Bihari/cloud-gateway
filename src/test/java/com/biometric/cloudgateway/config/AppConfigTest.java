package com.biometric.cloudgateway.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AppConfigTest {

    @InjectMocks
    private AppConfig appConfig;

    @Test
    void testTemplateBeanCreation() {
        // Call the template() method to retrieve the RestTemplate bean
        RestTemplate restTemplate = appConfig.template();

        // Assert that the returned RestTemplate instance is not null
        assertNotNull(restTemplate);
    }

}
