import java.util.Scanner;

public class Task001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n;
		int m;
		int k;
		
		
		System.out.println("Enter the N");
		n=input.nextInt();
		
		System.out.println("Enter the M");
		m=input.nextInt();
		
		System.out.println("Enter the K");
		k=input.nextInt();
		
		if(n>m && n>k){
			
			System.out.println("Nai-golqmo N");
		}
		
		if(m>n && m>k){
			
			System.out.println("Nai-golqmo M");
		}
		
		if(k>n && k>m){
			
			System.out.println("Nai-golqmo K");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
		
	}

}
