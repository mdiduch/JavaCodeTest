package Shapes;

public class Rectangle implements Shape{
	private double width;
	private double length;
	
	
	public Rectangle()	{
	    width=1.0;
	    length=1.0;
	}
	
	 public Rectangle(double width, double length) {
	        this.width = width;
	        this.length = length;
	    }

	public double getwidth() {
		return width;
	}

	public void setwidth(double width) {
		this.width = width;
	}

	public double getlength() {
		return length;
	}

	public void setlength(double length) {
		this.length = length;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return width * length;
	}

	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 *width + 2 *length;
	}
}
