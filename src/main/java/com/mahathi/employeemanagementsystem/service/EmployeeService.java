package com.mahathi.employeemanagementsystem.service;

import com.mahathi.employeemanagementsystem.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee insert(Employee employee);
    public Employee update(Employee employee);
    public void delete(int id);
    public Employee findbyid(int id);
    public List<Employee> findall();
}
