package com.example.springbootcrudexample.controller;

import com.example.springbootcrudexample.entity.Employee;
import com.example.springbootcrudexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee addEmployee = employeeService.addEmployee(employee);
        return  new ResponseEntity<Employee>(addEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/allEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> allEmployee = employeeService.findAllEmployee();
        return new ResponseEntity<List<Employee>>(allEmployee,HttpStatus.OK);
    }

    @GetMapping("employee/{id}")
    public ResponseEntity<Employee> getEmployeeId(@PathVariable("id") Long id){
        Employee employeeById = employeeService.getEmployeeById(id);
        return new ResponseEntity<Employee>(employeeById,HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable("id") Long id){
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}


