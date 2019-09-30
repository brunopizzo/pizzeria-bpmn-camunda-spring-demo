package com.gedois.demobpmn;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableProcessApplication
public class DemobpmnApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemobpmnApplication.class, args);
	}

}
