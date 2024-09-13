package dev.example.service;

import dev.example.DTO.OrderDTO;
import dev.example.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
public class ProductMessageListener {

    @RabbitListener(queues = RabbitMQConfig.ORDER_QUEUE)
    public void receiveOrderMessage(OrderDTO orderDTO) {
        System.out.println("Order received: " + orderDTO);
        // Stoğu güncelle veya başka işlemleri yap
    }
}
