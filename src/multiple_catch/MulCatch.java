package multiple_catch;

public class MulCatch {
	public static void main(String[] args) {
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Enter second number except zero");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("both numbers are required");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Enter only integer value");
		}
		finally 
		{
			System.out.print("finally block");
		}
	} 

}
