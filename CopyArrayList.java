/*   JFM1T12_Assignment3:

     Write a program to copy one arraylist into another.
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     5
     Enter Number 0
     5
     Enter Number 1
     4
     Enter Number 2
     3
     Enter Number 3
     2
     Enter Number 4
    
    Expected Output:
    -----Iterating over the second ArrayList----
     5
     4
     3
     2
     1

*/

import java.util.*; 
import java.util.ArrayList; 

class CopyArrayList  { 

//main method
     public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want:");
        n=sc.nextInt();
        ArrayList l =new ArrayList(n);
        for(i=0;i<n;i++)
        {
            System.out.println("Enter number "+i+" ");
            l.add(sc.nextInt());
        }
        ArrayList l1= l;
        System.out.println("-----Iterating over the second ArrayList----");
        for (Object m:l1) 
        System.out.println(m);
     

//declare variables

//create Scanner object

//take input from user

// Assign the first reference to second

// Iterat over second ArrayList and print

}
// Good Job.....................
