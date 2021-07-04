package pkg_1;

public class Execution extends Browser
{
public Execution() {
	super(1,2);
	System.out.println("Default Child Constructor");
}
public Execution(int a) {
	this(1,2,3);
	System.out.println("1 Parameterized Child Constructor");
}
public Execution(int a, int b) {
	this(1,2,3,4);
	System.out.println("2 Parameterized Child Constructor");
}
public Execution(int a, int b, int c) {
	this();
	System.out.println("3 Parameterized Child Constructor");
}
public Execution(int a , int b,int c, int d) {
	this(1);
	System.out.println("4 Parameterized Child Constructor");
}
public static void main(String[] args) {
	Execution ob = new Execution(2,3);
}
}

