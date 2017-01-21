import java.util.Scanner;

public class D2Massiv001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		int n;
		int m;
		int sum=0;
		
		
		System.out.println("Enter the number of rows");
		n=scanner.nextInt();
		
		System.out.println("Ente the number of columns");
		m=scanner.nextInt();
		
		int[][] arr =new int[n][m];
		
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0 ;j<arr[0].length ; j++ ){
				System.out.println("Enter the number");
				arr[i][j]=scanner.nextInt();
	
			}
		}
		
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0 ;j<arr[0].length ; j++ ){
				
				if (arr[i][j]>15){
					
					sum=sum+arr[i][j];
			//	System.out.println(sum);	
				}
					
				
			}
		}
		
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0 ;j<arr[0].length ; j++ ){
			
				System.out.print(arr[i][j]+" " );
				
			}
			System.out.println();
		}
		
		System.out.println("Sum is "+sum);
		
		
		
		
		
		scanner.close();
	}

}
