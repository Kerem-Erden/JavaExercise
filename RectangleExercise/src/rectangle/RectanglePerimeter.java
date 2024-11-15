package rectangle;

public class RectanglePerimeter {
	//create the attributes 
	private double widht;
	private double height;
	
	//create the constructor
	public RectanglePerimeter(double width, double height) {
		this.widht = width;
		this.height = height;
	}
	
	//get and set methods
	
	public double getWidht() {
		return widht;
	}
	public void setWidht(double widht) {
		this.widht = widht;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//area calculator and getter
	public double getArea() {
		return widht * height;
	}
	
	//create the perimeter calculator method
	public double CalculatePerimeter() {
		double perimeter = 2 * (height + widht);
		return perimeter;
	}
}
