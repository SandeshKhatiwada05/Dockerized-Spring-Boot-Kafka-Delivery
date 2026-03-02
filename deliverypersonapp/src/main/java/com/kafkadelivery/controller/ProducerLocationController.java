package com.kafkadelivery.controller;

import com.kafkadelivery.service.KafkaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")

public class ProducerLocationController {
    private KafkaService kafkaService;

    public ProducerLocationController(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
        this.kafkaService.producerUpdatingLocation("(" + Math.round(Math.random()*100) +","+ Math.round(Math.random()*100) +")");
        return ResponseEntity.ok("Location updated successfully");
    }


}
