package instanceCoop;

public class Student {
	private String name;
	private int grade;
	public int lectureCnt;

	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년  : " + grade);
		System.out.println("수강 강의 수  : " + lectureCnt);
	}

	public void takeLecture(Lecture lecture) {
		lecture.setStudentCnt(lecture.getStudentCnt() + 1);
		lectureCnt++;
		System.out.println("\n[REGISTERED]");
		lecture.showInfo();
	}
}
