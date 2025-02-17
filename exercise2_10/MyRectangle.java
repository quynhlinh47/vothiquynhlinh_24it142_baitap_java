package exercise2_10;

public class MyRectangle {
	private MyPoint topLeft, bottomRight;

    public MyRectangle(double x1, double y1, double x2, double y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public double getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft.toString() +
               ",bottomRight="+bottomRight.toString()+"]";
    }
}
