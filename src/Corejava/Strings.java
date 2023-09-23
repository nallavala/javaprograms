package Corejava;

public class Strings {
public static void main(String args[]) {
	String a="Java Training";
	// this is define that character at 5
	System.out.println(a.charAt(5));
	//This is define that connecting the string with the output that we want to print
	System.out.println(a.concat( " that which i learning"));
	// This define that character is at which index
	System.out.println(a.indexOf("i"));
	//This define that character of index starting from 3 to end of characters have been printed
	System.out.println(a.substring(3));
	//This define that character of index  from 2nd to 7 the have been printed 
	System.out.println(a.substring(2, 7));
	//This defined to trim the spaces before sentence 
	System.out.println(a.trim());
	//this is used to define that to divide into 2 words by arr[]
	String arr[]= a.split("T");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	// This is used for replacing the characters
	System.out.println(a.replace("T", "t"));
	//This is used for upper and lower cases
	System.out.println(a.toUpperCase());
    System.out.println(a.toLowerCase());
    
}
}
