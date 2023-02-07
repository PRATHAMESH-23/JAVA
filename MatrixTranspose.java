import java.util.*;
public class MatrixTranspose
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the values in Matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display Matrix:");
		for(int n[]:a)
		{
			for(int m:n)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Transpose of Given Matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}