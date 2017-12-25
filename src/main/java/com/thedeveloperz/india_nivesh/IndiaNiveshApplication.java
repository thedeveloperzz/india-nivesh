package com.thedeveloperz.india_nivesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("com.thedeveloperz.india_nivesh")
@EnableJpaRepositories("com.thedeveloperz.india_nivesh.repository")
public class IndiaNiveshApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndiaNiveshApplication.class, args);
	}
}
