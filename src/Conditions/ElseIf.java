package Conditions;
public class ElseIf {
	public static void main(String [] args) {
		int Marks = 90;
		if (Marks<=40)
		{
			System.out.println("grade F");
		}
		else if(Marks==50) {
			System.out.println("Grade C");
		}
		else if (Marks==70) {
			System.out.println("Grade b");
		}
		else if (Marks>=80) {
			System.out.println("grade A");
		}
		else {
			System.out.println("Not Applicable");
		}
		}
}
