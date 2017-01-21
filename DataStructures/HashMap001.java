package DataStructures;


import java.util.HashMap;
import java.util.Scanner;


public class HashMap001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		HashMap<Integer,Integer> myHash=new HashMap <Integer,Integer>();
		
		System.out.println("Enter the size of Array");
		int n=scanner.nextInt();
		
		
		int[] Arr=new int [n];
		
		
		for(int i=0;i<n;i++){
			System.out.println("Enter the number");
			int number=scanner.nextInt();
			
			
			
			if(myHash.containsKey(number)){
			 
				int h;
			System.out.println(number);	
				h=myHash.get(number);
				System.out.println("H e "+h);
				h=h+1;
			myHash.put(number,h);
				//System.out.println(h);
			} 
			
			else{
				myHash.put(number,1);
			}
				
			
		}
		
	System.out.println(myHash);
			
			
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}

}