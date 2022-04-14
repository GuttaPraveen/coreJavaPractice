/*JFM1T9_Assignment1:
    Write a program applying Encapsulation to age field in Person class that cannot be accessed directly from outside class
    but can be accessed using setter and getter methods. 
    Steps to follow:
    Step1: Add age attribute to the Person class 
    Step 2: Add setter and getter methods for the age attribute  
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter age: 32

    Expected Output:
    Your age: 32
    
     
*/

class Person { 
//declare age 

//create setters and getters
    int age;
    void setAge(int age )//Setter Method
    {
       this.age = age;
    }

   // getter method
   int getAge()
   {
       return this.age;
   }
    
}  

class PersonEncapsulation { 

public static void main(String args[]) { 

//main method
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter age: ");
    int n=sc.nextInt();
    Person obj = new Person();
    obj.setAge(n);
     System.out.println("Your age: "+obj.getAge());
        

//create Scanner object

//take input from user

// Try accessing age field of Person directly and check whether it’s accessible
// or not.If not then try accessing it with it’s setter and getter methods. 

// Output age  

}   

} 
