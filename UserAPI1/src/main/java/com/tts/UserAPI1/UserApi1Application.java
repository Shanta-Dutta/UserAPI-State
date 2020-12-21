package com.tts.UserAPI1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.tts"})
public class UserApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(UserApi1Application.class, args);
	}

}
