package pkg_1;

public class Standard extends School
{

	public void m1() {
		this.m4(1, 2, 3);
		System.out.println("child default method");
	}
	public void m2(int a) {
		this.m3(1, 2);
		
		System.out.println("child 1 parmaeter method");
	}
	public void m3(int a,int b) {
		this.m1();
		System.out.println("child 2 parmaeter method");
	}
	public void m4(int a, int b , int c) {
		super.build2(1, 2, 3, 4);
		System.out.println("child 3 parmaeter method");
	}
	public void m5(int a, int b, int c , int d) {
		this.m2(1);
		System.out.println("child 4 parmaeter method");
	}
	public static void main(String[] args) {
		Standard ref = new Standard();
		ref.m5(1, 2, 3, 4);
	}
}
