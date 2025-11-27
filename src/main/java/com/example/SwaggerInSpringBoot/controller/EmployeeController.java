package com.example.SwaggerInSpringBoot.controller;

import com.example.SwaggerInSpringBoot.entity.Employee;
import com.example.SwaggerInSpringBoot.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Tag(name = "Employee API", description = "CRUD operations for employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Operation(summary = "Add Employee", description = "Create a new employee")
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @Operation(summary = "Get All Employees")
    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @Operation(summary = "Get Employee by ID")
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @Operation(summary = "Update Employee")
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    @Operation(summary = "Delete Employee")
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
}
