package com.assignment.smarte.Service;

import com.assignment.smarte.entities.Department;
import com.assignment.smarte.Repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository deptRepo;

    public Department adddept(Department d){
        return this.deptRepo.save(d);
    }

    public void updatedept(Department d, int d_id){
        d.setDepId(d_id);
         this.deptRepo.save(d);
    }

    public void delDept(int d_id){
        this.deptRepo.deleteById(d_id);
    }

    public List<Department> getAlldepartment(){
        return this.deptRepo.findAll();
    }

    public Department getById(int d_id){

        return this.deptRepo.findById(d_id).get();
    }
}
