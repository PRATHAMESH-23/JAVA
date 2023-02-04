import java.util.*;

public class RightPattern
{
	public static void main(String args[])
	{
		int i,j,n;
		char ch='A';
		System.out.println("Enter the number of rows:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=(n-i);j++)
			{
				System.out.print("  ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
			
	}
}