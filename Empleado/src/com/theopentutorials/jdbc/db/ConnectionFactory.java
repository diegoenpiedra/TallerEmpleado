package com.theopentutorials.jdbc.db;


// Singleton design pattern:
//
//We write a class (ConnectionFactory) which implements singleton pattern defining database connection configuration statements 
//and methods to make connection to the database. 
//Reason for making this class as singleton is, we can create one object of this class 
//and can create many Connection objects (one factory, many objects).


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectionFactory {
    //static reference to itself
    private static ConnectionFactory instance = new ConnectionFactory();
    public static final String URL = "jdbc:derby://localhost:1527/Employee";
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    public static final String DRIVER_CLASS = "org.apache.derby.jdbc.ClientDriver"; 
     
    //private constructor
    private ConnectionFactory() {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
     
    private Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }   
     
    public static Connection getConnection() {
        return instance.createConnection();
    }
}
