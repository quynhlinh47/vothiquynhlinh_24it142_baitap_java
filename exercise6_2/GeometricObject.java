package exercise6_2;

interface GeometricObject {
	public double getArea();
	public double getPerimeter();
}
class Circle implements GeometricObject{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
        return Math.PI * radius * radius; 
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public String toString() {
		return "Circle[radius=" + this.radius + "]";
	}
}
class Rectangle implements GeometricObject{
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public String toString() {
		return "Rectangle[width=" + this.width + ", length=" + this.length + "]";
	}
	public double getArea() {
		return this.width * this.length;
	}
	public double getPerimeter() {
		return (this.length + this.width) * 2;
	}
}

