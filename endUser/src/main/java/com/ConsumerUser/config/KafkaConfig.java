package com.ConsumerUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstrants.TOPIC_NAME, groupId = AppConstrants.GROUP_ID)
    public void updatedLocation(String location){

        System.out.println(location);
    }
}


