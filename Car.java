import java.util.Scanner;

public class Car  extends PKW {
	
	
	
	
	
	private String description;//opisa
	private int razhod;//
	
	
	
	
	
	public Car(int id,int passenger ,  int tank,String fuel, String description , int razhod ){
		super(id,passenger,tank,fuel);
		
		
		this.description=description;
		this.razhod=razhod;
		
		
	}

	public void setDescription(String description){
		this.description=description;
		
	}
	public String getDescription(){
		return description;
	}
	public void setRazhod(int razhod){
		this.razhod=razhod;
	}
	public int getRazhod(){
		return razhod;
	}
	
	
	public  void Calkulate(){
		int k;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the km");
		k=scanner.nextInt();
		
		System.out.println("Calkilate is   "+k*razhod);
		
		
		
	}
	
	
	
	
	
	

}
