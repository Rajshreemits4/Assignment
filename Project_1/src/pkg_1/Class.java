package pkg_1;

public class Class {

	public int Sum(int c, int d) {
		return (c + d);
	}

	public int Sub(int e, int f) {
		return (e - f);
	}

	public void Mul(int x, int y) {
		System.out.println("Multiplication: " + x * y);

	}

	public static void main(String[] args) {

		Class Alg = new Class();
//		int sub = Alg.Sub(10, 2);
//		int sum = Alg.Sum(10, 2);
		Alg.Mul(Alg.Sub(10, 2), Alg.Sum(10, 2));
//		System.out.println(sub);
//		System.out.println(sum);
		System.out.println("Subtraction: " + Alg.Sub(10, 2));
//		System.out.println(sum);

		// we need to calculate the average of 2 numbers
		// sum of the two numbers divided by 2
		/*
		 * Class cls = new Class(); int sum = cls.Sum(20, 10); int average = sum / 2;
		 * System.out.println("Average: " + average);
		 */
		/*
		 * Class cls = new Class(); System.out.println(cls.Sum(20, 10) / 2);
		 */
	}
}
