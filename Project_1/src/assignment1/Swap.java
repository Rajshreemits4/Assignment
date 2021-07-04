package assignment1;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = in.nextInt();
		System.out.println("Enter the value of a");
		b = in.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("New value of a\t" +a);
		System.out.println("New value of b\t" +b);
		in.close();
	}

}
