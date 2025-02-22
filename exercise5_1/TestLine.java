package exercise5_1;

public class TestLine {
	public static void main(String[] args) {
		Line l1 = new Line(0, 0, 3, 4);
		System.out.println(l1);
		
		Point p1 = new Point(2, 7);
		Point p2 = new Point(3, 5);
		Line l2 = new Line(p1, p2);
		System.out.println(l2);
		System.out.println("Length: " + l1.getLength()+ " , " + l2.getLength());
		System.out.println("Gradient: " + l1.getGradient() + " , " + l2.getGradient());
	}
}
