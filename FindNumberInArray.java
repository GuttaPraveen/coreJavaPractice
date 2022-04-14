/* JFM1T11_Assignment1:

   Write a program to find a number in an integer array. If found print the number and the array index at which it is found. 
   Prompt the user input from the terminal.
   
   Sample Input: 2,4,6,1,7,8,9
   Enter number to search x= 9

   Expected Output: 9 found at index 6
   
   Enter number to search x= 12
   Expected Output: Sorry! 12 is not found in array.
   
*/

import java.util.Scanner;

public class FindNumberInArray {

//main method
   public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int x=sc.nextInt();
        System.out.println("Enter number to search x="+x);
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                System.out.println(x+" found at index "+i);
            }
        }
        System.out.println("Sorry!" +x+ " is not found in the array");
    }

//declaring variables

//creating Scanner object

//take input from user

//find number in array

//search the element if found print that position else print not found message

}


// good job
