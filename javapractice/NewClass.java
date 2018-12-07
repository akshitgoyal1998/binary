/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.sql.*;
/**
 *
 * @author akshit
 */
public class NewClass {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps1=null;
        try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineExam?"+"user=akshit&password=Goyal@123");
            ps1=con.prepareStatement("select * from adminUsers where userid=? and pass=? ");
            ps1.setString(1,"admin");
            ps1.setString(2,"abc");
            ResultSet rs=ps1.executeQuery();
             while(rs.next())
        {
            System.out.println(rs.getString(1));
        }
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
        System.out.println("error in code ");
    }
        
        
       
    }
    
}
