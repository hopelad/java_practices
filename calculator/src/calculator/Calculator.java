/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author hope
 */
import java.util.*;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBESR TO BE CALCULATED");
        double x=sc.nextInt();
        double y=sc.nextInt();
        System.out.println("PLEASE CHOOSE YOU ACTION TO BE PERFORMED");
        System.out.println("==========================================");
        System.out.println("FOR ADDITION      :  + ");
        System.out.println("FOR SUBSTRUCTION  :  - ");
        System.out.println("FOR MULTIPLICATION:  * ");
        System.out.println("FOR DWVISION      :  / ");
        System.out.println("FOR REMAINDER     :  % ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                double a=x+y;
                System.out.println("ADDITION OF X AND Y :"+a);
                break;
                
            case '-':
                double s=x-y;
                System.out.println("SUBSTRUCTION OF X AND Y :"+s);
                break;
                
            case '*':
                double m=x*y;
                System.out.println("MULTIPLICATION OF X AND Y :"+m);
                break;
                
            case '/':
                double d=x/y;
                System.out.println("DIVISION OF X AND Y :"+d);
                break;
                
            case '%':
                double r=x%y;
                System.out.println("REMAINDER OF X AND Y :"+r);
                break;
               
        }
        
        System.out.println("*******THANK YOU FOR CHOOSING US******");
        // TODO code application logic here
    }
    
}
