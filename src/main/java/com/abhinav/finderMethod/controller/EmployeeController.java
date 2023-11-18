package com.abhinav.finderMethod.controller;


import com.abhinav.finderMethod.entity.Address;
import com.abhinav.finderMethod.entity.Employee;
import com.abhinav.finderMethod.repository.EmployeeRepository;
import com.abhinav.finderMethod.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/create")
    public ResponseEntity<Employee> saveCustomer(@RequestBody Employee employee) {
        log.info("inside method saveCustomer of EmployeeController class");
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Employee>> findAll() {
        log.info("inside method findAll of EmployeeController");
        List<Employee> employeeList = employeeRepository.findAll();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);

    }

    @GetMapping("/findbyid")
    public ResponseEntity<Employee> findByEmployeeName(@RequestParam Long id) {
        log.info("inside method findAll of EmployeeController");
        return employeeService.findById(id);

    }

    @GetMapping("/findbyname")
    public ResponseEntity<List<Employee>> findByEmployeeName(@RequestParam String name) {
        log.info("inside method findAll of EmployeeController");
        List<Employee> employeeList = employeeRepository.findByName(name);
        return new ResponseEntity<>(employeeList, HttpStatus.OK);

    }

    @GetMapping("/findbyaddressid")
    public ResponseEntity<Employee> findByAddressId(@RequestParam Long id) {
        log.info("inside method findAll of EmployeeController");
        Employee employeeList = employeeRepository.findByAddressId(id);
        return new ResponseEntity<>(employeeList, HttpStatus.OK);

    }
    @GetMapping("/findbydivisionid")
    public ResponseEntity<Employee> findByDivisionId(@RequestParam Long id) {
        log.info("inside method findAll of EmployeeController");
        Employee employeeList = employeeRepository.findByAddressDivisionId(id);
        return new ResponseEntity<>(employeeList, HttpStatus.OK);

    }

}