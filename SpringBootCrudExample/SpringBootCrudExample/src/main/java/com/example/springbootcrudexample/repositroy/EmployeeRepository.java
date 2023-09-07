package com.example.springbootcrudexample.repositroy;

import com.example.springbootcrudexample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}