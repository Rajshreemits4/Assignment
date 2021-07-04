package assignment1;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num = scanner.nextInt();
		int temp = num;
		int a;
		int sumOfDigits = 0;
		int count = 0;

		while (temp > 0) {
			a = temp % 10;
			temp = temp / 10;
			count = count + 1;
		}
		
		int n = num;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			
			int product = 1;
			for (int i = 0; i < count; i++) {
				product = product * a;
			}
			sumOfDigits = sumOfDigits + product;
		}
		
		if (sumOfDigits == num) {
			System.out.println("It is a Armstrong number");
		} else {
			System.out.println("It is not a Armstrong number");
			System.out.println("Assignment");
			scanner.close();
		}

	}
}