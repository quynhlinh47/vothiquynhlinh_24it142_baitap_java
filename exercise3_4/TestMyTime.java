package exercise3_4;

public class TestMyTime {
	public static void main(String[] args) {
		MyTime t1 = new MyTime(2,15,0);
		System.out.println("My Time: "+ t1);
		System.out.println("Hour: "+t1.getHour());
		System.out.println("Minute: "+ t1.getMinute());
		System.out.println("Second: "+ t1.getSecond());
		
		t1.setMinute(45);
		t1.setSecond(50);
		System.out.println("My Time now: "+ t1);
		System.out.println(t1.nextHour());
		System.out.println(t1.nextMinute());
		System.out.println(t1.nextSecond());
		System.out.println(t1.previousHour());
		System.out.println(t1.previousMinute());
		System.out.println(t1.previousSecond());
	}
}
