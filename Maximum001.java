import java.util.Scanner;

public class Maximum001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		
		
		int max=Integer.MIN_VALUE;
		
		
		System.out.println("Enter the size of the Array");
		int n=scanner.nextInt();
		
		int[]arr=new int[n];

		
		for(int i=0;i<arr.length;i++){
			
			System.out.println("Enter the number");
			
			arr[i]=scanner.nextInt();
		
		}
		
		
		
		for(int i=0;i<arr.length;i++){
	
			if(arr[i]>max){
				max=arr[i];
			}
			
		}
		
		
			System.out.println("the biggest number is"+ max);
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}

}
