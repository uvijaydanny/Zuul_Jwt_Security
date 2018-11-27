package com.microservices.zuul.securityapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//Zuul(SecurityApiGateway) -- Gallery-service -- Auth-Service
//Auth-service generates token and gives it to Zuul
//Gallery-service needs to be authorized using Bearer token to be able to receive data

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SecurityapigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityapigatewayApplication.class, args);
	}
}
