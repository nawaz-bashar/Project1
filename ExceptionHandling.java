
import java.util.Scanner;

public class ExceptionHandling 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number");
		try
		{
			System.out.println(1);
			String s1 = sc.next();
			System.out.println(2);
			int i = Integer.parseInt(s1);
			System.out.println(3);
			int j = i/(i-20);
			System.out.println(4);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(5);
		}
	finally
	{
		System.out.println(600);
	}
	System.out.println("main end");
	}
}