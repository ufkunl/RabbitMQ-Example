package com.ufkunl.rabbitmqexample.controller;

import com.ufkunl.rabbitmqexample.service.EmployeeService;
import com.ufkunl.rabbitmqexample.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/employee")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/list")
    public ResponseEntity<String> producer(@RequestBody List<Employee> employeeList){
        return ResponseEntity.ok(employeeService.sendMailToEmployeeList(employeeList));
    }

}
