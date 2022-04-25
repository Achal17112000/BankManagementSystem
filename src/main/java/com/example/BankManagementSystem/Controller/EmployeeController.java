package com.example.BankManagementSystem.Controller;

import com.example.BankManagementSystem.Service.EmployeeService;
import com.example.BankManagementSystem.bean.Employee;
import com.example.BankManagementSystem.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getAllEmployee")
    List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getEmployeeById/{employeeid}")
    Employee getEmployeeById(@PathVariable("employeeid") int employeeid) {
        return employeeService.getEmployeeById(employeeid);
    }

    @GetMapping("/getEmployeeByName/{empname}")
    Employee getEmployeeByName(@PathVariable("empname") String name) {
        return employeeService.getEmployeeByName(name);
    }

    @PutMapping("/updateEmployee")
    Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmployee")
    void deleteUser(@RequestBody Employee employee) {
        employeeService.deleteEmployee(employee);
    }

    @DeleteMapping("/deleteEmployeeById/{empid}")
    void deleteUserById(@PathVariable("empid") int empId) {
        employeeService.deleteById(empId);
    }

    @DeleteMapping("/deleteAllEmployee")
    void deleteAllEmployee() {
        employeeService.deleteAllEmployee();
    }
}
