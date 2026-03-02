package com.kafkadelivery.service;

import com.kafkadelivery.config.AppConstrants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean producerUpdatingLocation(String location){
        try {
            kafkaTemplate.send(AppConstrants.TOPIC_NAME, location).get();
            System.out.println("Message sent successfully: " + location);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
