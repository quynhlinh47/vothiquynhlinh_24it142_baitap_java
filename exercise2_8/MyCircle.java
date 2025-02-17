package exercise2_8;

public class MyCircle {
	private MyPoint center;
	private int radius;
	
	public  MyCircle() {
		this.center = new MyPoint(0,0);
		this.radius = 1;
	}
	public  MyCircle(int x, int y, int radius) {
		this.center = new MyPoint(x,y);
		this.radius = radius;
	}
	public MyCircle(MyPoint center, int r) {
		this.center = center;
		this.radius = r;
	}
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int  getCenterX() {
		return center.getX();
	}
	public void setCenterX(int x) {
		center.setX(x);
	}
	public int getCenterY() {
		return center.getY();
	}
	public void setCenterY(int y) {
		center.setY(y);
	}
	public int[] getCenterXY() {
		return new int [] {center.getX(), center.getY()};
	} 
	public void setCenterXY(int x, int y) {
		center.setX(x);
		center.setY(y);
	}
	
	public String toString() {
		return "MyCircle[radius="+radius+",center="+center.toString()+"]";
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getCircumference() {
		return (radius*2)*Math.PI;
	}
	public double distance(MyCircle another) {
	    return this.center.distance(another.getCenter());
	}
}
