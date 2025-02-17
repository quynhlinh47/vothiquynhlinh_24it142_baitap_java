package exercise1_1;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	public Circle(double r) {
		this.radius = r;
		color = "red";
	}
	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color="+ color + "]";
	}
}

