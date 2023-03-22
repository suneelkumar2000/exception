package exception;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Pass extends Exception{
	Pass(String s){
		super(s);
	}
}
class Fail extends Exception{
	Fail(String s){
		super(s);
	}
}
public class Result {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your mark");
		int m=sc.nextInt();
		try {
			if(m>=35) {
				throw new Exception("pass");
			}
			else {
				throw new Exception("fail");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
