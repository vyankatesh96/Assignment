//package com.assignment.smarte.controller;
//
//import com.assignment.smarte.Service.EmployeeService;
////import com.assignment.smarte.entities.Address;
//import com.assignment.smarte.entities.Department;
//import com.assignment.smarte.entities.Employee;
//
//import javax.persistence.CascadeType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import java.util.List;
//import java.util.Scanner;
//
//public class DbOperations {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int choice;
//        List<Employee> emplist;
////        Employee e;
//        EmployeeService employeeService = new EmployeeService();
//        boolean exit = false;
//
//
//        do{
//
//            System.out.println("-----------------DB Operations-----------------");
//            System.out.println("press 1 : To get aboveAge40");
//            System.out.println("Press 2 : To get greaterThan2Lakh");
//            System.out.println("Press 3 : To get equalsToMumbai");
//            System.out.println("Press 4: Exit");
//            choice = sc.nextInt();
//            sc.nextLine();
//            switch (choice){
//                case 1:
//                   emplist = employeeService.ageAbove40();
//                   emplist.forEach(e-> System.out.println(e));
//                break;
//                case 2:
//                    emplist = employeeService.ctcGreaterThanTwoLakh();
//                    emplist.forEach(e-> System.out.println(e));
//                break;
//                default:
//                    System.out.println("Invalid input from user");
//            }
//
//
//        }while(exit==false);
//
//
//
//
//
//    }
//}
