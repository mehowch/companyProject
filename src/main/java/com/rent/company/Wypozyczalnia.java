package com.rent.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Wypozyczalnia {

    private String nazwa;
    private int internetDomain;
    private String address;
    private String wlasciciel;
    private int logotyp;
    private List<Department> departmentList;
}
