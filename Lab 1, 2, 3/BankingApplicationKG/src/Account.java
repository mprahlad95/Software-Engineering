/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guestmit
 */

import java.util.Scanner;

public class Account {
    String fname;
    String lname;
    char gender;
    String address;
    long mno;
    static long ano=150900000;
    double balance;
    
    long userid;
    String password;
    String passwordcheck;
    
    Account() {
        balance=1000;
        
        Scanner sc=new Scanner(System.in);
        
        String regxname = "^[\\p{L} .'-]+$";
        String regxpwd = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        
        do{
            System.out.print("Enter First Name - ");
            fname=sc.nextLine();
            
            if(fname.matches(regxname))
                break;
            else System.out.println("Invalid...");
        }while(true);
        
        do{
            System.out.print("Enter Last Name - ");
            lname=sc.nextLine();
            
            if(lname.matches(regxname))
                break;
            else System.out.println("Invalid...");
        }while(true);
        
        do{
            System.out.print("Enter Gender (M/F) - ");
            gender=sc.next().charAt(0);
            if(gender=='m'||gender=='f'||gender=='M'||gender=='F')
                break;
            else System.out.println("Invalid...");
        }while(true);
        
        System.out.print("Enter Address - ");
        address=sc.next();
        
        System.out.print("Enter Mobile Number - ");
        address=sc.next();
        
        userid=ano++;
        
        do
        {
         do{
             System.out.print("Enter password - ");
             password=sc.next();
             if(password.matches(regxpwd))
                break;
             else 
                 System.out.println("Invalid! Password must contain " +
                                        "at least one upper case english letter\n" +
                                        "At least one lower case english letter\n" +
                                        "At least one digit\n" +
                                        "At least one special character\n" +
                                        "Minimum 8 in length");
         }while(true);
         
         System.out.print("Enter password again - ");
         passwordcheck=sc.next();
         if(password.equals(passwordcheck))
                break;
             else 
                 System.out.println("Invalid!");   
        }while(true);
            
    }    

}
