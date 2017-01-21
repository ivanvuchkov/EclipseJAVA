
public class Pacient {

	
	private String firstName;
	private String secondName;
	private int age;
	private String adress;
	
	
	public Pacient(String firstName , String  secondName , int age , String adress ){
		
		this.firstName=firstName;
		this.secondName=secondName;
		this.age=age;
		this.adress=adress;
	
		
	}
	
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setSecondName(String secondName){
		this.secondName=firstName;
		
	}
	public String getSecondName(){
		return secondName;
	}
	
	public void  setage(int age){
		this.age=age;
	}	
	
	public int  getAge(){
		return age;
	}
	
	public void setAdress(String adress){
		this.adress=adress;
	}
	public String getAdresse (){
		return adress;
	
	
	}


	@Override
	public String toString() {
		return "Pacient [firstName=" + firstName + ", secondName=" + secondName + ", age=" + age + ", adress=" + adress
				+ "]";
	}
	
	
	
}
