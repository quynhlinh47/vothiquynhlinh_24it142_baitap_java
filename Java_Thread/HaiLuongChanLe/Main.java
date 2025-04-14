package HaiLuongChanLe;

public class Main {
	public static void main(String[] args) {
		PrintNum printNum = new PrintNum();
		Thread oddNum = new OddThread(printNum);
		Thread evenNum = new EvenThread(printNum);
		
		oddNum.start();
		evenNum.start();
	}
}
