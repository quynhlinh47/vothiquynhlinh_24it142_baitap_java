package exercise3_6;

public class Ball {
	private float x, y, xDelta, yDelta;
	private int radius;
	
	public Ball(float x, float y, int radius, float speed, float direction) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		
		this.xDelta = (float) (speed * Math.cos(Math.toRadians(direction)));
		this.yDelta = (float) (-speed * Math.sin(Math.toRadians(direction)));
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getxDelta() {
		return xDelta;
	}

	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}

	public float getyDelta() {
		return yDelta;
	}

	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void move() {
		x += xDelta;
		y += yDelta;
	}
	public void reflectHorizontal() {
        xDelta = -xDelta;
    }
	public void reflectVertical() {
        yDelta = -yDelta;
    }
	 public String toString() {
	        return "Ball[(" + x + ", " + y + "),speed=(" + xDelta + ", " + yDelta + ")]";
	  }
}
