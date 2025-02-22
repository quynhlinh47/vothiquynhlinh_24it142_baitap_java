package exercise4_5;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		this.radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius; 
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public double getPerimeter() {
		return (radius * 2) * Math.PI;
	} 
	public String toString() {
		return "Circle[Shape" + super.toString() +",radius=" + this.radius + "]";
	}
}
