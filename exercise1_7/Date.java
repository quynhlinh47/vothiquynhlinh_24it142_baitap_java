package exercise1_7;

public class Date {
	private int day, month, year;
	
	public Date(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		return String.format("%02d/%02d/%4d", month, day, year);
	}
}
