package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Stack001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the N");
		n=scanner.nextInt();
		
		
		Stack<Integer> myStack=new Stack<Integer>();
		
		for(int i=0 ; i<n ; i++){
			int number=0;
			number=scanner.nextInt();
			
		System.out.println("Enter the number");
		
		myStack.push(number);	
			
		}
		
		while(myStack.size()>0){
			
			int number=myStack.pop();
			
			System.out.println(number);
		}
		
		
		
		
		
		scanner.close();
		
	}

}
