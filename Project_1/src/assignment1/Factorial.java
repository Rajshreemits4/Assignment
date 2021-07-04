package assignment1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value n");
		int n = scanner.nextInt();
		int product = 1;
		for (int i = 1; i <= n; i++) {
			product = product * i;
		}
		System.out.println("Factorial of n is\t" + product);
		scanner.close();
	}

}
