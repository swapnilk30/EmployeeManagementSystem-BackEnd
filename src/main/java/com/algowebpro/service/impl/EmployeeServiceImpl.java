package com.algowebpro.service.impl;

import com.algowebpro.dto.EmployeeDto;
import com.algowebpro.entity.Employee;
import com.algowebpro.exception.ResourceNotFoundException;
import com.algowebpro.mapper.EmployeeMapper;
import com.algowebpro.repository.EmployeeRepository;
import com.algowebpro.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    //@Autowired
    //here we used constructor based autowiring with @AllArgsConstr.
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee=EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {

        Employee employee=employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee is not Exists with given id : " + id));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
