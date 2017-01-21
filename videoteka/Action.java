package videoteka;
public class Action extends Videoteka {
	
	private String name;
	private String actor;
	private int time;
	
	
	public Action(int id,String name,String actor,int time){
		super(id);
		
		this.name=name;
		this.actor=actor;
		this.time=time;
			
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setActor(String Actor){
		this.actor=actor;
	}
	public String getActor(){
		return actor;
	}

	public void setTime(int time){
		this.time=time;
	}
	@Override
	public String toString() {
		return "Action [name=" + name + ", actor=" + actor + ", time=" + time + "]";
	}
	
	
}
