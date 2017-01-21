import java.util.Scanner;

public class D2Massiv002 {

	public static void main(String[]ags){
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		int n;
		int m;
		
		System.out.println("Enter the sice of rows");
		n=scanner.nextInt();
		
		System.out.println("Enter the sice of columns");
		m=scanner.nextInt();
		
		int [][] arr =new int[n][m];
		
		int sum=0;
		int proiz=0;
		
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0 ; j<arr[0].length ; j++){
				
				System.out.println("Enter the number ");
				arr[i][j]=scanner.nextInt();
				
			}
		}
		for(int i=0 ; i<arr.length ; i++){
			sum=0;
			for(int j=0 ; j<arr[0].length ; j++){
				
				sum=sum+arr[i][j];
		//System.out.println("SUMATA"+sum);
				
			}
			System.out.println("Sum is "+sum);
		}
		
		for(int j=0 ; j<arr[0].length ; j++){
			proiz=1;
		for(int i=0 ; i<arr.length ; i++){
			
				proiz=arr[i][j]*proiz;
			//System.out.println("proiz"+proiz);
			}
			System.out.println("Proizvedenieto is  "+ proiz);
			
		}
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0 ; j<arr[0].length ; j++){
		
		
		System.out.print(arr[i][j]+" " );
		
			}
			System.out.println();
		}
		
		scanner.close();
		
	}
}
