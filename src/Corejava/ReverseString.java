package Corejava;

public class ReverseString {

	public static void main(String[] args) {
		String A = "ashok";
		String b=" ";
		for(int i=A.length()-1;i>=0;i--)
		{
			b=b+ A.charAt(i);
		}
System.out.println(b);
	}

}
