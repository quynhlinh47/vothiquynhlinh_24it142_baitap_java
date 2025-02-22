package exercise5_1;

public class Line {
	private Point begin;
	private Point end;

	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}

	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY);
		end = new Point(endX, endY);
	}

	public String toString() {
		return "Line = (" + this.begin + "," + this.end + ")";
	}

	public Point getBegin() {
		return begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return begin.getX();
	}

	public int getBeginY() {
		return begin.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int beginX) {
		begin.setX(beginX);
	}

	public void setBeginY(int beginY) {
		begin.setY(beginY);
	}

	public void setBeginXY(int bX, int bY) {
		begin.setXY(bX, bY);
	}

	public void setEndX(int eX) {
		end.setX(eX);
	}

	public void setEndY(int eY) {
		end.setY(eY);
	}

	public void setEndXY(int eX, int eY) {
		end.setXY(eX, eY);
	}

	public int getLength() {
		int xDiff = end.getX() - begin.getX();
		int yDiff = end.getY() - begin.getY();
		return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double getGradient() {
		int xDiff = end.getX() - begin.getX();
		int yDiff = end.getY() - begin.getY();
		return Math.atan2(yDiff, xDiff);
	}
}
