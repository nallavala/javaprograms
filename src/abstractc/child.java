package abstractc;

public class child extends parent {
public static void main(String args[]) {
	System.out.println("main parent method");
	child a= new child();
	//a.green(); this method is in private if method i private that extend then its not extends by this present class
	a.red();
	a.orange();
	
}
	@Override
	public void orange() {
		// TODO Auto-generated method stub
		System.out.println("it has to print orage color");
	}

}
