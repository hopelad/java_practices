/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD_Application;
import java.sql.*;
/**
 *
 * @author HoPeLaD
 */
import java.util.Scanner;
import java.sql.*;
import project.ConnectionProvider;
public class Crud_Application {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int choice,id,ch2=0;
        String name,dept,sem,Ddept,Nname,Ssem;
            try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
          do{
        System.out.println(" ** ----- USER MENU ------- **");
        System.out.println("** PLEASE ENTER YOUR CHOICE **");
        System.out.println("================================");
        System.out.println("1. INSERT DATA \n2. DETAILS OF DATA \n3. UPDATE THE DATA \n4. DELETE ANY DATA \n5. EXIT");
        System.out.print("MY CHOICE IS = ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("ENTER NEW DATA ");
                System.out.print("ID = ");id=sc.nextInt();
                System.out.print("NAME ");name=sc.next();
                System.out.print("DEPARTMENT = ");dept=sc.next();
                System.out.print("SEMISTER = ");sem=sc.next();
                st.executeUpdate("insert into stud1 values("+id+",'"+name+"','"+dept+"','"+sem+"')");
                System.out.println("\033[32m..Data Successfully Inserted ");
                break;
            case 2:
            System.out.println("ID        NAME      DEPERTMENT     SEMISTER");
            ResultSet rs=st.executeQuery("select * from stud1"); 
            while(rs.next())  {
             System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"         "+rs.getString(3)+"            "+rs.getString(4));  
            }
             break;
            
            case 3:
                int Id;
                System.out.println("ID        NAME      DEPERTMENT     SEMISTER");
                ResultSet rs3=st.executeQuery("select * from stud1"); 
                        while(rs3.next())  {
                        System.out.println(rs3.getInt(1)+"     "+rs3.getString(2)+"         "+rs3.getString(3)+"            "+rs3.getString(4));  
                        }
                System.out.println("WHICH COLUMAN DO U WANNA UPDATE??");
                System.out.println("1. ID  \n2. NAME \n3. DEPARTMENT \n4. SEMISTER \n5. EXIT");
                System.out.println("================================");
                System.out.println("** PLEASE ENTER YOUR CHOICE **");
                ch2=sc.nextInt();
                switch(ch2){
                    case 1: 
                        
                            System.out.print("please enter ID = "); Id=sc.nextInt();
                            ResultSet rs1=st.executeQuery("select *from stud1 where id='"+Id+"'");
                            if(rs1.next())
                            {    
                            System.out.println("ENTER DATA TO BE UPDATED");
                            System.out.print("NEW ID = "); Id=sc.nextInt();
                            st.executeUpdate("update stud1 set id="+Id+" where id='"+Id+"'");
                            System.out.println(" \033[31m SORRY ID CANNOT BE UPDATED !");              
                            }
                            else
                    System.out.println("...ID DOES NOT EXST ...\nPLEASE PROVIDE VALID ID ..!!");
                            break;
                   case 2:  
                        
                            System.out.print("please enter ID = "); Id=sc.nextInt();
                            ResultSet rs2=st.executeQuery("select *from stud1 where id='"+Id+"'");
                            if(rs2.next())
                            {    
                            System.out.println("ENTER DATA TO BE UPDATED");
                            System.out.print("NEW NAME = "); Nname=sc.next();
                            st.executeUpdate("update stud1 set name='"+Nname+"' where id='"+Id+"'");
                            System.out.println("\033[32m SUCCESSFULLY UPDATED . !");              
                            }
                            else
                    System.out.println("...ID DOES NOT EXST ...\nPLEASE PROVIDE VALID ID ..!!");
                            break;
                    case 3:  
                        
                            System.out.print("please enter ID = "); Id=sc.nextInt();
                            ResultSet rs4=st.executeQuery("select *from stud1 where id='"+Id+"'");
                            if(rs3.next())
                            {    
                            System.out.println("ENTER DATA TO BE UPDATED");
                            System.out.print("NEW DEPARTMENT = "); Ddept=sc.next();
                            st.executeUpdate("update stud1 set dept='"+Ddept+"' where id='"+Id+"'");
                            System.out.println("\033[32m SUCCESSFULLY UPDATED . !");              
                            }
                            else
                    System.out.println("...ID DOES NOT EXST ...\nPLEASE PROVIDE VALID ID ..!!");
                            break;
                    case 4:  
                        
                            System.out.print("please enter ID = "); Id=sc.nextInt();
                            ResultSet rs5=st.executeQuery("select *from stud1 where id='"+Id+"'");
                            if(rs5.next())
                            {    
                            System.out.println("ENTER DATA TO BE UPDATED");
                            System.out.print("NEW SEMISTER = "); Ssem=sc.next();
                            st.executeUpdate("update stud1 set sem='"+Ssem+"' where id='"+Id+"'");
                            System.out.println("\033[32m SUCCESSFULLY UPDATED . !");              
                            }
                            else
                    System.out.println("...ID DOES NOT EXST ...\nPLEASE PROVIDE VALID ID ..!!");
                            break;
                    case 5:
                        return ;          
                }
              break;
            case 4:
                int Id1;
                System.out.println("ID        NAME      DEPERTMENT     SEMISTER");
                ResultSet rs6=st.executeQuery("select * from stud1"); 
                        while(rs6.next())  {
                        System.out.println(rs6.getInt(1)+"     "+rs6.getString(2)+"         "+rs6.getString(3)+"            "+rs6.getString(4));  
                        }
                System.out.println("PLEASE PROVIDE --ID --NUMBER");Id1=sc.nextInt();
                ResultSet rs2=st.executeQuery("select *from stud1 where id='"+Id1+"'");
                if(rs2.next())
                {
                    st.executeUpdate("delete from stud1 where id='"+Id1+"'");
                    System.out.println("\033[34m .. SUCCESSFULLY DELETED..");
                }
                else
                    System.out.println("\t\n...ID DOES NOT EXST ...\nPLEASE PROVIDE VALID ID ..!!\n\n");
                
                break;
       }
        System.out.println("...................................");
        }while(choice!=5);
            }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }
