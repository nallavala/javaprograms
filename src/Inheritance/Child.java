package Inheritance;

public class Child extends Parent  {
	void eee() {
		System.out.println("empty");
	}
public static void main(String args[]) {
	System.out.println("main child method");
	Child bb= new Child ();
	bb.method1();
	method2();
	bb.eee();	
}
}
