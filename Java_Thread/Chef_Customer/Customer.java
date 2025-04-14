package Chef_Customer;

public class Customer extends Thread {
	private final DiningTable table;
	public Customer(DiningTable table) {
		this.table = table;
	}
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(3000);
				table.eat();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
