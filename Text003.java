import java.util.Scanner;

public class Text003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);


		System.out.println("Enter the Text");
		String text=scanner.nextLine();
		
		
		
		System.out.println("Enter the Old");
		String old=scanner.nextLine();
		
		System.out.println("Enter the New");
		String neue=scanner.nextLine();
		
		
		String result;
		
		result=text.replace(old, neue);
		
		System.out.println(result);
		
		
	}

}
