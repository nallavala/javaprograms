package Constructor;
//  in his para constructor having the same  constructor and sign should be different
public class paraconstructor {
	public  paraconstructor() {
		System.out.println("i am in constructor");
	}
	public void method() {
		System.out.println("normal class");
	}
	public  paraconstructor(int a, int b) {
		System.out.println("i am in paraconstructor");
	}

	public static void main (String args[]) {
		paraconstructor cc=new paraconstructor();
		paraconstructor ccc=new paraconstructor(45,654);
}
}