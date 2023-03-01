package rest.service;

import org.springframework.stereotype.Service;
import rest.entity.Employee;

import javax.transaction.Transactional;
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
        return employeeRepository.findById.get();
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
    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
