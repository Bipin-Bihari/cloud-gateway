package com.biometric.cloudgateway.filter;

import com.biometric.cloudgateway.util.JwtUtil;
import org.apache.el.stream.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ServerWebExchange;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class AuthenticationFilterTest {
	/*
	 * @Mock private RouteValidator validator;
	 * 
	 * @Mock private RestTemplate restTemplate;
	 * 
	 * @Mock private JwtUtil jwtUtil;
	 * 
	 * @InjectMocks private AuthenticationFilter authenticationFilter;
	 * 
	 * @BeforeEach public void setUp() { MockitoAnnotations.openMocks(this); }
	 * 
	 * @Test public void testFilterAuthorizationHeaderMissing() { ServerWebExchange
	 * exchange = mock(ServerWebExchange.class);
	 * when(exchange.getRequest().getHeaders()).thenReturn(new HttpHeaders());
	 * 
	 * assertThrows(RuntimeException.class, () -> { authenticationFilter.apply(new
	 * AuthenticationFilter.Config()) .filter(exchange,
	 * mock(GatewayFilter.Chain.class)) .block(); // block to ensure completion });
	 * 
	 * verify(validator, never()).isSecured.test(any()); }
	 * 
	 * @Test public void testFilterInvalidToken() { ServerWebExchange exchange =
	 * mock(ServerWebExchange.class); HttpHeaders headers = new HttpHeaders();
	 * headers.add(HttpHeaders.AUTHORIZATION, "Bearer invalidToken");
	 * when(exchange.getRequest().getHeaders()).thenReturn(headers);
	 * when(validator.isSecured.test(any())).thenReturn(true);
	 * when(jwtUtil.validateToken("invalidToken")).thenThrow(new
	 * RuntimeException("Invalid token"));
	 * 
	 * assertThrows(RuntimeException.class, () -> { authenticationFilter.apply(new
	 * AuthenticationFilter.Config()) .filter(exchange,
	 * mock(GatewayFilter.Chain.class)) .block(); // block to ensure completion });
	 * }
	 * 
	 * @Test public void testFilterValidToken() { ServerWebExchange exchange =
	 * mock(ServerWebExchange.class); HttpHeaders headers = new HttpHeaders();
	 * headers.add(HttpHeaders.AUTHORIZATION, "Bearer validToken");
	 * when(exchange.getRequest().getHeaders()).thenReturn(headers);
	 * when(validator.isSecured.test(any())).thenReturn(true);
	 * when(jwtUtil.validateToken("validToken")).thenReturn(true);
	 * 
	 * authenticationFilter.apply(new AuthenticationFilter.Config())
	 * .filter(exchange, mock(GatewayFilter.Chain.class)) .block(); // block to
	 * ensure completion
	 * 
	 * // Add verification/assertions as needed }
	 * 
	 * // Add more test cases to cover other scenarios as needed
	 */}
