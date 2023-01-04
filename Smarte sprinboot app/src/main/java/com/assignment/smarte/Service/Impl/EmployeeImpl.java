package com.assignment.smarte.Service.Impl;


import com.assignment.smarte.Service.EmployeeDao;
import com.assignment.smarte.entities.Employee;
import com.assignment.smarte.entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl implements EmployeeDao {


    private static List<Employee2> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee2(1, "abc", "1234", 50, 2, "01/12/2022", "active",  "Associate Software Engineer", "Mumbai"));
        employeeList.add(new Employee2(2, "abc", "1234", 30, 3, "10/02/2021", "inactive", "Associate Software Engineer", "Thane"));
        employeeList.add(new Employee2(3, "abc", "1234", 40, 4, "07/03/2020", "active",  "Associate Software Engineer", "Mumbai"));
        employeeList.add(new Employee2(4, "abc", "1234", 23, 2, "11/05/2021", "inactive", "Associate Software Engineer", "Mumbai"));
        employeeList.add(new Employee2(5, "abc", "1234", 60, 3, "30/10/2020", "active",  "Associate Software Engineer", "Palghar"));
        employeeList.add(new Employee2(6, "abc", "1234", 41, 4, "15/09/2021", "inactive", "Associate Software Tester",   "Mumbai"));
        employeeList.add(new Employee2(7, "abc", "1234", 39, 7, "23/07/2022", "inactive", "Associate Software Tester",   "Pune"));
        employeeList.add(new Employee2(8, "abc", "1234", 90, 10,"28/06/2020", "active",  "Associate Software Tester",   "Mumbai"));
        employeeList.add(new Employee2(9, "abc", "1234", 20, 1, "31/01/2021", "inactive", "Associate Software Tester",   "Mumbai"));
        employeeList.add(new Employee2(10,"abc", "1234", 40, 1, "08/04/2022", "active","Associate Software Tester",   "Nashik"));
    }
        @Override
        public List<Employee2>  aboveAge40() {

            List<Employee2> emplist = employeeList.stream().filter(x -> x.getStatus()== "active").filter(x -> x.getAge() > 40).collect(Collectors.toList());
            return emplist;
        }

        @Override
        public List<Employee2> greaterThan2Lakh () {
            List<Employee2> emplist1 = employeeList.stream().filter(x -> x.getStatus()=="active").filter(x -> x.getCtc() > 2).collect(Collectors.toList());
            return emplist1;
        }

    public List<Employee2> equalsToMumbai(){
        List<Employee2> emplist2 = employeeList.stream().filter(x -> x.getStatus()=="active").filter(x -> x.getCity()=="Mumbai")
                .filter(x->x.getCtc()<=2).collect(Collectors.toList());
        return emplist2;
    }
}