package exercise2_10;

public class MyPoint {
	private double x; 
	private double y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(double x1, double y1) {
		this.x = x1;
		this.y = y1;
	}
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double[] getXY(){
		return new double[] {x,y};
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y-y, 2));
	}
	public double distance (MyPoint another) {
		return Math.sqrt(Math.pow(this.x- another.x ,2)+Math.pow(this.y-another.y, 2));
	}
	public double distance() {
		return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
	}
}



