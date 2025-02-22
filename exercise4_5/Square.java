package exercise4_5;

public class Square extends Rectangle {
	public Square() {
		super();
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
		
	}
	public double getSide() {
		return getWidth();
	}
	public void setSize(double size) {
		super.setLength(size);
		super.setWidth(size);
	}
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
	public String toString() {
		return "Square[" + super.toString() + "]";
	}
}
