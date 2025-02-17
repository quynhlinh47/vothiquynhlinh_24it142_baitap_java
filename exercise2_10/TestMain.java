package exercise2_10;

public class TestMain {
public static void main(String[] args) {
	MyPoint p1 = new MyPoint(3.4, 6);
	MyPoint p2 = new MyPoint(3, 6.5);
	MyRectangle r1 = new MyRectangle(2,3,6,7);
	MyRectangle r2 = new MyRectangle(p1, p2);
	System.out.println(r1);
	System.out.println(r2);
	
	System.out.println(r1.getWidth());
	System.out.println(r1.getHeight());
	System.out.println(r1.getArea());
	System.out.println(r1.getPerimeter());
	
}
}
