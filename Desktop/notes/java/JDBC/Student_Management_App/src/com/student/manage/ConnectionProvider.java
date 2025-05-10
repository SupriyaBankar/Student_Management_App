package com.student.manage;

import java.sql.*;

public class ConnectionProvider {
    static  Connection con;
    
    public static Connection createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Supriya@123");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
}
