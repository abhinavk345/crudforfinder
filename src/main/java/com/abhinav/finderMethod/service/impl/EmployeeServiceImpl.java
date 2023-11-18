package com.abhinav.finderMethod.service.impl;

import com.abhinav.finderMethod.entity.Employee;
import com.abhinav.finderMethod.repository.EmployeeRepository;
import com.abhinav.finderMethod.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public ResponseEntity<Employee> saveEmployee(Employee employee) {
        Employee employeeResponse= employeeRepository.save(employee);
        return new ResponseEntity<>(employeeResponse, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Employee> findById(Long id) {
       Employee employeeList= employeeRepository.findById(id).get();
        return new ResponseEntity<>(employeeList,HttpStatus.OK);

    }

}
