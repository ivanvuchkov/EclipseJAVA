
public class Kotka extends Bozaik {
	
	
	@Override
	public String toString() {
		return "Kotka [superJump=" + superJump + ", Speed=" + Speed + ", getPoroda()=" + getPoroda() + ", getAge()="
				+ getAge() + ", getSice()=" + getSice() + "]";
	}
	private String superJump;
	private int Speed;
	
	
	
	
	public Kotka(String Poroda,int age,int sice,String superJump,int Speed){
		super(Poroda,age,sice);

		this.superJump=superJump;
		this.Speed=Speed;
		
	}
	
	public void setSuperJump(String superJump){
		this.superJump=superJump;
	}
	public void setSpeed(int Speed){
		this.Speed=Speed;
	}
	public String getSuperJump(){
		return superJump;
	}
	public int getSpeed(){
		return Speed;
	}

	
	}
	
	


