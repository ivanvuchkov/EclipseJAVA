package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
	
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		
		int number=1;
		
		while(number!=0){
		
			System.out.println("Enter the number");
		number=scanner.nextInt();
		
		myList.add(number);
		
		
		}
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
			
	}

}
