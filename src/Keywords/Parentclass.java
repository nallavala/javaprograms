package Keywords;

public class Parentclass {
	public String name = "Ashok";
	public void getdata() {
		System.out.println("parent class method");
	}
	public Parentclass() {
		System.out.println("parent class constructor");
	}
	
	public static void main(String args[]) {
		Parentclass classes = new Parentclass();
		classes.getdata();
	
	}
}
