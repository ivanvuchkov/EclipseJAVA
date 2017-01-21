
public class PKW extends Vehicle {
	
	
	private int tank;
	private String fuel;
	
	
	
	public PKW (int id,int passenger ,int tank , String fuel){
		super(id,passenger);
		
		this.tank=tank;
		this.tank=tank;
		
	
		
	}
	
	
	public void setTank(int tank){
		this.tank=tank;
	}
	public int getTank(){
		return tank;
	}
	public void setFuel(String fuel){
		this.fuel=fuel;
		
	}
	public String getFuel(){
		return fuel;
	}
	
	
	
	
	
	
	
	
	
	

}
