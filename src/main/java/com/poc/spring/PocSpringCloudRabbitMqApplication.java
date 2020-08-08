package com.poc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.poc.spring.topic.OutputChannel;

@SpringBootApplication
@EnableBinding(OutputChannel.class)
public class PocSpringCloudRabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocSpringCloudRabbitMqApplication.class, args);
	}

}
