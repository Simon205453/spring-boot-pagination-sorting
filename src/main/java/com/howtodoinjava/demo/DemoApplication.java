package com.howtodoinjava.demo;

import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	public CommandLineRunner importData(EmployeeRepository employeeRepository) {
		return (args) -> {

			/**
			 *  Save a few customers
			 */
			final List<EmployeeEntity> customers = new ArrayList<>();
			customers.add(new EmployeeEntity("Jack", "Bauer", "asdfasdf@mails.com"));
			customers.add(new EmployeeEntity("Kim", "Johnson", "karsedrengen@mailers.dk"));
			customers.add(new EmployeeEntity("David", "Palmer", "bybumsen@by.dk"));
			customers.add(new EmployeeEntity("Michelle", "Dessler", "imangelpåbedre@ting.ting"));
			employeeRepository.saveAll(customers);

			log.info("Data import done");

		};
	}
}