package Chef_Customer;

import java.util.LinkedList;

public class DiningTable {
	private final int thucantrenban = 5;
	private final LinkedList<String> table = new LinkedList<String>();
	
	public synchronized void cook(String dish) throws InterruptedException {
        while (table.size() == thucantrenban) {
            wait();
        }
        table.add(dish);
        System.out.println("Đầu bếp nấu: " + dish);
        notify();
    }
	public synchronized void eat() throws InterruptedException{
		while(table.isEmpty()) {
			wait();
		}
		String dish = table.removeFirst();
		System.out.println("Khách ăn: "+ dish);
		notify();
	}

}

