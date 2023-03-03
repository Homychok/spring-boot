package com.example.springboot2.service;

import com.example.springboot2.dao.EmployeeRepository;
import com.example.springboot2.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
    @Override

    public List<Employee> findAllByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
