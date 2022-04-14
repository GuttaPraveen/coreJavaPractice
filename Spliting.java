/* JFM1T11_Assignment6:

   Write a program to sort an array containing alphabets, special symbols and numbers.
   Prompt the user input from the terminal.
   
   Sample Input: bit01$$Lab02s03!@!!
   
   Expected Output: 
   Characters: bitLabs
   Numbers: 010203
   Special characters: $$!@!!

*/

import java.util.Scanner;

public class Spliting  { 

//main method
   public static void splitString(String str)
	{
		StringBuffer alpha = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer special = new StringBuffer();
		
		for (int i=0; i<str.length(); i++)
		{
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if(Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else
				special.append(str.charAt(i));
		}
	
		System.out.println("characters:"+alpha);
		System.out.println("Numbers:"+num);
		System.out.println("special characters:"+special);
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        splitString(s);
    } 

//take input from user

//call splitString method

//create splitString method in that initialize alpha, num and special to stringBuffer

//check if the entered string is digit,alpha and special using if condition

//printing seperatly characters in character, numbers in number and special characters in special character
}


// good job
