/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriely
 */
public class DbConnection {
     
    public Connection dbConnection(){
        
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/hospital?user=root&password=Mysqlp@ssword2024";
            conn = DriverManager.getConnection(url);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "DbConnection" + error.getMessage());
        }
        return conn;
    }
}
