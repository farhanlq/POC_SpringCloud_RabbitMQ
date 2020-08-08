package com.poc.spring.topic;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

import com.poc.spring.topic.MessageTopic;

public interface OutputChannel {
	
	@Output(MessageTopic.TOPIC)
	MessageChannel output();

}
