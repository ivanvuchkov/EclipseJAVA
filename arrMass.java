import java.util.Scanner;

public class arrMass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		
		int produkt=1;
		int n;
		
		System.out.println("Enter the size of the Array");
		n=scanner.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0; i<arr.length; i++){
			
			System.out.println("Enter the element");
			
			arr[i]=scanner.nextInt();
			
		}
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]%5==0){
			
			produkt=produkt*arr[i];
			
			}
			
			
		}
		System.out.println("Produkt is"+produkt);
		
		
		
		
		
		
		scanner.close();
		
		
		
		
	}

}
