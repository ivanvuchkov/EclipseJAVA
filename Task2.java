import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	
	
	int number;
	int zahler=0;
	System.out.println("Enter number");
	number=input.nextInt();
	
	if(number%2==0){
		zahler=zahler+1;
	}
	else{
		System.out.println("Nechetno");
	}

	
	System.out.println("Chetno");
	
	System.out.println("zahler is"+zahler);
	
	
	
	
	
	
	
	
	
	
	
	
	input.close();
	
	}

	
}
