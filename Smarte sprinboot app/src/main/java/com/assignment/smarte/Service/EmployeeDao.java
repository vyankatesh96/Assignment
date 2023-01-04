package com.assignment.smarte.Service;

import com.assignment.smarte.entities.Employee;
import com.assignment.smarte.entities.Employee2;

import java.util.List;

public interface EmployeeDao {

    public List<Employee2> aboveAge40();
    public List<Employee2>  greaterThan2Lakh();

    public List<Employee2> equalsToMumbai();
}
