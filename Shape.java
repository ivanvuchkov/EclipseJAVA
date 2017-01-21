
public class Shape {

	
	private String color;
	private int x;
	private int y;
	
	
	public Shape (String color, int x , int y){
		
		this.color=color;
		this.x=x;
		this.y=y;
		
		
		
		
		
	}
	
	public void setColor(String color){
		this.color=color;
		
	}
	public String getColor(){
		return color;
	}
	public void setX(int x){
		this.x=x;
		
	}
	public int getX(){
		return x;
		
	}
	public void setY(int y){
		this.y=y;
	}
	public int getY(){
		return y;
	}
	
	
	public void draw(){
		System.out.println(x);
		System.out.println(y);
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
