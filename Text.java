import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		Scanner scanner=new Scanner(System.in);
		
		
		
		System.out.println("Enter the Text");
		String text=scanner.nextLine();
		
		int index=0;
		
		int counter=0;
		
		index=text.indexOf("in");
		
		while(index!=-1){
			
			counter=counter+1;
			index=text.indexOf("in",index+1);
			
		}
		
		
		System.out.println(counter);
		
		
		
	}

}
