package com.poc.spring.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import com.poc.spring.topic.DemoTopic;

@Component
@EnableBinding(DemoStreamController.DemoStream.class)
public class DemoStreamController {

	interface DemoStream {

		@Input(DemoTopic.INPUT)
		MessageChannel messageSend();

	}

}
