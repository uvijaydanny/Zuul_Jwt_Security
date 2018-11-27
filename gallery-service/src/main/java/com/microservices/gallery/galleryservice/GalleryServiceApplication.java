package com.microservices.gallery.galleryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//Zuul(SecurityApiGateway) -- Gallery-service -- Auth-Service
//Auth-service generates token and gives it to Zuul
//Gallery-service needs to be authorized using Bearer token to be able to receive data

@SpringBootApplication
@EnableDiscoveryClient
public class GalleryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleryServiceApplication.class, args);
	}
}
