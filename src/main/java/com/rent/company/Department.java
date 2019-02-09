package com.rent.company;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Department {

    private String address;
    private List<Employee> worker;
    private List<Car> availableCars;


}
