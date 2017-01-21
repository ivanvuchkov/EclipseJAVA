import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		
		int number1;
		int number2;
		int number3;
		int sum;
		int raz;
		int result;
		
		System.out.println("Enter the number");
		number1=input.nextInt();
		
		System.out.println("Enter the number2");
		number2= input.nextInt();
		
		System.out.println("Enter the number3");
		number3=input.nextInt();
		
		System.out.println("Sum is");
		sum=number1+number2+number3;
		System.out.println(sum);
		
		
		System.out.println("raz ist");
		raz=number1+number2-number3;
		System.out.println(raz);
		
		System.out.println("result");
		result=number1*number2*number3;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
		
	}

}
