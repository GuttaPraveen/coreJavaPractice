/*Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius
*/


import java.util.Scanner;

public class Temperature{

//Define the main method
   public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days");
        n=sc.nextInt();
        int[] a=new int[10];
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter the temperature of Day : "+i);
            a[i]=sc.nextInt();
        }
        float low=a[0];
        for(i=1;i<=n;i++)
        {
          if(a[i]<low)
          {
              low=a[i];
          }
        }
        System.out.println("The lowest temperature of the week "+(i-1)+" is "+low+" celsius");
    }

//Declare the variables and initialize

//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result

}
