package exercise4_5;

public class Rectangle extends Shape {
	private double width ;
	private double length;
	
	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	public double getPerimeter() {
		return (this.length + this.width) * 2;
	}
	public String toString() {
		return "Rectangle[Shape" + super.toString() + ",width=" + this.width + ",length=" + this.length + "]";
	}
}
