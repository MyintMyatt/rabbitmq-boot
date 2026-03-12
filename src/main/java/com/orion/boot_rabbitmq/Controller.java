package com.orion.boot_rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private MQProducer producer;

    @GetMapping("send")
    public String sendMessage(@RequestParam(name = "msg") String message) {
        producer.sendMessage(message);
        return "Message sent successfully!!!";
    }
}
