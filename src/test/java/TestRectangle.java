import org.junit.Test;

import Shapes.Rectangle;

public class TestRectangle {
	private static double width = 2;
	private static double length = 2;
	
	static Rectangle rectangle = new Rectangle(width, length);

	@Test
	public void TestArea(){
		System.out.println("Area is" + rectangle.getArea());
	}
	
	@Test
	public void TestPerimeter(){
		System.out.println("Perimeter is" + rectangle.getPerimeter());
	}
	

}
