/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5009cem_assignment;


import java.sql.*;

/**
 *
 * @author Jia De
 */
public class CreateDatabase {
    
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASS = "";
    
    public static void main (String[] args){
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
               Statement stmt = conn.createStatement();) {
            String sql = "CREATE DATABASE 5009_database";
            stmt.executeUpdate(sql);
            System.out.println("Database Created Successfully...");
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
