package HaiLuongChanLe;

public class EvenThread extends Thread {
	private final PrintNum printNum;
	
	public EvenThread(PrintNum printNum) {
		this.printNum = printNum;
	}
	@Override
	public void run() {
		printNum.printEven();
	}
}
