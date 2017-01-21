
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Circle myCircle=new Circle("Red",4,5,20 );
		
		System.out.println(myCircle);
		
		Rectangle myRectangle=new Rectangle("Black",5,6,7,8);
		
		System.out.println(myRectangle);
		
		
		Shape[] arr =new Shape[2];
		
		arr[0]=myCircle;
		arr[1]=myRectangle;
		
		
		
		for(int i=0 ; i<arr.length ; i++){
			
			arr[i].draw();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
