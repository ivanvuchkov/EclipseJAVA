import java.util.Scanner;
public class Zadacha002 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);

	int n;
	int m;
	int k;
	
	
	
	System.out.println("Enter the N");
	n=scanner.nextInt();

	System.out.println("Enter the M");
	m=scanner.nextInt();
	
	System.out.println("Enter the K");
	k=scanner.nextInt();
	
	System.out.println("Molq izberete opciq ot Menu");
	System.out.println("1:nai golqmo ot 3te chisla"+"\n"+"2:dali 3toto chislo e nai-golqmo");
	System.out.println("Molq izberete -1 za izhod");
	
	
	int choise;
	choise=scanner.nextInt();
	
	while (choise!=-1){
		
	
	
	switch(choise){
	case 1:
			int result;
			result = Ubung (n,m,k);
			System.out.println("Nai golqmo e "+result);
		break;
	
	case 2:
			boolean result1;
			result1=istDritedieZhalamGrosten(n, m, k);
			System.out.println("Ist die drite Zahal am grossten ?"+result1);
		break;	
	}
	System.out.println("Molq izberete opciq ot Menu");
	System.out.println("1:nai golqmo ot 3te chisla"+"\n"+"2:dali 3toto chislo e nai-golqmo");
	System.out.println("Molq izberete -1 za izhod");
	choise=scanner.nextInt();
	
	}
		
		
/*	
	int result;
	result = Ubung (n,m,k);
	System.out.println("Nai golqmo e "+result);
	
	boolean result1;
	result1=istDritedieZhalamGrosten(n, m, k);
	System.out.println("Ist die drite Zahal am grossten ?"+result1);
	
	*/

	}

	public static int Ubung(int n,int m,int k){
		
		if(n>m && n>k)
			return n;
		
		if(m>n && m>k)
			return m;
		
		if(k>n && k>m)
			return k;
	
		return k;
	}
	
	public static boolean istDritedieZhalamGrosten(int n,int m,int k){
		
		
		if(k>m&&k>n)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
}
