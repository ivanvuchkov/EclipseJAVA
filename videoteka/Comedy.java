package videoteka;
public class Comedy extends Videoteka {
	
	private String actor;
	private int time;
	private String name;
	
	public Comedy(int id,String actor,int time,String name){
		super(id);
			this.actor=actor;
			this.time=time;
			this.name=name;
	}
	
	public void setActor(String actor){
		this.actor=actor;
	}
	public String getActor(){
		return actor;
	}
	public void setTime(int time){
		this.time=time;
	}
	public int getTime(){
		return time;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "Comedy [actor=" + actor + ", time=" + time + ", name=" + name + "]";
	}
	

}
