package exercise6_3;

public class MovablePoint implements Movable{
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
	public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Vị trí ban đầu: " + point);
        
        point.moveUp();
        System.out.println("Sau khi moveUp: " + point);
        
        point.moveDown();
        System.out.println("Sau khi moveDown: " + point);
        
        point.moveLeft();
        System.out.println("Sau khi moveLeft: " + point);
        
        point.moveRight();
        System.out.println("Sau khi moveRight: " + point);
	}
}

