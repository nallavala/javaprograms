package Keywords;

public class Thiskeyword {
int  a=2;
public void demo() {
	int a=5;
	int c=this.a+a;
	System.out.println(a);
	System.out.println(this.a+" This is outside method ");// using this keyword we can get the variable which having same variable that ca get by usig "this"  keyword
	System.out.println(c);
}
public static void main(String args[]) {
	Thiskeyword aa= new Thiskeyword();
	aa.demo();
}
}
