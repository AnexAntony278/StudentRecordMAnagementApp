
package com.mycompany.studentrecordapp;
import java.sql.*;
import java.util.Properties;
public class DBConnection {
    public static Connection connectDB(){
    Connection con;
        try{
            Properties props = new Properties();
props.setProperty("zeroDateTimeBehavior", "CONVERT_TO_NULL"); 
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root123");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
