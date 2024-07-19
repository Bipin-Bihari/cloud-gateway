package com.biometric.cloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/biometricFallback")
    public Mono<String> biometricServiceFallback(){
        return Mono.just("Biometric Service is taking too long to respond or is down. Please try again later");
    }

    @RequestMapping("/attendanceFallback")
    public Mono<String> attendanceServiceFallback(){
        return Mono.just("Attendance Service is taking too long to respond or is down. Please try again later");
    }

    @RequestMapping("/authorizationFallback")
    public Mono<String> authorizationServiceFallback(){
        return Mono.just("Authorization Service is taking too long to respond or is down. Please try again later");
    }
}
