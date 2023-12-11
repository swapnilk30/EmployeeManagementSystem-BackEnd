package com.algowebpro.service;

import com.algowebpro.dto.EmployeeDto;

public interface EmployeeService {

    //add Employee
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    //get by id
    EmployeeDto getEmployeeById(Long id);

    //get all Employee


}
