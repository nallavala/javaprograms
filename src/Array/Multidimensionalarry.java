package Array;

public class Multidimensionalarry {
public static void main(String args[]) {
	int b[][]= {{11,22,33},{44,55,66},{77,88,99}};
	int a[][] = new int[3][3];
	a[0][0]=1;
	a[0][1]=2;
	a[0][2]=3;
	a[1][0]=4;
	a[1][1]=5;
	a[1][2]=6;
	a[2][0]=7;
	a[2][1]=8;
	a[2][2]=9;
	 for(int i=0;i<b.length;i++) {
		 for(int j=0;j<3;j++)
		 {
			 System.out.print(" "+ b[i][j] );
		 }
		 System.out.println(" ");
		 System.out.println("\t");
	 }

}
}
