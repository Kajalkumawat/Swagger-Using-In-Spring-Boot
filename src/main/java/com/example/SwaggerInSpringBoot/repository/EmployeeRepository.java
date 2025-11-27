package com.example.SwaggerInSpringBoot.repository;

import com.example.SwaggerInSpringBoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
