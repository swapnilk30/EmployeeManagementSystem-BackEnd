package com.algowebpro.service;

import com.algowebpro.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    //add Employee
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    //get by id
    EmployeeDto getEmployeeById(Long id);

    //get all Employee
    List<EmployeeDto> getAllEmployee();

    //update Employee
    EmployeeDto updateEmployee(Long id,EmployeeDto employeeDto);


    //delete employee
    void deleteEmployee(Long id);
}
