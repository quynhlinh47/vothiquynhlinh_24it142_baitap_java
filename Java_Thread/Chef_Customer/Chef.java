package Chef_Customer;

public class Chef extends Thread{
	private final DiningTable table;
	public Chef(DiningTable table) {
		this.table = table;
	}
	@Override
	public void run() {
		int count = 1;
		try {
			while(true) {
				Thread.sleep(2000);
				table.cook("món: "+ count++);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
