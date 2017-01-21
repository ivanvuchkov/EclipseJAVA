
public class Bike extends Nemotorni {
	
	private String description;//opis
	private int speed;
	
	
	
	
	public Bike(int id,int passager,String description,int speed){
		super(id,passager);
		
		this.description=description;
		this.speed=speed;
		
	
	}
	
	public void setDescraption(String descraption){
		this.description=descraption;
	}
	public String getDescraption(){
		return description;
	}
	public void setSpeed(int speed){
		this.speed=speed;
		
	}
	public int getSpeed(){
		return speed;
	}
	

}
