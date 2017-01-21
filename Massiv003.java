import java.util.Scanner;

public class Massiv003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		int n;
		int counter1=0;
		int counter2=0;
		
		System.out.println("Enter the sice of Array");
		n=scanner.nextInt();
		
		int[]a=new int[n];
		
		for(int i=0 ; i<a.length ; i++){
			
			System.out.println("Enter the Element");
			a[i]=scanner.nextInt();
			
		}
		
		for(int i=0 ; i<a.length ; i++){
			
			if(a[i]>0){
				
				counter1=counter1+1;
				
			}
			
			if(a[i]<0){
				
				counter2=counter2+1;
				
			}
		}
		
		
		int[] b =new int[counter1];
		
		int[] c = new int [counter2];
		
		int j =0;
		
		int k =0;
		
		for(int i=0 ; i<a.length ; i ++){
			
			if(a[i]>0){
				
				b[j]=a[i];
				j=j+1;		
				
			}
			
			if(a[i]<0){
				
				c[k]=a[i];
				k=k+1;
				
			}
		}
		
		for(int i=0 ; i<b.length ; i++){
			
			System.out.println("Element of B is "+b[i] );
		
		}
		
		for(int i=0 ; i<c.length ; i++){
			
			System.out.println("Element of C ist "+c[i]);
			
		}
		
		
		
		scanner.close();
		
	}

}
