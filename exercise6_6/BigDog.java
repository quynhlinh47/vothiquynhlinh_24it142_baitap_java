package exercise6_6;

public class BigDog extends Dog {
	public BigDog(String n) {
		super(n);
	}
	public void greets() {
		System.out.println("Wooow");
	}
	public void greets(Dog another) {
		System.out.println("Woooooow");
	}
	public void greets (BigDog another) {
		System.out.println("Wooooooooow");
	}
}

