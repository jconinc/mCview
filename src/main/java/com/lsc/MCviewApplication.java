package com.lsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.lsc"} )
public class MCviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MCviewApplication.class, args);
	}

}
