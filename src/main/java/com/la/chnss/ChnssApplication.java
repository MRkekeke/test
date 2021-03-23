package com.la.chnss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ChnssApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChnssApplication.class, args);
	}

}
