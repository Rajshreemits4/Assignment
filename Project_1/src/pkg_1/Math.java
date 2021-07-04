package pkg_1;

import java.util.Scanner;

public class Math {
public int mul(int x1, int x2) {
	return x1*x2;
}
public int sum(int x3,int x4) {
	return x3+x4;
}
public int sub(int x5) {
	return x5;
}
public void div(int x6) {
}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the value of x1");
	int x1 = in.nextInt();
	System.out.println("Enter the value of x2");
	int x2 = in.nextInt();
	int mul = x1*x2;
	System.out.println("Result of mul is\t"+mul);
	System.out.println("Enter the value of x3");
	int x3 = in.nextInt();
	int sub = mul-x3;
	System.out.println("Result of sub is \t"+sub);
	System.out.println("Enter the value of x4");
	int x4 = in.nextInt();
	int sum = sub+x4;
	System.out.println("Result of sum is \t"+sum);
	System.out.println("Enter the value of x5");
	int x5 = in.nextInt();
	int sub1 = sum-x5;
	System.out.println("Result of sub1 is\t"+sub1);
	System.out.println("Enter the value of x6");
	int x6 = in.nextInt();
	float div = (float)sub1/(float)x6;
	System.out.println("Final result is\t"+div);
}
}
