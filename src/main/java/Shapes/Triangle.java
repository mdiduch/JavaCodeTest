package Shapes;

public class Triangle implements Shape{
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()	{
	    side1=1.0;
	    side2=1.0;
	    side3=1.0;
	}
	
	 public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	public double getside1() {
		return side1;
	}

	public void setside1(double side1) {
		this.side1 = side1;
	}

	public double getside2() {
		return side2;
	}

	public void setside2(double side2) {
		this.side2 = side2;
	}

	public double getside3() {
		return side3;
	}

	public void setside3(double side3) {
		this.side3 = side3;
	}
	public double getArea() {
		// TODO Auto-generated method stub
		double p = getPerimeter() / 2;
		return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	}

	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side1 + side2+ side3;
	}
	
	

}
