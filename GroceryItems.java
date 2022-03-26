/* Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:
   The highest price you incurred is 344.0
*/

import java.util.Scanner;

public class GroceryItems {

//Define the main method
   public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Float[] a= new Float[15];
        for(int i=0;i<n;i++)
        a[i]=sc.nextFloat();
        float large=a[0];
        for(int i=0;i<n;i++)
        {
            if(large<a[i])
            {
                large=a[i];
            }
        }
        System.out.println("The highest price you incurred is "+large+"");
    }

//Declare and initialize variables

//Take the 10 different expenses price

//Check the 10 different expenses price using for loop

//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.

//Print the result

}
