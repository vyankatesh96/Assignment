package com.assignment.smarte.entities;


import lombok.Data;
import org.hibernate.engine.internal.Cascade;


import javax.persistence.*;


@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    private String userName;

    private String password;

    private int age;

    private double ctc;

    private String joiningDate;

    private String status;

    private String city;

    private String state;

    private String country;

    private int pincode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "depId")
    private Department department;
}