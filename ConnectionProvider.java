/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.sql.*;

/**
 *
 * @author alanoud
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
       try
       {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","1234");
        return con;
       }
       catch(Exception e)
       {
       System.out.println(e);
       return null;
       
       }
       
    }
}
