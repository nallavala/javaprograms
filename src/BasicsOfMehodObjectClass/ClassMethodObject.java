package BasicsOfMehodObjectClass;
public class ClassMethodObject {
	public void m1() {
		System.out.println("execute 1 ");
	}
	public void m2() {
		System.out.println("execute 2 ");
	}
	public void m3() {
		System.out.println("execute 3");
	}
	public static void main(String args[]) {
		System.out.println("welcome");
		ClassMethodObject n= new ClassMethodObject();//Access method by using Object//n is object here to access method
		n.m1();
		n.m2();
		n.m3();
}
}
