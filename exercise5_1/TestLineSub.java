package exercise5_1;

public class TestLineSub {
	public static void main(String[] args) {
		LineSub  l1 = new LineSub(3, 5, 7, 2);
		System.out.println("l1: "+l1);
		
		Point p1 = new Point(3,4);
		Point p2 = new Point(7,2);
		LineSub l2 = new LineSub(p1,  p2);
		System.out.println("l2"+l2);
		
		l1.setBegin(p2);
		l1.setEndY(9);
		System.out.println("l1 after update: "+l1);
		
		System.out.println("Length l1: " + l1.getLength()+ ", l2: " + l2.getLength()  );
		System.out.println(l1.getGradient());
	}
}
