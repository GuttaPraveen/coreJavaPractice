/*Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/
import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
   public static void main(String[] args)
    {
        int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        r=sc.nextInt();
        System.out.println("Enter number of columns: ");
        c=sc.nextInt();
        int[][] a=new int[10][10];
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                System.out.println("Elements ["+i+","+j+"] : "+a[i][j]);
            }
        }
        int[][] transpose = new int[10][10];
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=r;j++)
            {
               transpose[j][i]=a[i][j]; 
            }
        }
        System.out.print("After Transpose Matrix :\n");
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                System.out.print(transpose[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

//Declare the variables

//Take input from user to enter rows and column values

//Convert the square matrix into transpose

//Print the transpose matrix

//printing j and i instead of i and j

}
