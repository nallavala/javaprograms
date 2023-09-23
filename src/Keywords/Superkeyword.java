package Keywords;

public class Superkeyword extends Parentclass{
	String name ="Vinay";
	public void getdata() {
		super.getdata();// this super keyword get the data from parent class when we do extend
		System.out.println(name);
		System.out.println();
		System.out.println(super.name);// when we give super as a key word its extends a parent data variable even having same names
	}
	public Superkeyword() {
		super();// this super keyword is used to call the constructor from parent if there is constructor in the same class
		
		System.out.println("child class constructor ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Superkeyword cd= new Superkeyword();
		cd.getdata();
		
		

	}

}
