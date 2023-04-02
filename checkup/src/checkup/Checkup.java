/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkup;
import java.sql.*;
/**
 *
 * @author HoPeLaD
 */
public class Checkup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Class.forName("com.mysql.jdbc.driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
        System.out.println("Connection Stablished");
        Statement st=con.createStatement();
 
    
        ResultSet rs=st.executeQuery("select * from student");  
        while(rs.next())  
         System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
         System.out.println("DATA FETCHED");
        }
        catch(Exception e){ System.out.println(e);}
        
    }
    
}
