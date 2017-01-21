import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Enter number");
		number1=input.nextInt();
		
		System.out.println("Enter number 2");
		
		number2=input.nextInt();
		
		
		if(number1>number2){
			number1=number1+10;
		}
		
		if(number1<number2){
			number2=number2-5;
		}
		System.out.println("number1");
		System.out.println(number1);
		System.out.println("number2");
		System.out.println(number2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
