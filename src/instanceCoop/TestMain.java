package instanceCoop;

public class TestMain {
	public static void main(String[] args) {
		Student seuhan = new Student("Seuhan", 1);
		Student kim = new Student("Kim", 4);
		Lecture math = new Lecture("Math", "prof.Kim");
		Lecture physics = new Lecture("Physics", "prof.Lee");
		math.showInfo();
		physics.showInfo();

		seuhan.takeLecture(math);
		seuhan.showInfo();
		seuhan.takeLecture(physics);
		seuhan.showInfo();
		kim.takeLecture(physics);
	}

}
