import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		int n1;
		int n2;
		
		System.out.println("Enter the n1");
		n1=input.nextInt();
		System.out.println("Enter the n2");
		n2=input.nextInt();
		
		if(n1>n2){
			n1=n1+10;
			
		}
		
		if(n2>n1){
			n2=n2-5;
		}
		
		System.out.println("n1");
		System.out.println(n1);
		System.out.println("n2");
		System.out.println(n2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
