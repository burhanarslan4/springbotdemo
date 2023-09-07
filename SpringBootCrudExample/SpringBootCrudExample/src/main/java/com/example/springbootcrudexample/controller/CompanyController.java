package com.example.springbootcrudexample.controller;

import com.example.springbootcrudexample.entity.Company;
import com.example.springbootcrudexample.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/saveCompany")
    public ResponseEntity<Company> addCompany(@RequestBody Company company){
        Company addCompany = companyService.addCompany(company);
        return  new ResponseEntity<Company>(addCompany, HttpStatus.CREATED);
    }

    @GetMapping("/allCompany")
    public ResponseEntity<List<Company>> getAllCompany(){
        List<Company> allCompany = companyService.findAllCompany();
        return new ResponseEntity<List<Company>>(allCompany,HttpStatus.OK);
    }

    @GetMapping("company/{id}")
    public ResponseEntity<Company> getCompanyId(@PathVariable("id") Long id){
        Company companyById = companyService.getCompanyById(id);
        return new ResponseEntity<Company>(companyById,HttpStatus.OK);
    }

    @DeleteMapping("/deleteCompany/{id}")
    public ResponseEntity<Void> deleteCompanyById(@PathVariable("id") Long id){
        companyService.deleteCompanyById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}

