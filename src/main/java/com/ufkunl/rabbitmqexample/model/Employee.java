package com.ufkunl.rabbitmqexample.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class Employee implements Serializable {

    private String name;
    private String surname;
    private String email;

}
