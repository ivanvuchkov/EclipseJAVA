import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		//String marke;
		//int baujahre;
		//String farbe;
		//int motor;
		
	//	System.out.println("Bitte entfernen sie das Motor");
	//	motor=scanner.nextInt();
	//	System.out.println("Bitte entfernen sie die Baujahre");
		//baujahre=scanner.nextInt();
		//System.out.println("Bitte entfernen sie das Farbe");
		//farbe=scanner.nextLine();
		//System.out.println("Bitte entfernen sie das Marke");
		//marke=scanner.nextLine();
		
		
		//Car myCar=new Car(baujahre,marke,farbe,motor);
		Car myCar=new Car(2014,"Opel","rot",2500);
		myCar.displayMessage();
		
		Car myCar2=new Car(2010,"BMW","silver",3500);
		
		myCar2.displayMessage();
		
		
		myCar.setFarbe("weiss");
		System.out.println(myCar.getMarke());
		System.out.println(myCar.getFarbe());
		
		
		
		
	}

}
