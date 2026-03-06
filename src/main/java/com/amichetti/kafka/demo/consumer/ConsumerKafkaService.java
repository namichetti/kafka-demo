package com.amichetti.kafka.demo.consumer;

import com.amichetti.kafka.demo.payload.Student;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.amichetti.kafka.demo.util.Util.TOPIC_NAME;

@RequiredArgsConstructor
@Service
public class ConsumerKafkaService {

    private static final Logger log = LogManager.getLogger(ConsumerKafkaService.class);

    //@KafkaListener(topics=TOPIC_NAME, groupId = "myGroup")
    public void consumerMessage(String message){
        log.info("Consumer Message from "+ TOPIC_NAME + " message "+message);
    }

    @KafkaListener(topics=TOPIC_NAME, groupId = "myGroup")
    public void consumerMessage(Student student){
        log.info("Consumer Message from "+ TOPIC_NAME + " message "+student.toString());
    }


}
