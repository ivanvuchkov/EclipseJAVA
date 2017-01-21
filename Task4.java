import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number");
		
		number = input.nextInt();
		
		if(number%5==0 && number%7==0){
			System.out.println("DA");
		}
		else{
			System.out.println("NE");
		}
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
