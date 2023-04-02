/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajt_lab;

import connection.ConnectionProvider;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//import java.util.Scanner;

/**
 *System.out.print("enter the values to be  inserted");
        System.out.print("ID =");id=sc.nextInt();
        System.out.print("NAME =");name=sc.nextLine();
        System.out.print("DEPT =");dept=sc.nextLine();
        System.out.print("SEM =");sem=sc.nextLine(); 
 * @author HoPeLaD
 */
public class AJT_Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
      
        try{
            
             Scanner sc= new Scanner(System.in);
       int id;
       String name,dept,sem; 
       System.out.println("enter the values to be  inserted");
       System.out.print("ID =");
       id=sc.nextInt();
       System.out.print("NAME =");
       name=sc.next();
       System.out.print("NAME =");
       dept=sc.next();
       System.out.print("SEM =");
       sem=sc.next();
        System.out.println("Inserting records into the table...");      
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        st.executeUpdate("insert into stud1 values("+id+",'"+name+"','"+dept+"','"+sem+"')");
        System.out.println("Successfully inserted");        
        }  
        catch (SQLException e) {
            System.out.println("not working");
      } 
    }
}