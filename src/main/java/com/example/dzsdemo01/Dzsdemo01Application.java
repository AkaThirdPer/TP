package com.example.dzsdemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Dzsdemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Dzsdemo01Application.class, args);
	}

}
