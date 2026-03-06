package com.amichetti.kafka.demo.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import static com.amichetti.kafka.demo.util.Util.TOPIC_NAME;


@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myTopic(){
        return TopicBuilder
                .name(TOPIC_NAME)
                .build();
    }

}
