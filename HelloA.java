import java.util.Scanner;

public class HelloA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	int number1;
	int number2;
	int number3;
	int number4;
	int sum;
	int res ;
	int result ;
	
	
	
	System.out.println("Enter number 1");
	number1=input.nextInt();
	System.out.println("Enter number 2");
	number2=input.nextInt();
	System.out.println("Enter number 3");
	number3=input.nextInt();
	System.out.println("Enter numer 4");
	number4=input.nextInt();
	System.out.println("sum is");
	
	result=number1+number2-number3*number4;
	
	sum=number1+number2;
	

	res=number1*number2;
	
	System.out.println(sum);
	
	System.out.println("res is");
	System.out.println(res);
	
	System.out.println("result is ");
	
	System.out.println(result);
	
	
	
	
	
	
	
	
	input.close();
	
	
	
	
	
	
	
	
	
	
	
	
}
}