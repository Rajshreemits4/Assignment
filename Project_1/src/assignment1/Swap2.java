package assignment1;

import java.util.Scanner;

public class Swap2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of num1");
		int num1 = scanner.nextInt();
		System.out.println("Enter the value of num2");
		int num2 = scanner.nextInt();
		
		if (num1 == 0) {
			num1 = num2;
			num2 = 0;

		} else if (num2 == 0) {
			num2 = num1;
			num1 = 0;

		} else {
			num1 = num1 * num2;
			num2 = num1 / num2;
			num1 = num1 / num2;
		}
		System.out.println("New value of Num1\t" + num1);
		System.out.println("New value of Num2\t" + num2);
		scanner.close();
	}
}
