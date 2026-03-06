# Kafka Demo - Spring Boot

Demo de **Spring Boot** con **Kafka** para enviar y recibir mensajes.

---

## ⚡ Requisitos

- Java 17
- Maven
- Docker y Docker Compose
- Spring Boot 3.5.11
- Kafka 7.9.0 (con Docker Compose)

---
## Levantar todo:

docker-compose up -d

## 🚀 Ejecutar la aplicación

mvn spring-boot:run

## 📨 Endpoints de prueba

## 1️⃣ Enviar mensaje como String:

POST http://localhost:8080/api/v1

```Body: "Hola, este es un mensaje de prueba"```

## 2️⃣ Enviar mensaje como JSON (Student):

POST http://localhost:8080/api/v1/json
``` Body:
{
    "id":1,
    "firstname":"nestor",
    "lastname":"Amichetti"
}

