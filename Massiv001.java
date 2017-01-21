import java.util.Scanner;

public class Massiv001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
	
		
	int n;
	int k;
	int sbor=0;
	
	System.out.println("Enter the sice of Array");
	n=scanner.nextInt();
	
	int[]a=new int[n];
		
	System.out.println("Enter the sice of K");
	k=scanner.nextInt();
	
	for(int i=0 ; i<a.length ; i++){
		
		System.out.println("Enter the element");
		
		a[i]=scanner.nextInt();
		
		
	}
		
		for(int i=0 ; i <a.length ; i++){
			//System.out.println(a[i]/100%10);
			if(Math.abs(a[i]/100%10)==k){
				
				//System.out.println(a[i]);
				sbor=sbor+a[i];
				
			}
				
					
			
		}
		
		System.out.println("Sbor ist  " + sbor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		
	}

}
