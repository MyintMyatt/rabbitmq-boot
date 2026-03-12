package com.orion.boot_rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MQConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void listen(String msg){
        System.out.printf("Received message : { %s }%n", msg);
    }
}
