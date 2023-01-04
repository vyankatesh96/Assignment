package com.assignment.smarte.controller;

import com.assignment.smarte.entities.Department;
import com.assignment.smarte.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService deptService;

    @PostMapping("/add-department")
    public Department addDept(@RequestBody Department d){
        return this.deptService.adddept(d);
    }

    @PutMapping("/update-department/{id}")
    public void updateDept(@RequestBody Department d, @PathVariable int id){
         this.deptService.updatedept(d,id);
    }

    @DeleteMapping("/delete-department/{id}")
    public void delEmp(int id){

        this.deptService.delDept(id);
    }

    @GetMapping("/get-All-departments")
    public List<Department> getAlldepartment(){
        return this.deptService.getAlldepartment();
    }

    @GetMapping("/get-By-Id/{id}")
    public Department getById(@PathVariable int id){
        return this.deptService.getById(id);
    }
}
