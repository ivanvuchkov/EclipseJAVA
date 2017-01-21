import java.util.Scanner;


public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int number;
		int edinici;
		int desetici;
		int stotici;
		int hilqdni;
		
		System.out.println("Enter the number");
		number=input.nextInt();
		
		
		edinici=number%10;
		number=number/10;
		
		System.out.println("edinici");
		System.out.println(edinici);
		
		desetici=number%10;
		number=number/10;
		
		
		System.out.println("desetici");
		System.out.println(desetici);
		
		stotici=number%10;
		number=number/10;
		
		
		System.out.println("stotici");
		System.out.println(stotici);
		
		hilqdni=number%10;
		number=number/10;
		
		
		System.out.println("hilqdni");
		System.out.println(hilqdni);
		
				
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
		
	}

}
