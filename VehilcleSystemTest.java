import java.util.Scanner;

public class VehilcleSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter the ID-number for Car");
		int m=scanner.nextInt();
		
		
		Car MyCar=new Car(m,4,50,"Diesel" ,  "OPEL",7);
		
		System.out.println(MyCar);
		
		
		MiniBus myMiniBus=new MiniBus(134324,6,70,"Diesel",2,1500);
		
		
		System.out.println(myMiniBus);
		
		Bike myBike=new Bike(532423,1,"Cross",30);
		
		System.out.println(myBike);
		
		
		
		MyCar.Calkulate();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
