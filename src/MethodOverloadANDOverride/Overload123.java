package MethodOverloadANDOverride;

public class Overload123 {
public void data(int a, String b) {
	System.out.println(a);
}
public void data(int a, int b) {
	System.out.println(a + b);
}
public void ashok() {
	System.out.println("m656571");
}
public static void main (String args[]) {
	System.out.println("main method");
	Overload123 mm=new Overload123();
	mm.data(2,"ashok");
	mm.data(4, 7);
}
}
