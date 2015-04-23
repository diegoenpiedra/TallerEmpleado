package com.theopentutorials.jdbc.to;
//
//Transfer Object (TO) design pattern:

import java.util.Date;


// Transfer Object pattern encapsulates business data
//Transfer Object pattern encapsulates business data. 
//To implement this pattern, we write a class with properties defining the table attribute
//
public class Employee {
    private int empId;
    private String empName;
    private Date dob;
    private double salary;
    private int deptId;
     
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
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public int getDeptId() {
        return deptId;
    }   
 
    //toString()
    public String toString() {
    	return "Employe [empId= " + empId + ", empName=" + empName + ", dob="
    	+ dob + ", salary=" + salary + ", deptId=" + deptId + "];";
    			
    	}
}