package com.poc.spring.controller;


import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.spring.topic.OutputChannel;


@RestController
@RequestMapping("/api")
public class MessageController {

	
	private OutputChannel messageChannel;
	
	@RequestMapping("/sendMessage/{message}")
	public String sendMessage(@PathVariable("message") String message) {
		Message<String> msg = MessageBuilder.withPayload(message).build();
		messageChannel.output().send(msg);
		return "Message "+message+" sent to the subscribers";
		
	}
}
