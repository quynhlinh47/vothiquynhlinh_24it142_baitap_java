package exercise6_2;

public class Main {
	public static void main(String[] args) {
		Circle c1 = new Circle(4);
		System.out.println(c1);
		System.out.println("Area: " + c1.getArea() + "   Perimeter: " + c1.getPerimeter());
		
		Rectangle r1 = new Rectangle(6, 8);
		System.out.println(r1);
		System.out.println("Area: " + r1.getArea()+ "   Perimeter: " + r1.getPerimeter());
	}
}
