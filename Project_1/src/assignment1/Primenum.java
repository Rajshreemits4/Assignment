package assignment1;

import java.util.Scanner;

public class Primenum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num = scanner.nextInt();
		int prime = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = 1;
			}

		}
		if (prime == 1) {
			System.out.println("It is not a prime num");
		} else {

			System.out.println("It is a prime num");

		}
		scanner.close();
	}

}