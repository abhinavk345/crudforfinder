package com.abhinav.finderMethod.repository;

import com.abhinav.finderMethod.entity.Address;
import com.abhinav.finderMethod.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


   List<Employee> findByName(String name);

   Employee findByAddressId(Long id);

   Employee findByAddressDivisionId(Long id);
}
