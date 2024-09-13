package dev.example.order_service.service;

import dev.example.order_service.DTO.OrderDTO;
import dev.example.order_service.config.RabbitMQConfig;
import dev.example.order_service.model.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderMessageSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendOrderMessage(OrderDTO orderDTO) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.ORDER_QUEUE, orderDTO);
    }
}