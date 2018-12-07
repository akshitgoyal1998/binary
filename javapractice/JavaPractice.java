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
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdatabase","akshit","Goyal@123");
            if(con!=null)
            {
                Statement st=con.createStatement();
                
                ResultSet rs=st.executeQuery("select * from students");
                while(rs.next())
                {
                    System.out.println(rs.getInt(1)+rs.getString(2));
                }
                
                System.out.println("successfull connection");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            
        }
        
    }
    
}
