package com.example.springbootcrudexample.service;

import com.example.springbootcrudexample.entity.Company;
import com.example.springbootcrudexample.repositroy.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company addCompany(Company company){
        return companyRepository.save(company);
    }

    public List<Company> findAllCompany(){
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long companyId){
        return companyRepository.findById(companyId).get();
    }

    public void deleteCompanyById(Long companyId){
        companyRepository.deleteById(companyId);
    }
}
