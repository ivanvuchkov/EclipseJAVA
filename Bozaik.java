
public class Bozaik {
      
	
	private String Poroda;
	private int age;
	private int sice;
	
	
	
	public Bozaik(String Poroda,int age , int sice){
		this.Poroda=Poroda;
		this.age=age;
		this.sice=sice;
	}
	
	
	public void setPoroda(String Poroda){
		this.Poroda=Poroda;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setSice(int sice){
		this.sice=sice;
		
	}
	public String getPoroda(){
		return Poroda;
	}
	public int getAge(){
		return age;
	}
	public int getSice(){
		return sice;
	}


	@Override
	public String toString() {
		return "Bozaik [Poroda=" + Poroda + ", age=" + age + ", sice=" + sice + "]";
	}
	
	
	
}
