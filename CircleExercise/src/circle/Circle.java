package circle;

public class Circle {
	//create a radius attribute
	private double radius;
	
	//create the constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//get and set method
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//area and circumference calculator
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
}
