import java.util.*;
public class MatrixSum
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int s[]=new int[3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display array:");
		for(int n[]:a)	 						//for each loop(also called enhance for loop)
		{
			for(int m:n)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum+=a[i][j];
			}
			s[i]=sum;
		}
		
		System.out.println("Display Sum array:");
		
		for(int n:s)
		{
			System.out.println(n);
		}
	}
}
		
		