
public class Rectangle extends Shape {
	
	
	private int height;
	private int width;
	
	
	public Rectangle(String color, int x , int y , int height , int width){
		super(color,x,y);
		
		this.height=height;
		this.width=width;
	}
	
	public void setHeight(int height){
		this.height=height;
		
	}
	public int getHeight(){
		return height;
	}
	public void setWidth(int width){
		this.width=width;
	}
	public int getWidth(){
		return width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", getColor()=" + getColor() + ", getX()=" + getX()
				+ ", getY()=" + getY() + "]";
	}
	
	
	public void draw(){
		
		System.out.println(height+" "+width );
		
		super.draw();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
