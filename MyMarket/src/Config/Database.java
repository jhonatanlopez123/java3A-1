/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author Family
 */
public class Database {
    Connection conn;
    
    public Database(){
        try {
            //Create MySQL Service
            Class.forName("com.mysql.jdbc.Driver");
            //Connect with mymarket database
            conn=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mymarket",
                    "root",
                    "your_root_password"
            );
            System.out.println("::: Connection successfully :::");
        } catch (Exception e) {
            //Error messages
            System.out.println("::: Connection Database error :::");
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
