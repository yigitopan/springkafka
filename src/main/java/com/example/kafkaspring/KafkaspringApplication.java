package com.example.kafkaspring;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaspringApplication {
        public static void main(String[] args) {
            SpringApplication.run(KafkaspringApplication.class, args);
        }

        @Bean
        public ApplicationRunner runner(Publisher p) {
            return args -> {
                p.sendMessage("Hallo Kafka!");
                p.sendMessage("Zweite Nachricht");
            };
        }
}

