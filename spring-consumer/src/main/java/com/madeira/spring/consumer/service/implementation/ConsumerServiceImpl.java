package com.madeira.spring.consumer.service.implementation;

import com.madeira.spring.consumer.dto.MessageQueue;
import com.madeira.spring.consumer.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(MessageQueue message) {
        if("teste".equalsIgnoreCase(message.getText())) {
            throw new AmqpRejectAndDontRequeueException("erro");
        }

        System.out.println(message.getText());
    }
}
