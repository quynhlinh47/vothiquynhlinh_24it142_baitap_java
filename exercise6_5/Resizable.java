package exercise6_5;

public interface Resizable {
	public void resize(int percent);
}
class ResizableCircle extends Circle implements Resizable {
	
	public ResizableCircle(double radius) {
		super(radius);
	}
	public void resize(int percent) {
		radius *= percent/100.0;
	}
	public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}


