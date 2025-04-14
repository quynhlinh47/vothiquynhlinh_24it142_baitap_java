package Chef_Customer;

public class Main {
	public static void main(String[] args) {
		DiningTable table = new DiningTable();
		Thread t1 = new Chef(table);
		Thread t2 = new Customer(table);
		t1.start();
		t2.start();
	}
}
