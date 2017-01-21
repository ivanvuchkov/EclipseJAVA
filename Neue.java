
public class Neue extends Auto {
	
	
	

	private String motor;
	private String zubehor;
	
	
	
	public Neue(int id,String marke,int jahre,String motor,String zubehor){
		super(id,marke,jahre);
		
		
		this.motor=motor;
		this.zubehor=zubehor;
		
	}
	
	public void setMotor(String motor){
		this.motor=motor;
	}
	public String getMotor(){
		return motor;
	}
	public void setZubehor(String zubehor){
		this.zubehor=zubehor;
	}
	public String getZubehor(){
		return zubehor;
	}
	
	
	
	
	
	
	
	
	

}
