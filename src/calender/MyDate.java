package calender;

public class MyDate {
	private int date;
	private int month;
	private int year;

	public boolean isValid;
	int[] dateRange = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public MyDate() {
		isValid = true;
	}

	public MyDate(int date, int month, int year) {
		isValid = true;
		setYear(year);
		setMonth(month);
		setDate(date);
	}

	public int getDate() {
		return date;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		if (1 <= month && month <= 12)
			this.month = month;
		else
			isValid = false;
	}

	public void setDate(int date) {
		setDateRange(year);
		if (date <= dateRange[month])
			this.date = date;
		else
			isValid = false;
	}

	public void setDateRange(int year) {
		/*
		 * 윤년 계산법 
		 * 1. 4로 나누어 떨어진다 = 윤년 
		 * 		단, 100으로도 나누어 떨어진다 = 평년 
		 * 2. 4로 나누어 떨어지고, 100으로도 나누어 떨어지나, 400으로 나누어 떨어진다 = 윤년
		 */
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			dateRange[2]++;
	}

	public String isValid() {
		if (isValid == true)
			return "유효한 날짜입니다";
		else
			return "유효하지 않은 날짜입니다";

	}
}
