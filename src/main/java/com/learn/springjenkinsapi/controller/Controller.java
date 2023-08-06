package com.learn.springjenkinsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String runImage() {
		return "docker image created and running....";
	}

}
