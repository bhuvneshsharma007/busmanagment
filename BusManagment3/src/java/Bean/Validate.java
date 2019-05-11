/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bhuvnesh Sharma
 */
public class Validate {
    public static  boolean checkUser(String Username,String password){
       boolean st=false;
       try{
           String jdbcurl="jdbc:mysql://localhost:3360/bus?useSSL=false";
           String user="root";
           String pass="Bhuvnesh@01";
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Connection Establishing");
           Connection con=DriverManager.getConnection(jdbcurl,user,pass);
           PreparedStatement ps=con.prepareStatement("select * from Student where Username=? and password=? ");
           ps.setString(1,Username);
           ps.setString(2,password);
           ResultSet rs=ps.executeQuery();
           st=rs.next();
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return st;
    }
}
