package exercise3_7;

public class Ball {
	private float x, y, z;
	
	public Ball(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public float getZ() {
		return z;
	}
	public void setXYZ(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		return "(" + x + "," + y + ","+ z +")";
	}
	public void move(float xDisp, float yDisp) {
		this.x += xDisp;
		this.y += yDisp;
	}
}
