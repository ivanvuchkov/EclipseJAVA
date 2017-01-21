
public class Kuche extends Bozaik {

	
	private String smell;//obonqnie
	private  String rumor;//sluh
	private String intelligence;//intelekt
	
	public Kuche (String Poroda,int age, int sice , String smell , String rumor, String intelligence){
		super(Poroda,age,sice);
		
		this.smell=smell;
		this.rumor=rumor;
		this.intelligence=intelligence;
	}
	
	public void setSmell(String smell){
		this.smell=smell;
	}
	@Override
	public String toString() {
		return "Kuche [smell=" + smell + ", rumor=" + rumor + ", intelligence=" + intelligence + ", getPoroda()="
				+ getPoroda() + ", getAge()=" + getAge() + ", getSice()=" + getSice() + "]";
	}

	public String getSmell(){
		return smell;
		
	}
	public void setRumor(String rumor){
		this.rumor=rumor;
	}
	public String getRumor(){
		return rumor;
	}
	public void setIntelligence(String inteligence){
		this.intelligence=inteligence;
		
	}
	public String getIntelligence(){
		return intelligence;
	}

	
	}
	
	
	
	
