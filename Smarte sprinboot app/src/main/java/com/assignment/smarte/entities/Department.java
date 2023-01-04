package com.assignment.smarte.entities;

import javax.persistence.*;

import lombok.Data;



@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int depId;

    private String deptName;

    private String region;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
//    private List<Employee> employee;

}
