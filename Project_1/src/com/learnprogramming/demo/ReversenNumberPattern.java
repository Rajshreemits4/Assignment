package com.learnprogramming.demo;

import java.util.Scanner;

public class ReversenNumberPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = scanner.nextInt();
		
		int start = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(start + " ");
				start++;
			}
			System.out.println();
		}
		scanner.close();
	}
}
