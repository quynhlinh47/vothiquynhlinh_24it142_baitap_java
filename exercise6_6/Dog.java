package exercise6_6;

public class Dog extends Animal{
	public Dog(String n) {
		super(n);
	}
	public void  greets() {
		System.out.println("Woof");
	}
	public void greets(Dog another) {
		System.out.println("Woooof");
	}
}


