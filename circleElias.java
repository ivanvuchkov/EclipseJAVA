import java.util.Scanner;

public class circleElias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter the radius");
		number=scanner.nextInt();
		
		
	double result;
	result=curcleElias(number);
	
	System.out.println("Liceto e ="+result  );
		
		
	}
	public static double curcleElias(int radius) {
		
		double lice;
		
		lice=Math.PI * Math.pow(radius, 2);
		
		return lice;
		
		
	}
	
	
	
	
	
	
	
	
	
}
