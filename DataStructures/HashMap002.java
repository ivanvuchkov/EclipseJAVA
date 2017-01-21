package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class HashMap002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// da premahnem vs chisla s ne chetno value
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int n=scanner.nextInt();
		
		ArrayList<Integer>myArr=new ArrayList<Integer>();
		
		HashMap<Integer,Integer> myHash= new HashMap<Integer,Integer>();
		
		//HashMap<Integer,ArrayList<Integer>>myHash=new HashMap<Integer,ArrayList<Integer>>();
		
		//HashMap<Integer,HashMap<String,ArrayList<Integer>>>  myHash1= new HashMap<Integer,HashMap<String,ArrayList<Integer>>>();
		
		for(int i=0;i<n;i++){
			System.out.println("Enter the number");
			int number=scanner.nextInt();
			myArr.add(number);
		}
		for(int i=0;i<n;i++){
			
			int number;
			number=myArr.get(i);
			
			if(myHash.containsKey(number)){
				int val=0;
				val=myHash.get(number);
				val=val+1;
				myHash.put(number, val);
				
				
			}
			else{
				myHash.put(number,1);
			}
			
		}
		System.out.print(myHash);
		System.out.println("Tuk"+myArr);
		for(Integer number:myHash.keySet()){
			
			int vol=myHash.get(number);
			
			if(vol%2==1){
				for(int i=0;i<myArr.size();i++){
					if(myArr.get(i)==number){
						myArr.remove(number);
						i--;
					}
				}
				
			}
			
		}
		//System.out.println(myHash);
		System.out.println(myArr);
		
		
		
		
		
		
		
		
	}

}
