
public class Circle extends Shape {

	private int radius;
	
	
	public Circle(String color, int x , int y , int radius){
		super(color,x,y);
		
		this.radius=radius;
		
	}
	
	public void setRadius(int radius){
		this.radius=radius;
	}
	public int getRadius(){
		return radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", getX()=" + getX() + ", getY()=" + getY()
				+ "]";
	}
	
	public void draw(){
		
		System.out.println(radius);
		
		super.draw();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
