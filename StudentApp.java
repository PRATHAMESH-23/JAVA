import java.util.Scanner;
public class StudentApp
{
	public static void main(String args[])
	{
		int id;
		String name;
		float per;
		System.out.println("Enter the id,name and Percentage:");
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		name=sc.next();
		per=sc.nextFloat();
		
		/*System.out.println("ID: "+id);
		System.out.println("NAME: "+name);
		System.out.println("PERCENTAGE: "+per);*/
		
		System.out.println("ID:"+id+"\n"+"NAME:"+name+"\n"+"PERCENTAGE:"+per);
	}
}