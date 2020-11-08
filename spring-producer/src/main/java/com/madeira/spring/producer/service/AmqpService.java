package com.madeira.spring.producer.service;

import com.madeira.spring.producer.dto.MessageQueue;

public interface AmqpService {
	  void sendToConsumer(MessageQueue message);

}
