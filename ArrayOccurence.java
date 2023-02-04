import java.util.*;
public class ArrayOccurence
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=-1;
				}
			}
			if(b[i]!=-1)
			{
				b[i]=count;
			}	
		}
		
		System.out.println("Array Element Occurence:");
		for(int i=0;i<a.length;i++)
		{
			if(b[i]!=-1)
			{
				System.out.print("Count of "+a[i]+" is "+b[i]);
				System.out.println();
			}
		}
	}
}	
	