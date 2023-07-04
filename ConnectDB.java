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

public class ConnectDB {
    static final String DB_URL = "jdbc:mysql://localhost/5009_database";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        }catch(Exception e){
            System.out.println("Error! Unable to connect to Database.");
            return null;
        }
    }
}
