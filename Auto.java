
public class Auto extends Teile {

	
	private String marke;
	private int jahre;
	
	
	
	public Auto(int id,String marke,int jahre){
		super(id);
		
		this.marke=marke;
		this.jahre=jahre;
	
	}
	
	public void setMarke(String Marke){
		this.marke=marke;
	}
	public String getMarke(){
		return marke;
	}
	public void setJahre(int jahre){
		this.jahre=jahre;
	}
	public int jahre(){
		return jahre;
	}
	
	
	
	
	
	
}
