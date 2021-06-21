package instanceCoop;

public class Lecture {
	private String name;
	private String profName;
	private int studentCnt;

	Lecture(String name, String profName) {
		this.name = name;
		this.profName = profName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public int getStudentCnt() {
		return studentCnt;
	}

	public void setStudentCnt(int studentCnt) {
		this.studentCnt = studentCnt;
	}

	public void showInfo() {
		System.out.println("강의명 : " + name);
		System.out.println("교수명 : " + profName);
		System.out.println("수강 인원 : " + studentCnt + "\n");
	}

}
