package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
//import java.net.http.HttpRequest;

import static java.lang.management.ManagementFactory.getOperatingSystemMXBean;

@SpringBootApplication
public class SpringExperimentalApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringExperimentalApplication.class, args);
	}

}
