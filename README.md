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

### Kafka Docker Setup

Follow the [kafka guide.pdf](kafka%20guide.pdf) to run Kafka inside Docker on an Ubuntu virtual machine.  
Make sure the advertised listener in Kafka is set to the Docker host IP so your Spring Boot app (running on Windows or elsewhere) can connect properly.
