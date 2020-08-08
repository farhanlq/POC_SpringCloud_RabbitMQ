package com.poc.spring.topic;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

import com.poc.spring.topic.EmployeeTopic;

public interface EmployeeRegistrationSource {
	
	@Output(EmployeeTopic.TOPIC)
	MessageChannel employeeRegistration();

}
