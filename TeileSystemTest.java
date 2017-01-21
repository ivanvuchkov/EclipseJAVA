import java.util.Scanner;

public class TeileSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter the Id number");
		int m=scanner.nextInt();
		
		Auto myAuto=new Auto(35435,"Opel",1994);
		

		System.out.println(myAuto);
		
		Neue myNeue=new Neue(23143,"Peugeot",1999,"Diesel","Lenkrad");
		
		System.out.println(myNeue);
		
		Gebraucht myGebraucht=new Gebraucht(12312,"Skoda",2007,"Benzin","Felgen");
		
		System.out.println(myGebraucht);
		
		Motorrad myMotorrad=new Motorrad(23323,"Ducati",150);
		
		System.out.println(myMotorrad);
		
		
		myMotorrad.Calkulate();
		
		
		
	}

}
