package com.example.springboot1.dao;

import com.example.springboot1.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getEmployee();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
