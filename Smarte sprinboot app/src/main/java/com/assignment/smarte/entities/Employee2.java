package com.assignment.smarte.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    private String userName;


    private String password;

    private int age;

    private double ctc;

    private String joiningDate;

   private String status;

    private String department;


    private String city;


    public Employee2(int empId, String userName, String password, int age, double ctc, String joiningDate, String status, String department, String city) {
        this.empId = empId;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.ctc = ctc;
        this.joiningDate = joiningDate;
        this.status = status;
        this.department = department;
        this.city = city;
    }

    public Employee2() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCtc() {
        return ctc;
    }

    public void setCtc(double ctc) {
        this.ctc = ctc;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "empId=" + empId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", ctc=" + ctc +
                ", joiningDate='" + joiningDate + '\'' +
                ", status='" + status + '\'' +
                ", department=" + department +
                ", city='" + city + '\'' +
                '}';
    }
}
