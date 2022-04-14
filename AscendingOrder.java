/* JFM1T11_Assignment4 :

   Write a program to sort an array of numbers in ascending order by comparing each number with every other number in 
   an array so that after each pass/iteration the smallest element reaches at it’s correct position. 

   Prompt the user input from the terminal.
   
   Sample Input: 4,6,3,9,10
   
   
   Expected Output: 10,9,6,4,3

 */

import java.util.Scanner;

public class AscendingOrder {

//main method
   public static void main(String[] args)
    {
        int n,i,j,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int y:a)
        System.out.println(y);
   }

//take input from user

//check input element numbers and printing all numbers using for loop

//check all elements using for loop

//check if first number is greater than the second number or not if true then swap

//check and print result

}


// Please write comment for your approach
