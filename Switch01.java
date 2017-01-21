import java.util.Scanner;
public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		
		int number;
		
		System.out.println("Enter the number");
		number=input.nextInt();
		
		
		switch(number%10){
		
			case 0:System.out.println("Nul");break;			
			case 1:System.out.println("Ein");break;
			case 2:System.out.println("Zwei");break;
			case 3:System.out.println("Drei");break;
			case 4:System.out.println("Vier");break;
			case 5:System.out.println("Funf");break;
			case 6:System.out.println("Sechs");break;
			case 7:System.out.println("Sieben");break;
			case 8:System.out.println("Acht");break;
			case 9:System.out.println("Neun");break;
			
			default:System.out.println("Fehler");break;
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
