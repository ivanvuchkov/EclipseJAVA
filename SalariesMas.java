import java.util.Scanner;

public class SalariesMas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		
		int n;
		int sum=0;
		System.out.println("Enter number of Employees");
		n=scanner.nextInt();
		
		
		int[] salaries = new int[n];
		
		for(int i = 0; i < salaries.length; i++){
			System.out.println("Enter the  salary");
			salaries[i]=scanner.nextInt();
		
		} 
		 
		int x=salaries[2];
		salaries[2]=salaries[2]*2;
		
		for(int i = 0; i  <salaries.length; i++){
			salaries[i]=salaries[i]*2;
			sum=salaries[i]+sum;
			
			
		}
		
		for(int i=0; i < salaries.length; i++){
			System.out.println("Number of salaries is"+salaries[i]);
			
		}
		
		System.out.println("Total Sum is"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
