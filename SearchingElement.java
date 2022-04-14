/*  JFM1T12_Assignment1:

    Write a program to search an element in an arraylist.  
    Prompt the user input from the terminal.
    
    Sample Input 1:
    Enter how many Elements you want: 
    5
    Enter Elements: 
    Red
    Green
    Orange
    White
    Black
    
    Enter Search Element: 
    Red
    
    Expected Output:
    Red Element is present

    Sample Input 2: 
    Enter Search Element: 
    yellow
    
    Expected Output:
    yellow Element is not present

*/

import java.util.*;
import java.util.ArrayList; 

class SearchingElement {

//main method
    
   public static void main(String[] args)
   {
       int n,i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter how many Elements want:");
       n=sc.nextInt();
       LinkedHashSet <String> l= new LinkedHashSet<String>();
       System.out.println("Enter Elements:");
       for(i=0;i<=n;i++)
       {
           l.add(sc.nextLine());
       }
       System.out.println("Enter search element:");
       String selement=sc.nextLine();
       if (l.contains(selement))
       System.out.println(selement +" Element is present");
       else
       System.out.println(selement +" Element is not present");
   }

//declare variables

//create scanner object

//take input from user

//creat an object of LinkedHashSet class 

//check if the search element is present on the list using contains method

//If element found then print element is present else then print element not present

}
// Good Job............... You imported ArrayList, but you did not used it.
// Please import java.util.*; for all collection packeges.
