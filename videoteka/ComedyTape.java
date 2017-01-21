package videoteka;
public class ComedyTape extends Comedy{
	
	private int year;
	
	
	public ComedyTape(int id,String actor,int time,String name,int year){
		super(id,actor,time,name);
		
		this.year=year;
		
		
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}
	@Override
	public String toString() {
		return "ComedyTape [year=" + year + "]";
	}
	

}
