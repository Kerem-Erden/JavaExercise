package rectangle;

public class Main {
	public static void main(String[] args) {
		//create the object from the RectanglePerimeter class
		RectanglePerimeter rectangle1 = new RectanglePerimeter(10.0,5.0);
		
		//called the perimeter method
		System.out.println("Perimeter of the rectangle: " + rectangle1.CalculatePerimeter());      
		
		//modify the width and height
		rectangle1.setHeight(9.1);
		rectangle1.setWidht(2.0);
		
		//print the width and height after the modifying
		System.out.println("Perimeter of the rectaangle after modifiying: " + rectangle1.CalculatePerimeter());
	}
}
