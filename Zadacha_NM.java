import java.util.Scanner;

public class Zadacha_NM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sumata na chislata  v int NM
		Scanner input=new Scanner(System.in);
		
		int M;
		int N;
		int sum=0;
		
		
		
		System.out.println("Enter the number");
		
	    M=input.nextInt();
	    
	    System.out.println("Enter the number2");
	    
	    N=input.nextInt();
	    
	    for(int i=M;i<N+1;i++){
	    	sum=sum+i;
	    	
	    	
	    }
	
	    System.out.println("Sum is"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
