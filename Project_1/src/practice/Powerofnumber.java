package practice;

import java.util.Scanner;

public class Powerofnumber {
	public static void power() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		int r = scanner.nextInt();
		int a = 0;
		for (int i = 0; i < r; i++) {
			a = n * r;
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		power();

	}

}