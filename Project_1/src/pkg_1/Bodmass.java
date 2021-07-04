package pkg_1;

public class Bodmass {
	public int sum(int a, int b) {
		return (a + b);
	}

	public int sub(int c, int d) {
		return (c - d);
	}

	public int mul(int e, int f) {
		return (e * f);
	}

	public void div(int x, int y) {
		int z;
		z = x / y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		Bodmass assign = new Bodmass();
		int sum_result = assign.sum(10, 2);
		int sum2 = assign.sum(sum_result, 2);
		int sub_result = assign.sub(sum2, 2);
		int mul_result = assign.mul(sub_result, 2);
		System.out.println(sum_result);
		System.out.println(sum2);
		System.out.println(sub_result);
		System.out.println(mul_result);
		assign.div(mul_result, 2);

	}
}
