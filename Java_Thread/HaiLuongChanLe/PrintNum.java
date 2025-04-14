package HaiLuongChanLe;

public class PrintNum {
	private final int LIMIT = 10;
	
	public synchronized void printOdd() {
		for(int i = 1; i <= LIMIT; i+=2) {
			System.out.println(" "+ i);
			notify();
			try {
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		notify();
	}
	
	public synchronized void printEven() {
		for(int  i = 2; i <= LIMIT; i+=2) {
			System.out.println(" " + i);
			notify();
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
	}
}
