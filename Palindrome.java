/*  JFM1T8_Assignment4:
    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.*;
import java.lang.*;

public class Palindrome {

//main method
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        String s=str;
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println(""+rev+" is a palindrome");
        }
        else
        {
            System.out.println(""+rev+" is not a palindrome");
        }
    }
}
   
        
        

//declare varible

//take input from user

/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/

}
