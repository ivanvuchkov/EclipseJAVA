import java.util.Scanner;

public class Text001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a?a
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter the Text");
		String text=scanner.nextLine();
		
		int counter=0;
		
		for(int i=0;i<text.length()-2;i++){
			
		char ch;
		
		ch=text.charAt(i);
		
		if(ch=='a'){
			
		char vh;
		
		vh=text.charAt(i+2);
	
		if(vh=='a'){
		
			
			counter=counter+1;
		
			
		}
		
		
		
		
		}
		
		
		
			
		}
		
		System.out.println(counter);
		
		
		
		
	}

}
