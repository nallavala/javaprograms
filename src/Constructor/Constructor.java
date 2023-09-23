package Constructor;
// inthis class the return type is note their in method(void)
// this class name and method name should be same
public class Constructor {
public  Constructor() {
	System.out.println("i am in constructor");
}
public void method() {
	System.out.println("normal class");
}
public static void main (String args[]) {
	Constructor cc=new Constructor();
	
	// by creatig a object we can call this constructor method
}
}
