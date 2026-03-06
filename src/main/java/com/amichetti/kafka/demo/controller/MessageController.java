package com.amichetti.kafka.demo.controller;

import com.amichetti.kafka.demo.payload.Student;
import com.amichetti.kafka.demo.producer.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class MessageController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        kafkaProducerService.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully!");
    }

    @PostMapping("/json")
    public ResponseEntity<String> sendMessage(@RequestBody Student student){
        kafkaProducerService.sendMessage(student);
        return ResponseEntity.ok("Message queued successfully as JSON!");
    }
}
