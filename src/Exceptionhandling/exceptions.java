package Exceptionhandling;

public class exceptions {
	public static void main(String args[]) {
		
	
int a= 4;
int b=0;
try {//in this try block benefit of doubt code has been written 
	int c=4/1;
	System.out.println(c);
    }
catch (Exception e){// catch block catch the error and throws output
	System.out.println("error");
}
finally{// finally have used because irrespective of that error is obtain or not its get executed
	System.out.println("delete cookies");
}

}
}
//Questio;when finally is not executable
//Ans;When forcefully stoped the JVM (Java Virtual Machine its stop executed)