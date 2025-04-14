package Thread_DemNguoc;

public class DemNguoc extends Thread{
	@Override
	public void run() {
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		DemNguoc demnguoc = new DemNguoc();
		demnguoc.start();
	}
}
