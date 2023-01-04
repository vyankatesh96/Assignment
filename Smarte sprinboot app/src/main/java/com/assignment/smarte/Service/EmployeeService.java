package com.assignment.smarte.Service;

import com.assignment.smarte.entities.Employee;
import com.assignment.smarte.Repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;




    public Employee addEmp(Employee e){

        return this.empRepo.save(e);
    }

    public void upadteEmp(Employee e, int id){
       e.setEmpId(id);
       this.empRepo.save(e);

    }

    public void delEmp(int id){

        this.empRepo.deleteById(id);
    }

    public List<Employee> getAllemployees(){

        return this.empRepo.findAll();
    }

    public Employee getBYId(int id){

        return this.empRepo.findById(id).get();
    }

    public List<Employee> ageAbove40(String status, int age){
        List<Employee> employeeList = new ArrayList<>();
        try {
            employeeList = empRepo.ageGreaterThan(status, age);
        }catch (Exception e){
            e.printStackTrace();
        }
        return employeeList;
    }

//    public List<Employee> ctcGreaterThanTwoLakh(String status, double ctc){
//     List<Employee> employeeList = new ArrayList<>();
//        try {
//            employeeList = empRepo.ctcGreaterThan(status, ctc);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return employeeList;
//    }
}
