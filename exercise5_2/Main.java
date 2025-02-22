package exercise5_2;

public class Main {
	   public static void main(String[] args) {
	    
	      Cylinder cylinder1 = new Cylinder();
	      System.out.println("Cylinder 1:");
	      System.out.println("Radius: " + cylinder1.getRadius());
	      System.out.println("Height: " + cylinder1.getHeight());
	      System.out.println("Volume: " + cylinder1.volume());
	      System.out.println("Surface Area: " + cylinder1.surfaceArea());
	      System.out.println();

	      Cylinder cylinder2 = new Cylinder(5.0, 10.0);
	      System.out.println("Cylinder 2:");
	      System.out.println("Radius: " + cylinder2.getRadius());
	      System.out.println("Height: " + cylinder2.getHeight());
	      System.out.println("Volume: " + cylinder2.volume());
	      System.out.println("Surface Area: " + cylinder2.surfaceArea());
	      System.out.println();

	      cylinder1.setRadius(3.0);
	      cylinder1.setHeight(7.0);
	      System.out.println("Modified Cylinder 1:");
	      System.out.println("Radius: " + cylinder1.getRadius());
	      System.out.println("Height: " + cylinder1.getHeight());
	      System.out.println("Volume: " + cylinder1.volume());
	      System.out.println("Surface Area: " + cylinder1.surfaceArea());
	   }
	}

