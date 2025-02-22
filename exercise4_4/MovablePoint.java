package exercise4_4;

public class MovablePoint extends Point {
	private float xSpeed;
	private float ySpeed;
	
	public MovablePoint() {
		super();
		this.xSpeed = 0.0f;
		this.ySpeed = 0.0f;
	}
	public MovablePoint(float x, float y, float xS, float yS) {
		super(x, y);
		this.xSpeed = xS;
		this.ySpeed = yS;
	}
	public MovablePoint(float xS, float yS) {
		this.xSpeed = xS;
		this.ySpeed = yS;
	}
	
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public void setSpeed(float xS, float yS) {
		this.xSpeed = xS;
		this.ySpeed = yS;
	}
	public float[] getSpeed() {
		return new float[] {this.xSpeed, this.ySpeed};
	}
	public String toString() {
		return super.toString() +",speed=(" + this.xSpeed + "," + this.ySpeed + ")";
	}
	public MovablePoint move() {
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);
		return this;
	}
	
}
