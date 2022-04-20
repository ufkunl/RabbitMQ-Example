package com.ufkunl.rabbitmqexample.service;

import com.ufkunl.rabbitmqexample.model.Employee;
import com.ufkunl.rabbitmqexample.rabbitmq.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private ProducerService producerService;

    public String sendMailToEmployeeList(List<Employee> employeeList){
        employeeList.forEach(employee -> producerService.send(employee));
        return "Success";
    }

}
