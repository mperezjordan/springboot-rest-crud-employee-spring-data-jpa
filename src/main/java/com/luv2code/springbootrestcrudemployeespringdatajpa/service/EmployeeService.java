package com.luv2code.springbootrestcrudemployeespringdatajpa.service;

import com.luv2code.springbootrestcrudemployeespringdatajpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    //Get All data
    List<Employee> findAll();

    //Get Data by Id selected
    Employee findById(int theId);

    //Use POST to add data into Table
    Employee save(Employee theEmployee);

    // Delete By Id
    void deleteById(int theId);
}
