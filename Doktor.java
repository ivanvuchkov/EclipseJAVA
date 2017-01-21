
public class Doktor {

	
	private String firstName;
	private String secondName;
	private String Spec;
	private Pacient klient;
	
	
	
	public Doktor(String firstName ,String secondName,String Spec,Pacient klient){
	
		this.firstName=firstName;
		this.secondName=secondName;
		this.Spec=Spec;
		this.klient=klient;
		
	
	}
	
	public void setfirstName(String firstName){
		this.firstName=firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setSecondName(String secondName){
		this.secondName=secondName;
	}
	public String getSecondName(){
		return secondName;
		
	}
	public void setSpec(String Spec){
		this.Spec=Spec;
	}
	public String getSpec(){
		return Spec;
		
	}
	public void setKlient(Pacient klient){
		this.klient=klient;
	}
	
	public Pacient getKlient(){
		return klient;
	}

	@Override
	public String toString() {
		return "Doktor [firstName=" + firstName + ", secondName=" + secondName +  ",\n Spec=" + Spec + ", klient=" + klient
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
