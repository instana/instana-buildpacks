package com.instana.cnb.demo.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		final SpringApplication app = new SpringApplication(DemoApplication.class);

		app.setDefaultProperties(Collections.singletonMap("server.port", System.getenv().getOrDefault("PORT", "8080")));

		app.run(args);
	}

	@RestController
	static class Api {

		@GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
		public String sayHello() {
			return "hello, world";
		}

	}

}
