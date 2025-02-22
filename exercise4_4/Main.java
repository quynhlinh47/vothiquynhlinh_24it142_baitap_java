package exercise4_4;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		MovablePoint m1 = new MovablePoint(1.0f, 1.0f, 0.5f, 0.5f);
		System.out.println(m1);
		System.out.println("Speed: " + Arrays.toString(m1.getSpeed()));
		
		m1.setSpeed(1.5f, 1.5f);
		System.out.println(m1);

		m1.move();
		System.out.println("After moving: "+ m1);
		
	}
}
