/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author ADRIAN
 */
public class MyConnection {
        
    private Connection con;

    public MyConnection() {
        String url = "jdbc:mysql://localhost:3306/motorphdb";
        String root = "root";
        String pass = "ROOT";

        try {
            // Load the MySQL JDBC driver (optional in newer versions of JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establishing the connection
            con = DriverManager.getConnection(url, root, pass);

            if (con != null) {
                System.out.println("No Connection!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Database: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }   
}
