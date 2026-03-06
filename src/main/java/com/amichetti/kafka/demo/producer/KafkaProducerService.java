package com.amichetti.kafka.demo.producer;

import com.amichetti.kafka.demo.payload.Student;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import static com.amichetti.kafka.demo.util.Util.TOPIC_NAME;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    //Los valores son del key y value de las properties
    private final KafkaTemplate<String,String> kafkaTemplate;
    private static final Logger log = LogManager.getLogger(KafkaProducerService.class);

    public void sendMessage(String message){
        log.info("Sending to "+ TOPIC_NAME+ " "+message);
        kafkaTemplate.send(TOPIC_NAME, message);
    }

    public void sendMessage(Student student){
        Message<Student> message = MessageBuilder
                .withPayload(student)
                .setHeader(KafkaHeaders.TOPIC, TOPIC_NAME)
                .build();

        kafkaTemplate.send(message);
    }
}
