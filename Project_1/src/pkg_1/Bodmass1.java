package pkg_1;

public class Bodmass1 {
	public int div(int a, int b) {
		return a / b;
	}

	public int sub(int c, int d) {
		return (c - d);
	}

	public int sum(int e, int f) {
		return (e + f);
	}

	public void mul(int x, int y) {
		int z;
		z = x * y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		Bodmass1 assign1 = new Bodmass1();
		int div_res = assign1.div(10, 2);
		int sub_res = assign1.sub(div_res, 2);
		int sub2_res = assign1.sub(sub_res, 2);
		int sum_res = assign1.sum(sub2_res, 2);
		System.out.println(div_res);
		System.out.println(sub_res);
		System.out.println(sub2_res);
		System.out.println(sum_res);
		assign1.mul(sum_res, 2);
	}
}
