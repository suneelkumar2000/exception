package arithmetic_exception;

import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args)
	{
		int a,b;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		try {
			result =a/(b-b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println();
		}
		result = a/(b+b);
		System.out.println("result: "+result);
	}

}
