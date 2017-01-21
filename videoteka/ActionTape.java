package videoteka;

public class ActionTape  extends Action{
	
	private int year;
	
	
	public ActionTape(int id,String name,String actor,int time,int year){
		

		super(id,name,actor,time);
		
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
		return "ActionTape [year=" + year + "]";
	}


}