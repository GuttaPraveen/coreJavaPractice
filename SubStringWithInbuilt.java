/*  JFM1T8_Assignment2:
    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {

//main method
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter search string: ");
        Scanner s=new Scanner(System.in);
        String str2=s.next();
        boolean res=str.contains(str2);
        if(res)
        {
            System.out.println(""+str2+" is found");
        }
        else
        {
            System.out.println(""+str2+" is not found");
        }
        
    }

//declare variables

//take input from user

//check if the string contains substring or not if contains print found else print not found

}
