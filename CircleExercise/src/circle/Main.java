package circle;

public class Main {
	public static void main(String[] args) {
		//create object from the Circle class
		Circle circleObj1 = new Circle(2.2);
		
		//print the methods of circle
		System.out.println("Radius of the circle: " + circleObj1.getRadius() + "\nArea of the circle: " + circleObj1.getArea() + "\nCircumference of the circle: " + circleObj1.getCircumference());
		
		//modify the radius
		circleObj1.setRadius(3.3);
		
		//print the methods of circle after the modifying
		System.out.println("After Modifying\n"+ "Radius of the circle : " + circleObj1.getRadius() + "\nArea of the circle: " + circleObj1.getArea() + "\nCircumference of the circle: " + circleObj1.getCircumference());
		
	}
}
