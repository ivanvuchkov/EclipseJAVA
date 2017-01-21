import java.util.Scanner;

public class Cikli1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2-NM da se nameri broq na + i - chisla ;
		Scanner input=new Scanner (System.in);
		
		int n;
		int m;
		int zahler1=0;
		int zahler2=0;
		int zahler3=0;
		int zahler4=0;
		
		System.out.println("Enter the number 1");
		n=input.nextInt();
		
		System.out.println("Enter the number 2");
		m=input.nextInt();
		
		for(int i=n;i<m+1;i++){
			
			if (i<0){
				zahler1=zahler1+1;
			}
			if(i%2==0){
				zahler3=zahler3+1;
			}
			if(i>0){
				zahler2=zahler2+1;
		    }	
			if(i%2==1){
				zahler4=zahler4+1;
		    }
		}
		
		System.out.println("-number is"+zahler1);
		System.out.println("+numberis"+zahler2);
		System.out.println("Chetno"+zahler3);
		System.out.println("Nechetno"+zahler4);
		
		

		
		input.close();
	}

}
