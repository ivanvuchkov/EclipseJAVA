import java.util.Scanner;

public class Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		int number;
		
		
		System.out.println("Enter the number from 0 to 100");
		number=scanner.nextInt();
		
		if(number<100){
			
			int result;
			result=Note(number);
			System.out.println("Die Note ist"+result);
		}else{
			System.out.println("Fechler");
		}
		
	
	
	}
 
	
	public static int Note(int point){
		
		if(point>=90&&point<100)
			return 4;
		if(point>=80&&point<90)
			return 3;
		if(point>=70&&point<80)
			return 2;
		if(point>=60&&point<70)
			return 1;
		if(point<60)
			return 0;
		return 0;
	}
}
