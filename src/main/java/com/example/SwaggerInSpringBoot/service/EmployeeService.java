package com.example.SwaggerInSpringBoot.service;

import com.example.SwaggerInSpringBoot.entity.Employee;
import com.example.SwaggerInSpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee updateEmployee(Long id, Employee employee){
        Employee emp = getEmployeeById(id);
        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        emp.setSalary(employee.getSalary());
        return employeeRepository.save(emp);
    }

    public String deleteEmployee(Long id){
        employeeRepository.deleteById(id);
        return "Employee Deleted Successfully!";
    }

}
