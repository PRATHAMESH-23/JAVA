import java.util.*;
public class TableInt
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int t=n*i;
			System.out.println(n+"*"+i+"="+t);
		}
	}
}