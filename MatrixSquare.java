import java.util.*;
public class MatrixSquare
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int s[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the values in array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int sum=0;
				for(int k=0;k<a.length;k++)
				{
					sum=sum+a[i][j]*a[j][k];
				}
			s[i][j]=sum;
			}
		}
		
	System.out.println("Display Square matrix:");
	for(int n[]:s)
	{
		for(int m:n)
		{
			System.out.print(m+" ");
		}
		System.out.println();
	}
	}
}

				
		
		
	