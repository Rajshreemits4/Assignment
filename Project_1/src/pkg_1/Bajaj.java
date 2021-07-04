package pkg_1;

import com.learnprogramming.demo.Fan;

public class Bajaj extends Fan {
	int b;

	public Bajaj() {
		super.item();
		System.out.println("I am contructor");
	}

	public Bajaj(int a) {
		this();
		System.out.println("I am P contructor");
	}

	public static void main(String[] args) {
		Bajaj ob = new Bajaj(3);
		ob.variety();
		ob.b = 6;
		ob.speed();
		System.out.println(ob.b);
	}
}
