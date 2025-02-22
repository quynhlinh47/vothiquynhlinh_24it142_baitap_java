package exercise6_6;

public class Main {
	public static void main(String[] args) {
		Animal cat = new Cat("Kitty");
        Dog dog = new Dog("Buddy");
        BigDog bigDog1 = new BigDog("Max");
        BigDog bigDog2 = new BigDog("Rex");

        cat.greets();            
        dog.greets();            
        bigDog1.greets();        

        dog.greets(dog);         
        bigDog1.greets(dog);     
        bigDog1.greets(bigDog2);
	}
}

