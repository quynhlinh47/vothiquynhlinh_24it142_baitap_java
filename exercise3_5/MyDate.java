package exercise3_5;

import java.util.Calendar;

public class MyDate {
	private int year, month, day;
	public static final String[] MONTHS = {
			"January", "February", "March","April", "May","June","July","August","September","October","November","December"
	};
	public static final String[] DAYS = {
			"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"
	};
	public static final int[] DAY_IN_MONTHS = {
			31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	public MyDate(int year, int month, int day) {
		setDate(year, month, day);
	}
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				return year % 400 == 0;
			}
			return true;
		}
		return false;
	}
	public static boolean isValidDate(int year, int month, int day) {
		if(year < 1|| year > 9999) return false;
		if(month < 1|| month >12) return false;
		
		int maxDay = DAY_IN_MONTHS[month - 1];
		
		if(month == 2 && isLeapYear(year)) {
			maxDay = 29;
		}
		if (day < 1 || day > maxDay) return false;
		return true;
	}
	public static int getDayOfWeek(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		return cal.get(Calendar.DAY_OF_WEEK) - 1;
	}
	public void setDate(int year, int month, int day) {
		if(!isValidDate(year, month, day)) {
			throw new IllegalArgumentException("Invalid year, month or day!");
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setYear(int year) {
		if(year < 1 || year > 9999) {
			throw new IllegalArgumentException("Invalid year!");
		}
		this.year = year;
	}
	public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }
    public void setDay(int day) {
        int maxDay = DAY_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        if (day < 1 || day > maxDay) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }
    @Override
    public String toString() {
        String dayOfWeek = DAYS[getDayOfWeek(year, month, day)];
        return dayOfWeek + " " + day + " " + MONTHS[month - 1] + " " + year;
    }
    private int getMaxDay(int year, int month) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return DAY_IN_MONTHS[month - 1];
    }

    public MyDate nextDay() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        return new MyDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
    }

    public MyDate nextMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        cal.add(Calendar.MONTH, 1);
        int newYear = cal.get(Calendar.YEAR);
        int newMonth = cal.get(Calendar.MONTH) + 1;
        int maxDay = getMaxDay(newYear, newMonth);
        int newDay = Math.min(day, maxDay);
        return new MyDate(newYear, newMonth, newDay);
    }
    public MyDate nextYear() {
        if (year >= 9999) {
            throw new IllegalStateException("Year out of range!");
        }
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        cal.add(Calendar.YEAR, 1);
        return new MyDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
    }

    public MyDate previousDay() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        cal.add(Calendar.DAY_OF_YEAR, -1);
        return new MyDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
    }
    public MyDate previousMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        cal.add(Calendar.MONTH, -1);
        int newYear = cal.get(Calendar.YEAR);
        int newMonth = cal.get(Calendar.MONTH) + 1;
        int maxDay = getMaxDay(newYear, newMonth);
        int newDay = Math.min(day, maxDay);
        return new MyDate(newYear, newMonth, newDay);
    }
    public MyDate previousYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        cal.add(Calendar.YEAR, -1);
        return new MyDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
    }
}