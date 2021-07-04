package assignment1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num = scanner.nextInt();
		int temp = num;
		int a;
		int sum = 0;
		int count = 0;
		//Counting number of length
		while(temp>0) {
			a = temp%10;
			temp = temp/10;
			count = count + 1;
		}
		//Couting last digits
		temp = num;
		while(temp>0) {
			a = temp%10;
			temp = temp/10;
			int lastdigit = a;
			//Multiplying last digits with 10
			for(int i=0;i<(count-1);i++) {
				lastdigit = lastdigit*10;
				}
			count = count -1;
			sum = sum+lastdigit;
		}
		if(sum==num) {
		System.out.println("It is a Palindrome");
	}
		else {
			System.out.println("It is not a Palindrome");
		}
scanner.close();
}
}
