package calender;

public class MyDate {
	private int date;
	private int month;
	private int year;
	int[] dateRange = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public MyDate(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public boolean checkLeap(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true; // 윤년
		if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
			return true;
		return false;
	}

	public String isValid() {
		if (!(1 <= date && date <= 31) || !(1 <= month && month <= 12))
			return "유효하지 않은 날짜입니다";
		if ((month == 2) && (checkLeap(year) == true))
			dateRange[month]++;
		if (date > dateRange[month])
			return "유효하지 않은 날짜입니다";
		return "유효한 날짜입니다";

	}
}
