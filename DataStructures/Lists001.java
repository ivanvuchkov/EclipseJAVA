package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;
public class Lists001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int n=scanner.nextInt();
			
			int[] arr=new int[n];
			
			
			
			ArrayList<Integer>myList=new ArrayList<Integer>();
			
			ArrayList<Integer>myList1=new ArrayList<Integer>();
			
			for(int i=0;i<n;i++){
				int number;
				System.out.println("Enter the number");
				number=scanner.nextInt();
				myList.add(number);
			}

			for(int i=0;i<n;i++){
				if(myList.get(i)>0){
					
					myList1.add(myList.get(i));
					
					
				}
			}
				
				System.out.println(myList1);
				
				System.out.println(myList);
			
			
			
	}

}
