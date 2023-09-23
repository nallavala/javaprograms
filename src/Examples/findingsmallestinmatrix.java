package Examples;
// this is find a smallest number in a matrix and find the maximum number in that row

public class findingsmallestinmatrix {
public static void main(String args[]) {
	int a[][]= {{4,5,-1},{36,7,3},{11,4,6}};
	int minimumcolumn=0;
	int min=a[0][0];
	 for(int i=0;i<3;i++) {
		 for(int j=0;j<a.length;j++) {
			 if(a[i][j]<min) {
				 min=a[i][j];
				 minimumcolumn=j;
			 }
		 }
	 }
	 System.out.println(min   + "mimimum number in matrix");
	 System.out.println(minimumcolumn);
	 int k=0;
	 int max=a[0][minimumcolumn];
	 while(k<3) {
		 if(a[k][minimumcolumn]>max){
			 max=a[k][minimumcolumn];
		 }
		 k++;
	 }
	 System.out.println(max +"maximum in column");
}
}
