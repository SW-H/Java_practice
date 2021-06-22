package arrayListPractice;

import java.util.ArrayList;

public class Student {
	private String name;
	private int studentId;
	private ArrayList<Subject> subjectList; // 변수명에서 타입을 볼 수 있는게 좋음(ArrayList) 
	private int scoreSum;

	Student(int studentId, String name) {
		this.name = name;
		this.studentId = studentId;
		subjectList = new ArrayList<Subject>();
	}

	public void showStudentInfo() {
		for (Subject subject : subjectList) {
			System.out.println("학생 " + name + "의 " + 
					subject.getName() + "과목 성적은 " + 
					subject.getScore() + "입니다. ");
		}
		System.out.println("학생 " + name + "의 총점은 " + scoreSum + "입니다. ");
	}

	public void addSubject(String name, int score) {
		subjectList.add(new Subject(name, score));
		scoreSum += score;
	}

}
