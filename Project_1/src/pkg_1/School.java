package pkg_1;

public class School {
	public void address() {
		System.out.println("Parent default method");
	}

	public void Name(int a) {
		this.address();
		System.out.println("parent 1 parameter method");
	}

	public void build(int a, int b) {
		this.build1(1, 2, 3);
		System.out.println("parent 2 parameter method");
	}

	public void build1(int a, int b, int c) {
		this.Name(1);
		System.out.println("parent 3 parameter method");
	}

	public void build2(int a, int b, int c, int d) {
		this.build(1, 2);
		System.out.println("parent 4 parameter method");
	}
}
