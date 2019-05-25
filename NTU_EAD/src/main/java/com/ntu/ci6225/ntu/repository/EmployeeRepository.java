package com.ntu.ci6225.ntu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntu.ci6225.ntu.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
