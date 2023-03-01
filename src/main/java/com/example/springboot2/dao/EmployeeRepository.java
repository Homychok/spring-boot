package rest.dao;

import rest.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends  JpaRepository<Employee, Integer>{
    List<Employee> findAllByName(String name);
}
