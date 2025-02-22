package exercise6_5;

interface GeometricObject {
	public double getPerimeter();
	public double getArea();
}
 class Circle implements GeometricObject {
	protected double radius;
	public Circle(double r) {
		this.radius = r;
	}
	public String toString() {
		return "Circle[radius=" + this.radius + "]";
	}
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
 
