package pkg_1;

public class Student {
	int Age;
	int Rollno;

	public void display1() {
		System.out.println("Welcome all");
	}

	public void display2() {
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		Student type = new Student();
		type.Age = 28;
		System.out.println(type.Age);
		type.Rollno = 123;
		System.out.println(type.Rollno);
		type.display1();
		type.display2();

	}
}
