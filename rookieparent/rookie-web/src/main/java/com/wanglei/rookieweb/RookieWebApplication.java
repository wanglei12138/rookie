package com.wanglei.rookieweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.wanglei")
public class RookieWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RookieWebApplication.class, args);
	}
}
