package Interface;

public class Child implements parent1,Parent2 {

	
	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}
	public void submain() {
		System.out.println("submain");
	}

	@Override
	public void orange() {
		// TODO Auto-generated method stub
		System.out.println("orange");
	}
public static void main(String args[]) {
	System.out.println(name+name2);
	
	System.out.println("main method");
	parent1 c1 =new Child();
	Parent2 c2= new Child();
	c1.green();
	c1.red();
	c1.orange();
	c2.bus();
	c2.car();
	c2.lorry();
	Child p1= new Child ();
	p1.submain();
	/*p1.bus();
	p1.car();
	p1.green();
	p1.red();
	p1.lorry();
	 p1.orange();*/
}

@Override
public void bus() {
	// TODO Auto-generated method stub
	
}

@Override
public void lorry() {
	// TODO Auto-generated method stub
	
}

@Override
public void car() {
	// TODO Auto-generated method stub
	
}

}
