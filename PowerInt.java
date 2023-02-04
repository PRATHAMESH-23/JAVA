import java.util.*;
public class PowerInt
{
	public static void main(String args[])
	{
		int base,index,pow=1;
		System.out.println("Enter the base and Index:");
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		index=sc.nextInt();
		
	/*for(int i=1;i<=index;i++)
		{
			pow=base*pow;
		}*/
		
		while(index!=0)
		{
			pow=pow*base;
			index--;
		}
		System.out.println("Power:"+pow);
	}
}