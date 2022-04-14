/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
      

class  Sport { 

// Create a member variable for Sport name
	String sptName;
	Sport(String sptName)
	{
		this.sptName=sptName;
	}
		
	

// Set member variable for Sport name 

public static void main(String args[]) { 

// Create object for Sport class 
	Sport obj=new Sport("FootBall");

// Print the value of Sport name using "this" reference
		System.out.println("Sport name:"+obj.sptName);

} 

} 
