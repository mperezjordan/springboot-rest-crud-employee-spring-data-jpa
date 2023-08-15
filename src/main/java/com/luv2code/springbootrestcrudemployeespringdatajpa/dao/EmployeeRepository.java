package com.luv2code.springbootrestcrudemployeespringdatajpa.dao;

import com.luv2code.springbootrestcrudemployeespringdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
