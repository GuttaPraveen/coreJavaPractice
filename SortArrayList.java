/*  JFM1T12_Assignment2:

    Write a program to sort a given arraylist of integers in ascending order.   
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    467
    Enter Number 1
    342
    Enter Number 2
    167
    Enter Number 3
    511
    Enter Number 4
    204
    
    Expected Output:
    ArrayList After Sorting:
    167
    204
    342
    467
    511

*/     

import java.util.*;  

public class SortArrayList  {  

//main method
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How many numbers you want");
        n=sc.nextInt();
        ArrayList l =new ArrayList();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter number "+i+" "); 
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        System.out.println("ArrayList After Sorting:");
        for(Object o:l)
        System.out.println(o);
        
    }
    

//declare variables

//create Scanner object

//take input from user

//create an object of ArrayList class

//sort ArrayList in ascending oeder

//print Array list

}
// Good Job.....................

