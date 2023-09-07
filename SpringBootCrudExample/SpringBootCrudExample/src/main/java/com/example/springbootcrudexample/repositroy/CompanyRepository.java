package com.example.springbootcrudexample.repositroy;

import com.example.springbootcrudexample.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<Company,Long> {
}
