import java.util.*;
import java.scanner;
public class decisionmaking
{
	public static void main(String[]args)
	{
		int choice;
		System.out.println("pick one: 1.hello\t1. 2.hey\t2. 3 hi\t");
		Scanner s= new Scanner(system.in);
		choice=s.nextInt();
		switch(choice)
		{
			case 1 : System.out.println("you said hello");
			break;
			case 2 : System.out.println("you said hey");
			break;
			case 3 : System.out.println("you said hi");
			break;

			default : System.out.println("invalid choice");
		}
	}
}
