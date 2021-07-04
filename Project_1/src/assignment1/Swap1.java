package assignment1;

import java.util.Scanner;

public class Swap1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of Num1");
		int num1 = in.nextInt();
		System.out.println("Enter the value of Num2");
		int num2 = in.nextInt();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("New value of Num1\t" + num1);
		System.out.println("New value of Num1\t" + num2);
		in.close();
	}
}
