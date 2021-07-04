package com.learnprogramming.demo;

import java.util.Scanner;

public class ReverseStarPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = scanner.nextInt();
		for (int i = n; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
	}
		scanner.close();
	}

}
