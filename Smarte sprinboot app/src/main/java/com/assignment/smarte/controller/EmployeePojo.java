package com.assignment.smarte.controller;

import com.assignment.smarte.Service.Impl.EmployeeImpl;
import com.assignment.smarte.entities.Employee;
import com.assignment.smarte.entities.Employee2;


import java.util.List;
import java.util.Scanner;



public class EmployeePojo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        boolean exit=false;
        EmployeeImpl empImpl = new EmployeeImpl();
        List<Employee2> emplist;

        do{
            System.out.println("-------------------------Assignments Starts from here -------------------------");
            System.out.println("press 1 : To get aboveAge40");
            System.out.println("Press 2 : To get greaterThan2Lakh");
            System.out.println("Press 3 : To get equalsToMumbai");
            System.out.println("Press 4: Exit");

             choice = sc.nextInt();
             sc.nextLine();

            switch (choice){
                case 1:
                    emplist= empImpl.aboveAge40();
                    emplist.forEach(e-> System.out.println(e));
//                    System.out.println(emplist);
                    break;
                case 2:
                    emplist = empImpl.greaterThan2Lakh();
                    emplist.forEach(e-> System.out.println(e));
//                    System.out.println(emplist);
                    break;
                case 3:
                    emplist = empImpl.equalsToMumbai();
                    emplist.forEach(e-> System.out.println(e));
//                    System.out.println(emplist);
                    break;
                case 4:
                        exit=true;
                    System.out.println("Thanks :)");
                    break;
                default:
                    System.out.println("Invalid input for user");
            }
        }while(exit==false);
    }
}
