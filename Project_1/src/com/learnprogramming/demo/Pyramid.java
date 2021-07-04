package com.learnprogramming.demo;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <= i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
