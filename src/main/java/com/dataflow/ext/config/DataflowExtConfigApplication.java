package com.dataflow.ext.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DataflowExtConfigApplication {

	public static void main(String[] args) {

		SpringApplication.run(DataflowExtConfigApplication.class, args);
	}

}
