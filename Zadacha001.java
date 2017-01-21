import java.util.Scanner;

public class Zadacha001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Enter 3 number");
		num1=scanner.nextInt();
		
		num2=scanner.nextInt();
		
		num3=scanner.nextInt();
		
		
		double result;
		result=Mix(num1,num2,num3);
		System.out.println("Result ist "+result);
		
	
		
	}

	public static double Mix(int a,int b,int c){
		
		double sbor;
		sbor=a+b+c+7;
		double delenie;
		delenie=sbor/2;
		
		return delenie;
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
