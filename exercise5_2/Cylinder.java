package exercise5_2;
public class Cylinder {
	   private Circle base;
	   private double height;

	   public Cylinder() {
	      base = new Circle();  
	      height = 1.0;        
	   }

	   public Cylinder(double radius, double height) {
	      base = new Circle(radius);  
	      this.height = height;
	   }

	   public double getRadius() {
	      return base.getRadius();  
	   }

	   public void setRadius(double radius) {
	      base.setRadius(radius);  
	   }

	   public double getHeight() {
	      return height;
	   }

	   public void setHeight(double height) {
	      this.height = height;
	   }

	   public double volume() {
	      return base.area() * height; 
	   }

	   public double surfaceArea() {
	      return 2 * base.area() + base.circumference() * height;  
	   }
	}

