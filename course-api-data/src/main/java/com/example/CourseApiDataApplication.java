package com.example;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiDataApplication implements CommandLineRunner {

	@Autowired
	private DataSource datasource;
	
	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Schema is : " + datasource);
	}
}
