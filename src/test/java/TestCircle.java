import org.junit.Test;

import Shapes.Circle;

public class TestCircle {
	private static int radius = 3;
	
	static Circle circle = new Circle(radius);

	@Test
	public void TestArea(){
		System.out.println("Area is" + circle.getArea());
	}
	
	@Test
	public void TestPerimeter(){
		System.out.println("Perimeter is" + circle.getPerimeter());
	}
}
