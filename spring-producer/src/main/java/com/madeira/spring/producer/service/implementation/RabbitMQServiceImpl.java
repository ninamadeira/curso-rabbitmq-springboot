package com.madeira.spring.producer.service.implementation;

import com.madeira.spring.producer.amqp.AmqpProducer;
import com.madeira.spring.producer.dto.MessageQueue;
import com.madeira.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements AmqpService {

    @Autowired
    private AmqpProducer<MessageQueue> amqp;

    @Override
    public void sendToConsumer(MessageQueue message) {
        amqp.producer(message);
    }
}