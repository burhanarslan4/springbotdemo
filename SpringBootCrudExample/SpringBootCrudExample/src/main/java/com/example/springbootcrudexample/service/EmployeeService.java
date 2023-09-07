package com.example.springbootcrudexample.service;

import com.example.springbootcrudexample.entity.Employee;
import com.example.springbootcrudexample.repositroy.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long employeeId){
        return employeeRepository.findById(employeeId).get();
    }

    public void deleteEmployeeById(Long employeeId){
        employeeRepository.deleteById(employeeId);
    }

}
