package exercise3_6;

public class Container {
	private int x1, y1, x2, y2;
	
	public Container(int x1, int y1, int width, int height) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x1 + width - 1;
        this.y2 = y1 + height - 1;
	}
	public int getX() {
		return x1;
	}
	public int getY() {
		return y1;
	}
	public int getWidth() {
		return x2 - x1 + 1;
	}
	public int getHeight() {
		return y2 - y1 +1;
	}
	public boolean collidesWith(Ball ball) {
        boolean reflected = false;
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() + ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            reflected = true;
        }
        if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() + ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            reflected = true;
        }

        return reflected;
	}
	public String toString() {
		return "Container[(" + x1 +","+ y1 +"),(" + x2 + "," + y2 + ")]";
	}
}
