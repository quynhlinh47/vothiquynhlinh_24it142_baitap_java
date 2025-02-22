package exercise4_3;

public class TestMain {
	public static void main(String[] args) {
		Point3D p = new Point3D(3.0f, 4.0f, 5.0f);
		System.out.println(p);
		
		p.setXYZ(1.0f, 2.5f, 3.0f);
		System.out.println(p);
		float[] coordinates = p.getXYZ();
        System.out.println("x = " + coordinates[0] + ", y = " + coordinates[1] + ", z = " + coordinates[2]);
	}
}
