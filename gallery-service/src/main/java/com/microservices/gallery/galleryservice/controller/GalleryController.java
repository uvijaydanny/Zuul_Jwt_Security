package com.microservices.gallery.galleryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gallery")
public class GalleryController {

	@GetMapping("/img")
	public String justMessage(){
		return "received data";
	}
}
