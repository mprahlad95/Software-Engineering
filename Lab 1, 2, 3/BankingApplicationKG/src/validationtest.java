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
public class validationtest {
    static String x;
    static Scanner sc=new Scanner(System.in);
    static String regxname = "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)";
    public static void main(String[] ar)
    {
        do{
            System.out.print("Enter x - ");
            x=sc.nextLine();
            
            if(x.matches(regxname))
                break;
            else System.out.println("Error...");
        }while(true);
    }
    
}
