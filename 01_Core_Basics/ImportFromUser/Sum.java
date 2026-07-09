import java.util.*;

public class Sum
{
	public static void main(String ar[])
	{
	Scanner A = new Scanner(System.in);

	System.out.print("full name:-");
	String name = A.nextLine();
	
	System.out.print("gender:-");
	String gen = A.next();
	
	System.out.print("id:-");
	Float id = A.nextFloat();
	
	System.out.print("age:-");
	int age = A.nextInt();	


	System.out.println("\n\n"+name);
	//System.out.println("        ");
	System.out.println(gen+"    "+age);
	//System.out.println("        ");
	System.out.println("ID="+id);
	}
}