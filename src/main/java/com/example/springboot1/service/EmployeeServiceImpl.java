package com.example.springboot1.service;

import com.example.springboot1.dao.EmployeeDAO;
import com.example.springboot1.entity.Employee;
import com.example.springboot1.exceptions.EmployeeException;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getEmployee() {
        return employeeDAO.getEmployee();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
    Employee employee = employeeDAO.getEmployeeById(id);
        if (employee == null) {
            throw new EmployeeException("Employee with id=" + id + "doesn't exist");
        }
        return employee;
    }

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
employeeDAO.addEmployee(employee);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);

    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
    Employee employee = employeeDAO.getEmployeeById(id);
        if (employee == null) {
            throw new EmployeeException("Employee with id=" + id + "doesn't exist");
        }
        employeeDAO.deleteEmployee(id);
    }
}
