package exercise4_5;

public class TestMain {
	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape);
		
		 Circle circle = new Circle(2.5, "Red", false);
	        System.out.println(circle);
	        System.out.println("Area of Circle: " + circle.getArea());
	        System.out.println("Perimeter of Circle: " + circle.getPerimeter());
	        
	        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", true);
	        System.out.println(rectangle);
	        System.out.println("Area of Rectangle: " + rectangle.getArea());
	        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
	        
	        Square square = new Square(5.0);
	        System.out.println(square);
	        System.out.println("Area of Square: " + square.getArea());
	        System.out.println("Perimeter of Square: " + square.getPerimeter());
	        
	        square.setSize(8.0);
	        System.out.println(square);
	        System.out.println("Area of Square after changing side: " + square.getArea());
	        System.out.println("Perimeter of Square after changing side: " + square.getPerimeter());
	}
}
