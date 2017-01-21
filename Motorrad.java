import java.util.Scanner;

public class Motorrad extends Teile{
	
	private String marke;
	private int cc;
	
	
	public Motorrad(int id,String marke, int cc){
		super(id);
		
		this.marke=marke;
		this.cc=cc;
		
	}
	
	public void setMarke(String marke){
		this.marke=marke;
	}
	public String getMarke(){
		return marke;
	}
	public void setCc(int cc){
		this.cc=cc;
	}
	public int getCc(){
		return cc;
	}
	
	public void Calkulate(){
		Scanner scanner=new Scanner(System.in);
		
		double kw;
		double ps;
		
		System.out.println("Enter the KW");
		kw=scanner.nextDouble();
		
		
		ps=kw*1.34;
		
		System.out.println("PS ist "+ps);
		
		
	}

}
