import java.util.Scanner;

public class cikkli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Da se nameri vs 3 -cifreni chisla na koito zbora ot cifrite da e po maluk ot k i M :)
		Scanner input=new Scanner(System.in);
		
		int k;
		int m;
		int edinici;
		int desetici;
		int stotici;
		int number=0;
		int counter=0;
		
		
		System.out.println("Enter m ");
		m=input.nextInt();
		System.out.println("Enter k ");
		k=input.nextInt();
		

		for(int i=100;i<1000;i++){
			
		
				
			
				
				number=i;
				
				edinici=number%10;
			//	System.out.println("edinici"+edinici);
				number=number/10;
			
				desetici=number%10;
			//	System.out.println("desetici"+desetici);
			    number=number/10;
				
				stotici=number%10;
			//	System.out.println("stotici"+stotici);
				
				
				number=edinici+desetici+stotici;
				
				if(number<m && number>k){
					counter=counter+1;
					
					System.out.println("sum  is"+number);
					System.out.println("i is"+i);
					
				}
					
			
		}
		
		System.out.println("Counter is "+counter);
			
		
		input.close();
	}

}
