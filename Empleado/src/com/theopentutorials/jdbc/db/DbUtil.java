package com.theopentutorials.jdbc.db;

//Closing database connection:
//
//Safe method to close database ResultSet, 
//Statement and Connection is to write a finally block and release all the resources. 
//We check for non-null reference before calling the close() instance method to avoid NullPointerException.
//Instead of repeating these statements in all methods,
//we write a helper class (DbUtil.java) with methods to close these resources.



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DbUtil {
 
    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                /*log or print or ignore*/
            }
        }
    }
 
    public static void close(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                /*log or print or ignore*/
            }
        }
    }
 
    public static void close(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                /*log or print or ignore*/
            }
        }
    }
}
