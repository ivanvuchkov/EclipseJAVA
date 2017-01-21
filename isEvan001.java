import java.util.Scanner;

public class isEvan001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		int number;
		
		System.out.println("Enter the number");
		number=scanner.nextInt();
		
	boolean result;
	result=isEven(number);
		
	
	System.out.println("Chetno li e ?    "+result );
	
	
	}

	public static boolean isEven(int number){
		
		if(number%2==0){
			return true;
		}
		
		else{
			return false;
		}
		
		
		
	}
	
	
	
	
}
