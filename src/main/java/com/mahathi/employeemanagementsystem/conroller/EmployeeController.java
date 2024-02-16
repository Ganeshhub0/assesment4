package com.mahathi.employeemanagementsystem.conroller;

import com.mahathi.employeemanagementsystem.entity.Employee;
import com.mahathi.employeemanagementsystem.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;
    @PostMapping("insert")
    public Employee insert(@RequestBody Employee employee){
       return employeeService.insert(employee);
    }
    @PutMapping("update")
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id){
        employeeService.delete(id);
    }
    @GetMapping("viewall/{id}")
    public Employee findbyid(@PathVariable int id){
        return employeeService.findbyid(id);
    }
    @GetMapping("findall")
    public List<Employee> findall(){
       return employeeService.findall();
    }
}
