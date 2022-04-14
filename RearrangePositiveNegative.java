/*  JFM1T11_Assignment5 :

    Write a program to sort an array containing negative, non-negative and zero values in descending order.
    Prompt the user input from the terminal.
    
    Sample Input: 2,-3,-1,4,-2
    
    Expected Output: -3,-2,-1,4,2
    
*/

import java.util.Scanner;

public class RearrangePositiveNegative {
    
//main method
    public static void main(String[] args)
    {
        int[] a={2,-3,-1,4,-2};
        int des[]=descending(a);
        for(int i=0;i<des.length;i++)
        System.out.print(des[i] + "\t");
    }
    static int[] descending(int[] arr)
    {
        int sortedArray[]=new int[arr.length];
        int start=0;
        int end=arr.length-1;
        int sortedIndex=arr.length-1;
        while(start<=end)
        {
            if(arr[start]>arr[end])
            {
                sortedArray[sortedIndex--]=arr[start];
                start++;
            }
            else
            {
                sortedArray[sortedIndex--]=arr[end];
                end--;  
            }
        }
        return sortedArray;
    }

//take input from user

//call descending method

//print result

//create descending method

//declare and initialize variables

//check each element if the element is less then zero and the both numbers are not equal  then it swaps them

//increasing elements untill all elements rearranged

}


// good job
