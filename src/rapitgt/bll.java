/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rapitgt;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Statement;
/**
 *
 * @author MCS
 */

public class bll {
    public static void insertuserdetails(String name, String email, String password ,String gender){
        
        try {
            // Open connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rapitgt_db", "root", "");
            
            // For insert data into the table
            Statement stm = con.createStatement();
            String query = "INSERT INTO registration_table (username, email, password,gender) VALUES ('" + name + "', '" + email + "', '" + password + "', '" + gender + "')";
            int rowsAffected = stm.executeUpdate(query);

            // Display success or failure message
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "User details inserted successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to insert user details");
            }

            // Close connection 
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }
    
     public static void loginuser(String username,  String passwordq){
         try {
        // Open connection
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rapitgt_db", "root", "");

        // Query to check if the username and password match
        String query = "SELECT * FROM registration_table WHERE username = ? AND password = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, passwordq);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Authentication successful
                // TODO: Add code for successful login
//                JOptionPane.showMessageDialog(this, "You logged in ");
               
                  UserTable userTable = new UserTable();

    // Make the Registration form visible
       userTable.setVisible(true);

    // Close the current form (optional)
     
            } else {
                // Authentication failed
                // TODO: Add code for handling failed login, e.g., show an error message
                JOptionPane.showMessageDialog(null, "invalid usrname");
            }
        }
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace(); // Handle database connection errors
    
     }
     }
     
     
     //delete user 
     
      public static void deletehandle(Object ID){ 
      
      Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Replace "your_database_url", "your_username", "your_password", and "your_table_name" with your actual database details
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rapitgt_db", "root", "");

            String deleteQuery = "DELETE FROM registration_table WHERE id = ?";
            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setObject(1, ID);
            preparedStatement.executeUpdate();

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
      
      }
      
      //UPDATE USER
      
      
}