package Shapes;

public class Circle implements Shape{
		 
		protected int radius;
		
		public Circle(int r) {
			radius = r;
		}
		
		public Circle()	{
		    radius=1;
		}
		
		public void setRadius(int r) {
			r = radius;
		}
		
		public int getRadius() {
			return radius;
		}
		
		public int getDiameter() {
			return radius * 2;
		}
		
		public double getArea() {
			return Math.PI  * Math.pow(radius, 2);
		}

		public double getPerimeter() {
			// TODO Auto-generated method stub
			return 2*(Math.PI)*radius;
		}

}
