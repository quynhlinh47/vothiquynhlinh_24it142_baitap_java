package exercise2_8;

public class TestMain {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint (3,2);
		MyCircle c1 = new MyCircle();
		MyCircle c2 = new MyCircle(5,6,3);
		MyCircle c3 = new MyCircle(p1, 3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		c1.setCenterXY(2, 2);
		System.out.println(c1);
		
		System.out.println("area of c2 is: "+ c2.getArea());
		System.out.println("circumference of c3 is: "+ c3.getCircumference());
		System.out.println("Distance between the centers of this cỉcle and the given MyCircle instance another:  "+ c3.distance(c2));
	}
}
