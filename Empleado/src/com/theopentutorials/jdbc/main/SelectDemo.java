package com.theopentutorials.jdbc.main;


import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


import com.theopentutorials.jdbc.dao.EmployeeDAO;
import com.theopentutorials.jdbc.to.Employee;

import java.util.List;
 
public class SelectDemo {
    public static void main(String[] args) {
        //Get all employees
        
        VentanaPrincipal vtn = new VentanaPrincipal();
        
        Employee Diego = new Employee();
        Diego.setEmpId(1);
        Diego.setEmpName("Diego");
        Diego.setDob(new Date(2000,10,12));
        Diego.setSalary(20000);
        Diego.setDeptId(2);
        
        Employee cesar = new Employee(2,"Cesar",new Date(1999,8,01),30000,3);
       
        EmployeeDAO dao = new EmployeeDAO();
       
        try{
        dao.insertEmployee(Diego);
        dao.insertEmployee(cesar);
        getEmployees();
        
        }catch(Exception ex){
        
      
        }
        
    }
 
    private static void getEmployees() {
        EmployeeDAO empDao = new EmployeeDAO();
        List<Employee> employees;
        try {
            employees = empDao.getEmployees();
            for (Employee employee : employees) {
                displayEmployee(employee);
                //System.out.println(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }       
    }
 
    private static void displayEmployee(Employee employee) {
        System.out.println("Employee ID:" + employee.getEmpId());
        System.out.println("Employee Name:" + employee.getEmpName());
 
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dob = format.format(employee.getDob());
 
        System.out.println("DOB:" + dob);
        System.out.println("Salary:" + employee.getSalary());
        System.out.println("Department ID:" + employee.getDeptId());
        System.out.println();
    }
}