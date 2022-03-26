Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3
   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  
*/

import java.util.Scanner;

public class TwoDimentionalArray {

//Define the main method
   public static void main(String[] args)
    {
        int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column:");
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] a=new int[10][10];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
               
                a[i][j]=sc.nextInt();
                System.out.println("Enter arr["+i+"]["+j+"] : "+a[i][j]);
            }

        }
        int large=a[0][0];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(a[i][j]>large)
                {
                    large=a[i][j];
                }
            }
        }
        System.out.println("Largest element in array is "+large+" and its position is a["+(i-1)+"][2]");
        
    }

//Declare the variables

//Take number of rows and columns from user in two-dimensional array

//assume first element is largest and use for loop to compare the largest element with all the reamaining elements

//Calcualte the maximum element based on index poistion

//Print result

}
