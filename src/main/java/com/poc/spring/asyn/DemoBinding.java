package com.poc.spring.asyn;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface DemoBinding {

	@Output("greetingChannel")
	MessageChannel greeting();
}
