# Spring Boot Kafka Delivery System

This project demonstrates a simple Kafka-based delivery system using Spring Boot.  
It includes:

- A **Producer** sending location updates to Kafka.
- A **Consumer** receiving messages from Kafka.
- Kafka running inside Docker on Ubuntu.

## Features

- Kafka in **KRaft mode** (no Zookeeper required)
- Spring Boot integration with `KafkaTemplate` and `@KafkaListener`
- Fully working example for producing and consuming messages
- Includes a detailed guide: [kafka guide.pdf] for setup and troubleshooting

## Getting Started

### 1. Kafka Docker Setup

Follow `kafka guide.pdf` to run Kafka inside Docker on Ubuntu. Ensure the advertised listener is set to the Docker host IP so that Spring Boot can connect.


spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer

spring.kafka.consumer.group-id=delivery-consumer-group
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
