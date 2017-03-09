import org.junit.Test;

import Shapes.Triangle;

public class TestTraingle {
	private static double side1 = 3.0;
	private static double side2 = 3.0;
	private static double side3 = 3.0;
	
	static Triangle triangle = new Triangle(side1, side2, side3);
	
	@Test
	public void TestArea(){
		System.out.println("Area is" + triangle.getArea());
	}
	
	@Test
	public void TestPerimeter(){
		System.out.println("Perimeter is" + triangle.getPerimeter());
	}
}
