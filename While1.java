import java.util.Scanner;
public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int sum=0;
		int n;
		int number=1;
		
		System.out.println("Enter the number");
		n=input.nextInt();
		

		while(number<n+1){
			
			
			System.out.println("eto"+number);
			sum=sum+number;
			
			System.out.println("Sum is"+sum);
			
			number++;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
			
	}

}
