package MethodOverloadANDOverride;

public class Overriding extends Overload123{
	public void ashok() {
		//System.out.println("main123");
	}
	public static void main(String args[]) {
		System.out.println("mai method");
	Overriding aa =new Overriding();
	aa.ashok();
	aa.data(2,6);
	
	}

}
