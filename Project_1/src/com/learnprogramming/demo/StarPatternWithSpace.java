package com.learnprogramming.demo;

import java.util.Scanner;

public class StarPatternWithSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("N :");
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = N - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
