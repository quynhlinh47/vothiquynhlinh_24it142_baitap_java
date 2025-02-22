package exercise6_8;

public class MovableRectangle implements Movable {
	MovablePoint topLeft;
	MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new MovablePoint(x1, x2, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}
	public String toString() {
		return topLeft.toString() + "," + bottomRight.toString();
	}
	@Override
	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
		
	}
	@Override
	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
	}
	@Override
	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
		
	}
	@Override
	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
		
	}
}

