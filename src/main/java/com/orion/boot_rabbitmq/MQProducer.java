package com.orion.boot_rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MQProducer {

    @Autowired
    private RabbitTemplate template;

    public void sendMessage(String msg){
        template.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, "routing.key", msg);
    }
}
