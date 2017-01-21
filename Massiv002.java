import java.util.Scanner;

public class Massiv002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int n ;
		
		
		System.out.println("Enter the Array for A and B ");
		n=scanner.nextInt();
		
		int[]a=new int[n];
		int[]b=new int[n];
		int[]c=new int[n];
		
		
		
		for(int i=0 ; i<n ; i++ ){
			System.out.println("Enter the element for A");
			a[i]=scanner.nextInt();
			
		}
		
		for(int i=0 ; i<n ; i++){
			
			System.out.println("Enter yhe element for B");
			
			b[i]=scanner.nextInt();
		}
		
		for(int i=0 ; i<n; i++){
		
			if(a[i]>=b[i]){
				
			c[i]=a[i];
			
				
			}
			if(b[i]>a[i]){
				
				c[i]=b[i];
			}
			
			
		}
		for(int i=0 ; i<n ; i++){
			
			System.out.println("Element of C is "+c[i]);
			
			
		}
			
		
		
		
		
		
		
		
		scanner.close();
		
	}

}
