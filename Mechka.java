
public class Mechka extends Bozaik {

	private  int weight;  //teglo
	private String nails; //nokti
	private String food;
	
	
	public Mechka(String Poroda,int age, int sice,int weight,String nails,String food){
		super(Poroda,age,sice);
		
		this.weight=weight;
		this.food=food;
		this.nails=nails;
		
		
	}
	
	public void setWeight(int weight){
		this.weight=weight;
		
	}
	public int getWeight(){
		return weight;
	}
	public void setNails(String nails){
		this.nails=nails;
	}
	public String getNails(){
		return nails;
		
	}
	public void setFood(String food ){
		this.food=food;
	}
	public String getFood(){
		return food;
	}

	@Override
	public String toString() {
		return "Mechka [weight=" + weight + ", nails=" + nails + ", food=" + food + ", getPoroda()=" + getPoroda()
				+ ", getAge()=" + getAge() + ", getSice()=" + getSice() + "]";
	}
	
}
