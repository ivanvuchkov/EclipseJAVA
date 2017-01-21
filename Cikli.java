import java.util.Scanner;

public class Cikli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ot inerval K i M da se narqt vs treicifreni chisla i tqhniq sbor
		Scanner input=new Scanner(System.in);
		
		int k;
		int m;
		int sum=0;
		int number;
		int edinici;
		int desetici;
		int stotici;
		int counter=0;
		
		System.out.println("Enter k");
		k=input.nextInt();
		
		System.out.println("Enter M ");
		m=input.nextInt();
		
		if(k>99 && k<1000 && m>99 && m<1000){

			for(int i=k;i<m;i++){
				
				counter=counter+1;
				
				number=i;
				
				edinici=number%10;
				number=number/10;		
				desetici=number%10;
				number=number/10;
				stotici=number%10;
				 
				number=edinici+desetici+stotici;
				
				sum=sum+number;
				
				System.out.println(number);
				
				System.out.println("Chisloto is "+ i);
				
				System.out.println("Sumata is"+sum);
				
				
				
				
				
				
				
				
			}
			
			System.out.println("Counter is"+counter);
			
			System.out.println("Sum is"+sum);
		}
		else {
			System.out.println("Ne korektni stoinosti za k ili m , te trqbva da sa 3-cifreni");
			
		}
		
		
		
		
		input.close();
	}

}
