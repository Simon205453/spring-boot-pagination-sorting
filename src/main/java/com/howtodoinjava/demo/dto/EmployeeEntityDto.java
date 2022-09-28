package com.howtodoinjava.demo.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class EmployeeEntityDto implements Serializable {
    private final Long id;
    private final String firstName;
    private final String lastName;
}
