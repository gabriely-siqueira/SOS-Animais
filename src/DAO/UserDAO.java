/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package DAO;
//
//import DTO.UserDTO;
//import java.sql.*;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author Gabriely
// */
//public class UserDAO {
//
//    Connection conn;
//
//    public ResultSet userAuthentication(UserDTO userDTO) {
//        conn = new DbConnection().dbConnection();
//
//        try {
//            String sql = "select * from admin where user = ? and password = ?";
//            
//            PreparedStatement pstm = conn.prepareStatement(sql);
//            pstm.setString(1, userDTO.getAdmin()); // pass the first parameter "select * from admin where user = ? and password = ?"
//            pstm.setString(2, new String(userDTO.getPassword()));// pass the second parameter 
//            
//            ResultSet rs = pstm.executeQuery();
//            return rs;
//        } catch (SQLException error) {
//            JOptionPane.showMessageDialog(null, "UserDAO" + error);
//            return null;
//        }
//    }
//
//}
