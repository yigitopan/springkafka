package com.example.kafkaspring;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics="exampleTopic",groupId="group1")
    public void listenMessage(String message) {
        System.out.println(message);
    }
}

