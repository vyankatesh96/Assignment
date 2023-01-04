package com.assignment.smarte.Repo;

import com.assignment.smarte.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "select * from employee e where e.status= :status and e.age > 40",nativeQuery = true)
    public List<Employee> ageGreaterThan(String status, int age);

//    @Query(value = "select  * from employee e where e.status= :status and e.ctc > 2", nativeQuery = true)
//    public List<Employee> ctcGreaterThan(String status, double ctc);
}
