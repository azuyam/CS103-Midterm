package rectangleOOP;

public class Rectangle {

	// Attributes 
	
	float width, height; 
	
	Rectangle(float width, float height) { 
		
		this.width = width; 
		this.height = height; 
		}
	
	void calculateArea() {
		
		System.out.println("Area: " + (width * height));
		}
	
	void calculatePerimeter() {
		
		System.out.println("Perimeter: " + 2 * (width + height)); 
	}

}
