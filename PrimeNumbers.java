/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30
   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29
*/
import java.util.*;
class Prime
{
   public static void main(String[] args)
   {
      int f,l,j,i;
      System.out.println("Enter Starting Number: ");
      System.out.println("Enter ending Number: ");
      Scanner sc=new Scanner(System.in);
      f=sc.nextInt();
      l=sc.nextInt();
      for(i=f;i<=l;i++)
      {
          for(j=2;j<=i;j++) 
          {
              if(i%j==0)
               break;
          }
          if(i==j)
            System.out.println(j);
        
      }
   }
}
