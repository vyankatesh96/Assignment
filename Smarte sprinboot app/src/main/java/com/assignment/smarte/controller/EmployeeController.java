package com.assignment.smarte.controller;

import com.assignment.smarte.Service.EmployeeService;
import com.assignment.smarte.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService empService;



    @PostMapping("/add-emp")
    public Employee newEmp(@RequestBody Employee e){

        return this.empService.addEmp(e);
    }

    @PutMapping("/update-emp/{id}")
    public void upEmp(@RequestBody Employee e, @PathVariable int id){

         this.empService.upadteEmp(e,id);

    }

    @DeleteMapping("/delete-emp/{id}")
    public void delEmp(@PathVariable int id){
        this.empService.delEmp(id);
    }

    @GetMapping("/get-All-employees")
    public List<Employee> getAllemployees(){
        return this.empService.getAllemployees();
    }

    @GetMapping("/get-By-Id/{id}")
    public Employee getById(@PathVariable int id){
        return this.empService.getBYId(id);
    }

    @GetMapping("/get-employee-age-above-40")
    public List<Employee> ageAbove40(@RequestBody String status, @PathVariable int age){
        return  this.empService.ageAbove40(status, age);
    }

//    @GetMapping("/get-employee-ctc-greaterthan-two-lakh")
//    public List<Employee> ctcGreaterThanTwolakh(@RequestBody String status, @PathVariable double ctc){
//        return this.empService.ctcGreaterThanTwoLakh(status, ctc);
//    }

}