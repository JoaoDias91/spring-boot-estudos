package com.joao.spring.quickstartspring.repository;

import com.joao.spring.quickstartspring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
