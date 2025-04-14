package HaiLuongChanLe;

public class OddThread extends Thread{
	private final PrintNum printNum;
	
	public OddThread(PrintNum printNum) {
		this.printNum = printNum;
	}
	public void run() {
		printNum.printOdd();
	}
}