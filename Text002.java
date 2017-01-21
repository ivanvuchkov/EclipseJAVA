import java.util.Scanner;

public class Text002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter the Text");
		String text=scanner.nextLine();
		
		boolean symetric=true;
		
		int j=text.length()-1;
		
		for(int i=0;i<text.length();i++){
			
			System.out.println(text.charAt(i));
			System.out.println(text.charAt(j));
			
			
			
			if(text.charAt(i)!=text.charAt(j)){
				
				symetric =false;
			
				
			}
			
			j=j-1;
			
			if(i==j){
				
				
				break;
			}
		
			
		}
		
		
		System.out.println(symetric);
		
		
		
		
		
		
	}

}
