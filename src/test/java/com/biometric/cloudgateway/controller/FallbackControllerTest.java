package com.biometric.cloudgateway.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@WebFluxTest(FallbackController.class)
class FallbackControllerTest {

    @MockBean
    private FallbackController fallbackController;

    private WebTestClient webTestClient;

    @BeforeEach
    public void setUp() {
        webTestClient = WebTestClient.bindToController(fallbackController).build();
    }

    @Test
    void testBiometricServiceFallback() {
        when(fallbackController.biometricServiceFallback()).thenReturn(Mono.just("Biometric Service is taking too long to respond or is down. Please try again later"));

        webTestClient.get()
                .uri("/biometricFallback")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .isEqualTo("Biometric Service is taking too long to respond or is down. Please try again later");
    }

    @Test
    void testAttendanceServiceFallback() {
        when(fallbackController.attendanceServiceFallback()).thenReturn(Mono.just("Attendance Service is taking too long to respond or is down. Please try again later"));

        webTestClient.get()
                .uri("/attendanceFallback")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .isEqualTo("Attendance Service is taking too long to respond or is down. Please try again later");
    }

    @Test
    void testAuthorizationServiceFallback() {
        when(fallbackController.authorizationServiceFallback()).thenReturn(Mono.just("Authorization Service is taking too long to respond or is down. Please try again later"));

        webTestClient.get()
                .uri("/authorizationFallback")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .isEqualTo("Authorization Service is taking too long to respond or is down. Please try again later");
    }
}
