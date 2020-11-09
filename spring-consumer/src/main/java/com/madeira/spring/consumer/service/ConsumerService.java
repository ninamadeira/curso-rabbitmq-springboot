package com.madeira.spring.consumer.service;

import com.madeira.spring.consumer.dto.MessageQueue;

public interface ConsumerService {

    void action(MessageQueue message);

}