import java.util.*;

public class ArrayMerge
{
	public static void main(String args[])
	{
		int a[]=new int[3];
		int b[]=new int[3];
		int s[]=new int[6];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in  1st array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			s[i]=a[i];
		}
		
		System.out.println("Enter the elements in  2nd array:");
		int k=a.length;
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
			s[k]=b[i];
			k++;
		}
		
		System.out.println("After merging two arrays:");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+"\t");
		}
	}
}