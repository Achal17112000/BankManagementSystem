package com.example.BankManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue
    int empId;

    String empName;
    String empDesgination;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesgination() {
        return empDesgination;
    }

    public void setEmpDesgination(String empDesgination) {
        this.empDesgination = empDesgination;
    }
}
