package com.example.springboot2.service;

import com.example.springboot2.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployee();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);

    List<Employee> findAllByName(String name);
}
