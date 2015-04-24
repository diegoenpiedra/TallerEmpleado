package com.theopentutorials.jdbc.dao;

//DAO classes implements Data Access Object (DAO) pattern which encapsulates access to the data source.
//
//This class defines methods for each query, 
//where we first create connection object using ConnectionFactory (by calling ConnectionFactory.getConnection()).
//Using this connection object we create statement and execute queries.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import com.theopentutorials.jdbc.db.ConnectionFactory;
import com.theopentutorials.jdbc.db.DbUtil;
import com.theopentutorials.jdbc.to.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private Connection connection;
    private Statement statement;
 
    public EmployeeDAO() { }
     
    public Employee getEmployee(int employeeId) throws SQLException {
        String query = "SELECT * FROM Employee WHERE id=" + employeeId;
        ResultSet rs = null;
        Employee employee = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
           // . . . .
           // . . . .
        } finally {
            DbUtil.close(rs);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
        return employee;
}
    
    //
    // Get all of employees
    //
    public List<Employee> getEmployees() throws SQLException {
        String query = "SELECT * FROM Employee";
        List<Employee> list = new ArrayList<Employee>();
        Employee employee = null;
        ResultSet rs = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                employee = new Employee();
                /*Retrieve one employee details 
                and store it in employee object*/
                employee.setEmpId(rs.getInt("id"));
                employee.setEmpName(rs.getString("name"));
                employee.setDob(rs.getDate("fecha"));
                employee.setSalary(rs.getDouble("salario"));
                employee.setDeptId((rs.getInt("dept")));
 
                //add each employee to the list
                list.add(employee);
            }
        } finally {
            DbUtil.close(rs);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
        return list;
    }
    
    //
    // Insert employee
    public void insertEmployee (Employee employee) throws SQLException {
    	SimpleDateFormat dateformatyyyyMMdd = new SimpleDateFormat("yyyyMMdd");
    	//String date_to_string = dateformatyyyyMMdd.format(dateNow);

    	//String query = "SELECT * FROM employee";
       
    	// Example
    	//String sql = "INSERT INTO employee " +
        //        "VALUES (100, 'Zara', 'Ali', 18)";
  
   
    	
    	String query = "INSERT INTO Employee " + 
    			 "VALUES ("
    			 + Integer.toString(employee.getEmpId()) +","
    			 + employee.getEmpName() +","
    			 + dateformatyyyyMMdd.format(employee.getDob()) +","
    			 + Double.toString(employee.getSalary()) +","
    			 + Integer.toString(employee.getDeptId()) 
    			 + ")"
    			;
    	
        ResultSet rs = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            
            // Insert and update
            //
            statement.executeUpdate(query); 
            
        } finally {
            DbUtil.close(rs);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
    }
    
    
}