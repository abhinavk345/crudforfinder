package com.abhinav.finderMethod.service;

import com.abhinav.finderMethod.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    ResponseEntity<Employee> saveEmployee(Employee employee);

    ResponseEntity<Employee> findById(Long id);
}
