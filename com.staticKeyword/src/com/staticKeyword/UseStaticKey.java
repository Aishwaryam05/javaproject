// static keyword ---> share by all the object of class */
//static method.. static variable use
package com.staticKeyword;
class Student
{
	int roll_no=100;
	String name;
	static String college_name="abc";
	void addDetails(int r,String n , String c)
	{
		this.roll_no=r;
		this.name=n;
	}
	
}
public class UseStaticKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(Student.college_name);

	}

}
