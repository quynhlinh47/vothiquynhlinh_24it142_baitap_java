package exercise2_7;

public class TestMain {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(3, 6);
		System.out.println(p2);
		
		MyLine l1 = new MyLine(2, 3, 6, 4);
		MyLine l2 = new MyLine(p1, p2);
		System.out.println(l1);
		
		System.out.println("Begin of MyLine l1: "+ l1.getBeginX()+ " "+ l1.getBeginY());
		System.out.println("End of MyLine l2: "+ l2.getEndX() + " "+ l2.getEndY());
		l2.setBeginXY(3,2);
		System.out.println(l2);
		System.out.println("Length of MyLine l1:"+l1.getLength() +" ,l2:"+ l2.getLength());
		System.out.println("Gradient of MyLine l1:"+ l1.getGradient()+" ,l2:"+ l2.getGradient());
		
	}
}
