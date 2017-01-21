import java.util.Scanner;
public class Zadacha003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Molq vavedete 3 chisla");
		int k=scanner.nextInt();
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		
		System.out.println("Molq izberete opziq ot Menu");
		System.out.println("1:Nai golqmoto ot 3 te chisla");
		System.out.println("2:Sborat na chislata");
		System.out.println("3:Razlikata na chislata");
		System.out.println("ili 4 za izhod");
		
		int izbor=scanner.nextInt();
		
		
		while(izbor!=4){
			
			switch(izbor){
			
			case 1:
					int golqmo;
					golqmo=Ubung(k,m,n);
					System.out.println("Nai golqmot e "+golqmo);
					
					break;
			case 2:
				
				int sbor;
					sbor=Plus(k,m,n);
					System.out.println("Sborut na chislata e "+sbor);
					break;
			case 3:
				
				int razlika;
				razlika=Minus(k,m,n);
				System.out.println("Razlikata na chislata e "+razlika);
				break;
			
					
			}		
			System.out.println("Molq izberete opziq ot Menu");
			System.out.println("1:Nai golqmoto ot 3 te chisla");
			System.out.println("2:Sborat na chislata");
			System.out.println("3:Razlikata na chislata");
			System.out.println("ili 4 za izhod");	
			izbor=scanner.nextInt();
		}
	}
	
					
		public static  int Ubung (int k ,int m,int n){
			
			if(k>m&&k>n)
				
				return k;
	
			if(m>k&&m>n)
	
				return m;
	
			if(n>k&&n>m)

				return n;
					
			return n;		
					
					
					
					
					
			}
				
		public static int Plus(int k, int m ,int n){
			int sbor;
			
			sbor=k+m+n;
			return sbor;
		}
		
		
		public static int  Minus(int k ,int m,int n){
			int razlika;
			
			razlika=k-m-n;
			return razlika;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
