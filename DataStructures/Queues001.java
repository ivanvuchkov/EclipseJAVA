package DataStructures;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Queues001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3ti element da se prochete 
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of Queue");
		int n=scanner.nextInt();
		
		Queue<Integer> myQue= new LinkedList<Integer>();
		int counter=0;
		
		for(int i=0;i<n;i++){
			System.out.println("Enter the number");
			int number=scanner.nextInt();
			myQue.offer(number);
			
		}
		while(myQue.size()>0){
			
			
			counter=counter+1;
			
			if(counter==3){
				int h;
				
				h=myQue.peek();
				
				System.out.println(h);
				
			}
			myQue.poll();
		}
		
		
		
		
		
		
		scanner.close();
		
	}

}
