import java.util.Scanner;

public class JivotniTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner scanner = new Scanner(System.in);
		
		String Poroda;
		int age;
		int sice;
		String jump;
		int speed;
		
		System.out.println("Enter the  Poroda  ,age, sice,,jump,speed of Kotka");
		
		Poroda=scanner.nextLine();
		age=scanner.nextInt();
		sice=scanner.nextInt();
		//jump=scanner.nextLine();
		//speed=scanner.nextInt();*/
		
		
		
		
		
		
		
		
		
		
		Kotka myKotka=new Kotka("Siams", 3 , 40 , "Hoch",30);
		
		System.out.println(myKotka);
		
		
		Kuche myKuche=new Kuche("Ovcharka",4 , 50,"Sehr Hoch","Sehr Hoch","Hoch");
		System.out.println(myKuche);
		
		
		Mechka myMechka=new Mechka("Bqla", 6, 220, 400,"Hoch","Alles");
		System.out.println(myMechka);
		
		
		Bozaik [] arr= new Bozaik [3];
		
		
		arr[0]=myKotka;
		arr[1]=myKuche;
		arr[2]=myMechka;
		
		for(int i=0 ; i<arr.length ;  i++){
			System.out.println(arr[i]);
			
			arr[i].toString();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
