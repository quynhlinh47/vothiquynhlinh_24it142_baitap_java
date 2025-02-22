package exercise6_4;

interface Movable {
	abstract void moveUp();
	abstract void moveDown();
	abstract void moveLeft();
	abstract void moveRight();
}
class MovablePoint implements Movable{
	int x, y;
	int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
	    this.y = y;
	    this.xSpeed = xSpeed;
	    this.ySpeed = ySpeed;
	}
	public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
	}
	public void moveUp() {
		y -= ySpeed;
	}
	public void moveDown() {
		y += ySpeed;
	}
	public void moveLeft() {
		x -= xSpeed;
	}
	public void moveRight() {
		x += xSpeed;
	}
}
class MovableCircle implements Movable{
	int radius;
	MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	public String toString() {
        return center.toString() + ", radius=" + radius;
    }
	@Override
	public void moveUp() {
        center.moveUp();
    }
	@Override
	public void moveDown() {
        center.moveDown();
    }
	@Override
	public void moveLeft() {
        center.moveLeft();
    }
	@Override
	public void moveRight() {
        center.moveRight();
    }
}
