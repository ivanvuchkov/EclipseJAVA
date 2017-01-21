 
public class Student {

	
	
	private String name;
	private String Studienrichtung;//Studienrichtung//
	private int jahre;
	private int stNummer;
	private int note;
	
	
	public Student(String name,String Studienrichtung,int jahre,int stNumber,int note){
		
		this.name=name;
		this.Studienrichtung=Studienrichtung;
		this.jahre=jahre;
		this.stNummer=stNumber;
		this.note=note;
		
	}
	
	public void displayMessage(){
		
		System.out.println("Willkommen im Studentenbuch" + "," + name + "," + Studienrichtung + "," + jahre + "," + stNummer + "," + note );
		
		
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setStudienrichtung(String Studienrichtung){
		
		this.Studienrichtung  = Studienrichtung;
	}
		
	public void setJahre(int jahre){
		
		this.jahre=jahre;
	}
	
	public void setStNummber(int stNummer){
		
		this.stNummer=stNummer;
	}
	
	public void setNote(int note){
		
		this.note=note;
	}
	
	public String getName(){
		return name;
	}
	
	public String getStudienrichtung(){
		return Studienrichtung;
	}
	
	public int getJahre(){
		return jahre;
	}
	
	public int getStNummer(){
		return stNummer;
	}
	
	public int getNote(){
		return note;
	}
	
	
	
	
	
	
	
}
