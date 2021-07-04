package pkg_1;

import java.util.Scanner;

public class Mathematics {
	public int mul(int x1, int x2) {

		return x1 + x2;
	}

	public int sum(int x3, int x4) {
		return x3 + x4;
	}

	public int sub(int x4, int x5) {

		return x4 - x5;
	}

	public void div(int x6) {
	}

	public static void main(String[] args) {
		Mathematics mathematics = new Mathematics();
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Enter the value of x1");
		int x1 = ref.nextInt();
		
		System.out.println("Enter the value of x2");
		int x2 = ref.nextInt();
		
		int mul = mathematics.mul(x1, x2);
		System.out.println("Result of mul is\t" + mul);
		
		System.out.println("Enter the value of x3");
		int x3 = ref.nextInt();
		
		System.out.println("Enter the value of x4");
		int x4 = ref.nextInt();
		
		int sum = mathematics.sub(x3, x4);
		System.out.println("Result of sum is\t" + sum);
		
		int sum2 = mathematics.sum(mul, sum);
		System.out.println("Result of sum2 is\t" + sum2);
		
		System.out.println("Enter the value of x5");
		int x5 = ref.nextInt();
		
		int sub = mathematics.sub(sum2, x5);
		System.out.println("Result of sub is\t" + sub);
		
		System.out.println("Enter the value of x6");
		float x6 = ref.nextFloat();
		
		int div;
		div = (int) (sub / x6);
		System.out.println("Final result is\t" + div);

	}

}
