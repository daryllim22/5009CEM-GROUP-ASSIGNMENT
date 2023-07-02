/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment.management.system;


import java.sql.*;

public class CreateDBTable {
    
    static final String DB_URL = "jdbc:mysql://localhost/5009_database";
    static final String USER = "root";
    static final String PASS = "";
    
    public static void main(String[] args ) throws Exception{
        //connect to database
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();) {
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        //call the createTable function
        createTable();
        
        //Insert 2 admin username and password
        insertAdminTable("admin1","admin1");
        insertAdminTable("admin2","admin2");
        
        }
    
   private static void insertAdminTable(String username, String password) throws Exception {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         PreparedStatement checkUsername = conn.prepareStatement("SELECT * FROM admin WHERE username = ?");
        checkUsername.setString(1, username);
        ResultSet resultSet = checkUsername.executeQuery();

        if (resultSet.next()) {
            System.out.println("Username '" + username + "' already exists in Admin Table.");
        } else {
            PreparedStatement insert = conn.prepareStatement("INSERT INTO admin (username, password) VALUES (?, ?)");
            insert.setString(1, username);
            insert.setString(2, password);
            insert.executeUpdate();
            System.out.println("Username and password inserted.");
        }
   }
        
    //Create Database Table function
    public static void createTable() throws Exception{
        //Create Admin Table
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement checkTable = conn.prepareStatement("SHOW TABLES LIKE 'admin'");
            ResultSet resultSet = checkTable.executeQuery();

            if (resultSet.next()) {
                System.out.println("Admin Table already exists.");
            } else {
                PreparedStatement create = conn.prepareStatement("CREATE TABLE admin(id int NOT NULL AUTO_INCREMENT, username varchar(255), password varchar(255), PRIMARY KEY(id))");
                create.executeUpdate();
                System.out.println("Admin Table created.");
            }
            } catch (Exception e) {
            System.out.println(e);
        }
        
        // Create Guard Table
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement checkTable = conn.prepareStatement("SHOW TABLES LIKE 'guard'");
            ResultSet resultSet = checkTable.executeQuery();

            if (resultSet.next()) {
                System.out.println("Guard Table already exists.");
            } else {
                PreparedStatement create = conn.prepareStatement("CREATE TABLE guard(id int NOT NULL AUTO_INCREMENT, username varchar(255), password varchar(255), PRIMARY KEY(id))");
                create.executeUpdate();
                System.out.println("Guard Table created.");
            }
            } catch (Exception e) {
            System.out.println(e);
        }
        
        // Create Resident Table
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement checkTable = conn.prepareStatement("SHOW TABLES LIKE 'resident'");
            ResultSet resultSet = checkTable.executeQuery();

            if (resultSet.next()) {
                System.out.println("Resident Table already exists.");
            } else {
                PreparedStatement create = conn.prepareStatement("CREATE TABLE resident(id int NOT NULL AUTO_INCREMENT, unit_number varchar(255), password varchar(255),resident_name varchar(255),email varchar(255),telefon_number varchar(255),car_plate_no varchar(255), PRIMARY KEY(id))");
                create.executeUpdate();
                System.out.println("Resident Table created.");
            }
            } catch (Exception e) {
            System.out.println(e);
        }
        
        // Manager Forum Table
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement checkTable = conn.prepareStatement("SHOW TABLES LIKE 'manager_forum'");
            ResultSet resultSet = checkTable.executeQuery();

            if (resultSet.next()) {
                System.out.println("Manager Forum Table already exists.");
            } else {
                PreparedStatement create = conn.prepareStatement("CREATE TABLE manager_forum(id int NOT NULL AUTO_INCREMENT, title varchar(255), text varchar(255),unitnumber varchar(255),resident_name varchar(255), PRIMARY KEY(id))");
                create.executeUpdate();
                System.out.println("Manager Forum Table created.");
            }
            } catch (Exception e) {
            System.out.println(e);
        }
        
        //Resident Forum table
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement checkTable = conn.prepareStatement("SHOW TABLES LIKE 'resident_forum'");
            ResultSet resultSet = checkTable.executeQuery();

            if (resultSet.next()) {
                System.out.println("Resident Forum Table already exists.");
            } else {
                PreparedStatement create = conn.prepareStatement("CREATE TABLE resident_forum(id int NOT NULL AUTO_INCREMENT, title varchar(255), text varchar(255),unitnumber varchar(255),resident_name varchar(255), PRIMARY KEY(id))");
                create.executeUpdate();
                System.out.println("Resident Forum Table created.");
            }
            } catch (Exception e) {
            System.out.println(e);
        }
    }  
}

