package assignment1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibaonacci series:");
		int num = scanner.nextInt();
		int n3;
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 0; i <= num; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			scanner.close();
		}

	}

}
