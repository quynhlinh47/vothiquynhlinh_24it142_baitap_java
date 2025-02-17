package exercise2_9;

public class TestMain {
	public static void main(String[] args) {
		MyTriangle t1 = new MyTriangle(2,3,5,6,7,1);
		System.out.println(t1);
		System.out.println(t1.getPerimeter());
		System.out.println(t1.getType());
	}
}
