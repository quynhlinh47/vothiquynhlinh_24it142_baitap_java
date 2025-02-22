package exercise5_2;
public class Circle {
	   private double radius;
	   private String color;
	   public Circle() {
	      radius = 1.0; 
	      color = "red";
	   }

	   public Circle(double radius) {
	      this.radius = radius;
	   }

	   public double getRadius() {
	      return radius;
	   }

	   public void setRadius(double radius) {
	      this.radius = radius;
	   }

	   public double area() {
	      return Math.PI * radius * radius; 
	   }

	   public double circumference() {
	      return 2 * Math.PI * radius; 
	   }
	}

