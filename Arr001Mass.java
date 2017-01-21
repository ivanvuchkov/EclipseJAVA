import java.util.Scanner;

public class Arr001Mass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int counter1=0;
		int counter=0;
		int n;
		System.out.println("Enter the number");
		n=scanner.nextInt();
		
		int[] arr = new int [n];
		
		for(int i=0; i<arr.length ; i++){
			arr[i]=scanner.nextInt();
			
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]>0){
				counter=counter+1;
		
			}
			
			if(arr[i]<0){
				counter1=counter1+1;
			}
			
		}
		
		
		System.out.println("The number of positiv ist "+counter);
		System.out.println("The number of negativ  ist "+counter1);
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		
	}

}
