import java.util.*;

public class JaggedArray
{
	public static void main(String args[])
	{
		int a[][]=new int[3][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=(int)(Math.random()*50);  //Math.random returns a random double type number greater than or equal to 0.0 and less than 1.0
			}
		}

		System.out.println("Display Jagged Array:");
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		
		for(int n[]:a)	 //for each loop(also called enhance for loop)
		{
			for(int m:n)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}