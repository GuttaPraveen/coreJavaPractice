/*Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55
*/

public class ArraySum {

//Define the main method
     public static void main(String[] args)
    {
        int n,i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter "+n+" elements: ");
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of array elements is : "+sum);
        
    }

//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result

}
