import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		int number1;
		int number2;
		int number3;
		
		System.out.println("Enter the 3 number");
		number1=scanner.nextInt();
		number2=scanner.nextInt();
		number3=scanner.nextInt();
		
		 
		int result;
		result=minimum3(number1,number2,number3);
		
		System.out.println("Am kleinesten Zahl ist"+result);
		
	}
	
	public static int minimum3 (int a , int b, int c ){
		
		int mitte;
		mitte=Math.min(a,b);
		int min;
		min=Math.min(mitte,c);
		
		return min;
		
		
	}
}
