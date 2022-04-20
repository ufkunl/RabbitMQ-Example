package com.ufkunl.rabbitmqexample.rabbitmq;

import com.ufkunl.rabbitmqexample.model.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @Value("${rabbitmq.queue}")
    private String employeeQueue;

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void handleProcess(Employee employee) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Send email to -> " + employee.getEmail());
    }

}
