/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/

import java.util.Scanner;

public class InsertionSort {

//main method
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        insertionSort(a);//sorting array using insertion sort    
        for(int j:a){    
            System.out.print(j+" ");    
        }  

//take input from user
      public static void insertionSort(int array[]) 
    {  
        int n = array.length;  
        for (int j = 1; j < n; j++) 
        {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) )
            {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  

//create integer array for all elements

//call sort method

//print sorted array

//create sort method

//declare variables

// storing current element whose left side is checked for its correct position 

//check whether the adjacent element in left side is greater or less than the current element.

// move the left side element to one position forward.

 // move current element to its  correct position.

}

   
   // good job
