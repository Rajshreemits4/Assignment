package pkg_1;

public class Browser {
	public Browser() {
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
public Browser(int a) {
		this();
		System.out.println("Parent 1 parameterized Constructor");
	}
public Browser(int a, int b) {
	this(1,2,3,4);
	System.out.println("Parent 2 parameterized Constructor");
}
public Browser(int a, int b, int c) {
	System.out.println("Parent 3 parameterized Constructor");
}
public Browser(int a , int b, int c, int d) {
	this(1);
	System.out.println("Parent 4 parameterized Constructor");
}

	
}

