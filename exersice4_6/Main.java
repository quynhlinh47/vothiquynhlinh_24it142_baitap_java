package exersice4_6;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("poel");
		System.out.println(animal);
		
		Mammal mammal = new Mammal("lunn");
		System.out.println("mammal");
		
		Cat cat = new Cat("meo meo");
		cat.greets();
		System.out.println(cat);
		
		Dog dog = new Dog("gau gau");
		Dog dog1 = new Dog("gou gou");
		dog.greets();
		dog.greets(dog1);
		System.out.println(dog);
		System.out.println(dog1);
	}
}
