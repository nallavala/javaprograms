package Examples;

public class innnerloop 
{

	public static void main(String[] args)
	{
	int i=3;
		for(int a=1;a<=4;a++) 
		{
			for(int j=1;j<=a;j++)
			//for(int j=1:j<=10-a;j++)	// this is for different order 
			{
				System.out.print(i);
			    i=i+3;
				System.out.print("\t");
			}
			System.out.println(" ");
		}
    }
}
