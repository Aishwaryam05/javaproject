package co.Employee;

public class EmployeeCount
{   
	static int counter=0;
	   
	  EmployeeCount()  //constructor
	   {
		   counter ++;  //increment
	   }
	public static void main(String args[])
	{
	   EmployeeCount ec1 = new EmployeeCount(); //creating object
	   EmployeeCount ec2 = new EmployeeCount();
	   EmployeeCount ec3 = new EmployeeCount();
	   EmployeeCount ec4 = new EmployeeCount();
	    
	System.out.println("Total number of objects are :"+counter); //print the statement
	}
   
}
