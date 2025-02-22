package exercise6_1;

public class Circle extends Shape{
	protected double radius;
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
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return this.radius * this.radius* Math.PI;
	}
	public double getPerimeter() {
		return this.radius * 2 * Math.PI;
	}
	public String toString() {
		return "Circle[" + super.toString() + ",radius="+ this.radius +"]";
	}
}
