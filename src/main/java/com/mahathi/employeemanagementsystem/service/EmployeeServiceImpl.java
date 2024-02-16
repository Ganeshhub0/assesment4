package com.mahathi.employeemanagementsystem.service;

import com.mahathi.employeemanagementsystem.entity.Employee;
import com.mahathi.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee insert(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findbyid(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> findall() {
        return employeeRepository.findAll();
    }
}
