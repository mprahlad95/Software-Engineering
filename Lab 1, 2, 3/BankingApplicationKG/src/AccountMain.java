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
public class AccountMain {
    
    static Account acc[];
    static int i=0;
    static Scanner sc=new Scanner(System.in);
    static int ch;
    public static void main(String[] ar)
    {
        do{
            System.out.println("*****Banking Application*****");
            System.out.println("1)Create New Account");
            System.out.println("2)Access Existing Accounts");
            System.out.println("0)Exit");
            System.out.print("Enter choice - ");
            ch=sc.nextInt();
        
            switch(ch)
            {   
                case 1: acc[i]=new Account();
                        i++;
                        break;
            }    
    }while(ch!=0);
        
}
}
