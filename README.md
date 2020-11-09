# Curso RabbitMQ com SpringBoot e Docker
Criar filas automaticamente no RabbitMQ. Produzir e consumir mensagens em uma aplicação Spring Boot.

###  Criar um contêiner RabbirMQ no docker
docker run -d -p 15672:15672 -p 5672:5672 --name rabbitmq rabbitmq:3-management