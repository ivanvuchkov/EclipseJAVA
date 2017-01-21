import java.util.Scanner;

public class Simetriq001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner=new Scanner(System.in);	
		
		System.out.println("Enter the element");
		
		
		
		int j;
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
		  System.out.println("Enter the number");
			array[i] = scanner.nextInt();
		  
		}
		
		boolean symmetric = true;
		
		/*for (int i = 0; i < (array.length + 1) / 2; i++) {
		  if (array[i] != array[n - i - 1])
		  symmetric = false;
		}*/
		
		j=n-1;
		
		for(int i = 0 ; i < array.length; i++){
			
			
			
			if(array[i] != array[j]){
				
				symmetric= false;
				
			}
			if(i==j){
				break;
			}
			
			j=j-1;
			
			
		}
		
		System.out.println("Symmetric? "+symmetric);
				
		
		
		scanner.close();
		
		
		
		
	}

}
