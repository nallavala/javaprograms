package Examples;

import java.util.Scanner;

public class Switchstatement {
public static void main(String args[]) {
	Scanner A= new Scanner(System.in);
	System.out.println("1.ADD");
	System.out.println("2.SUB");
	System.out.println("3.DIV");
	System.out.println("4.MUL");
	System.out.println("Enter the first value");
	int a=A.nextInt();
	System.out.println("Enter the second value");
	int b=A.nextInt();
	System.out.println("Enter choice");
	int ch=A.nextInt();
	switch(ch){
	case 1:
		System.out.println(a+b);
		break;
	case 2:
		System.out.println(a-b);
		break;
	case 3:
		System.out.println(a/b);
		break;
	case 4:
		System.out.println(a*b);
		break;
		default:
			System.out.println("Invalid entry");
	}
}
}
