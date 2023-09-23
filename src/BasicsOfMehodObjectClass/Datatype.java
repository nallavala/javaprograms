package BasicsOfMehodObjectClass;

public class Datatype {
	final int b=20; //instance variables
	static int empid = 101; //static variables 
	public void m1()	{
	int a = 10; //local variables 
	System.out.println("M1 Executed");
	System.out.println("Local varible " + a );
	}
	public void m2()	{
	System.out.println("M2 Executed");
	System.out.println("instance varible " + b); 
	System.out.println("Static varible " + empid);
	}
	public void m3()	{
	System.out.println("M3 Executed");
	System.out.println("instance varible " + b); 
	System.out.println("Static varible " + empid);
	}
	public static void st()	{// static method 
		System.out.println("Static method executed");
	}
	public static void main(String args[])
	{
		System.out.println("Main method executed");
		Datatype m = new Datatype ();
		m.m1();//Accessing method by using object
		m.m3();
	    m.m2();
	   st();//no need of to create any object.Accessing method by using classname
	}
	}


