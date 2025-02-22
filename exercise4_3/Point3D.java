package exercise4_3;

public class Point3D extends Point2D{
	private float z;
	public Point3D() {
		super();
		this.z = 0.0f;
	}
	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, float y, float z) {
		super.setXY(x, y);
		this.z = z;
	}
	public float[] getXYZ() {
		float[] xy = super.getXY();
        float[] xyz = new float[3];
        
        xyz[0] = xy[0];
        xyz[1] = xy[1];
        xyz[2] = this.z;
        
        return xyz;
	}
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
	}
}
