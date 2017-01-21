
public class MiniBus  extends PKW {
	
	private int  osi;
	private int tovar;
	
	public MiniBus(int id,int passager , int tank ,String fuel,int osi , int tovar){
		super(id,passager,tank,fuel);
		
		this.osi=osi;
		this.tovar=tovar;
		
		
		
		
	}
	
	
	
	public void setOsi(int osi){
		this.osi=osi;
		
	}
	public int getOsi(){
		return osi;
	}
	public void setTovar(int tovar){
		this.tovar=tovar;
	}
	public int  getTovar(){
		return tovar;
	}
	
	
	
	

}
