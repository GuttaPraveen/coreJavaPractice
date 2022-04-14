/* JFM1T11_Assignment2:

   Write a program to execute the search of a number in a sorted array following the below logic: 
   If the target element is greater than middle element then you go to the middle of the right of the remaining numbers 
   or otherwise towards middle of the left of the remaining numbers. 
   Continue until the number is either found or not found.
   Prompt the user input from the terminal.
   
   Sample Input: 2,5,10,12,15,20,25,31,40
   Enter number to search x= 20

   Expected Output: Position of element is : 6
   
   Enter number to search x= 26
   Expected Output: Sorry,Key doesn't exist in the array
   
*/

import java.util.Scanner;

public class BinarySearch {

//main method 
    public static int binarySearch(int[] arr,int k)
    {
        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(k==arr[mid])
                return mid;
            else if(k<arr[mid])
                h=mid-1;
            else
                l=mid+1;
                
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
       for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int x=sc.nextInt();
        System.out.println("Enter number to search x="+x);
        int res=binarySearch(a,x);
        if(x==a[res])
        System.out.println("Position of element is: "+res);
        else
        System.out.println("Sorry,key does not exist in the array");
    }

//Declare variables

//take input from user

//call binarySearch method


//create a method in that declare a variables and initialize l=a.length, beg=0, end=l-1, mid=(beg+end)/2

//check each number less than or greater than to the mid element

//if mid element is less than key than it calculates beg and mid

//if mid is equal to key than it stops and return mid

//if mid element is greater than key then it calculates end and mid

//checking beg is greater than end, then mid = 0

}


// good job
