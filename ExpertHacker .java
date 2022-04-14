/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/

class BankAccount { 
//declare account_number , aaccount_number

//create getters and setters
    int account_number;
    Double account_balance;
    void setAccount_Number(int account_number)//Setter Method
    {
       this.account_number = account_number;
    }

   // getter method
   int getAccount_Number()
   {
       return this.account_number;
   }
   void setAccount_Balance(Double account_balance)
   {
       this.account_balance=account_balance;
   }
   Double getAccount_Balance()
   {
       return this.account_balance;
   }
   
}  

class ExpertHacker { 

public static void main(String args[]) { 

//main method

//create Scanner object
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter BankAccount Number: ");
    int n=sc.nextInt();
    System.out.print("Enter Current Balance: ");
    Double m=sc.nextDouble();
    BankAccount obj = new Person();
    bj.setAccount_Number(n);
    obj.setAccount_Balance(m);
    System.out.println("BankAccount Number: "+obj.getAccount_Number());
    System.out.println("Current Balance: "+obj.getAccount_Balance());
        
        

//Take input from user

//Create an object of BankAccount class and set account_number and the account_balance

// Try accessing fields of BankAcccount class and check whether it's accessible 

// or not. If not then try accessing it with it’s setter and getter methods. 

// Print account_number and account_balance 

}   

} 
