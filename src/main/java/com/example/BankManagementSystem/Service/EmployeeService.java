package com.example.BankManagementSystem.Service;

import com.example.BankManagementSystem.bean.Employee;
import com.example.BankManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }

    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> getAllEmployee() {
        List<Employee> li = new ArrayList<>();
        employeeRepository.findAll().forEach(x -> li.add(x));
        return li;
    }

    public void deleteAllEmployee() {
        employeeRepository.deleteAll();
    }

    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}
