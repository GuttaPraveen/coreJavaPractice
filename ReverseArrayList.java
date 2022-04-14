/*  JFM1T12_Assignmwnt4:

    Write a Java program to reverse elements in an arraylist.
    Prompt the user input from the terminal.
     
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    995
    Enter Number 1
    367
    Enter Number 2
    511
    Enter Number 3
    789
    Enter Number 4
    111
    
    Expected Output:
    Elements after reversing:111 789 511 367 995  

 */

import java.util.*; 
import java.util.ArrayList; 

class ReverseArrayList  {  
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) 
        {
            revArrayList.add(alist.get(i));
        }
        return revArrayList;
    }
    public void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i <alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
    public static void main(String[] args)
    {
        ReverseArrayList rao = new ReverseArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want:");
        int n=sc.nextInt();
        ArrayList l = new ArrayList();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number "+i+" ");
            l.add(sc.nextInt());
        }
        l = rao.reverseArrayList(l);
        System.out.print("Elements after reversing:");
        rao.printElements(l);

        
        
    
}

//Arraylist for storing reversed elements

//Append the elements in reverse order 

//Return the reversed arraylist

//Iterate through all the elements and print

//main method

//creat an object of ReverseArrayList class 

//take input from user

//creat an object of ArrayList class

//call reverseArrayList method

//call printElement method

}
// Good Job ....But you are not getting desired out put. Please check line no 46...........
