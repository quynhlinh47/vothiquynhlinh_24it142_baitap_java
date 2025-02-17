package exercise3_1;

public class TestMain {
	public static void main(String[] args) {
		MyComplex c1 = new MyComplex(3, 5);
		MyComplex c2 = new MyComplex(2,5);
		System.out.println(c1);
		System.out.println("real: "+ c1.getReal());
		System.out.println("imag: "+ c1.getImag());
		c1.setReal(5.5);
		System.out.println(c1);
		System.out.println(c1.isReal());
		System.out.println(c1.equals(4, 5.5));
		System.out.println(c1.equals(c2));
		System.out.println(c1.magnitude());
		System.out.println(c1.addInto(c2));
		System.out.println(c2.addNew(c1));
	}
}
