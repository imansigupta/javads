package Lecture3_Feb5;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The number");
		int n = s.nextInt();
		int sum = 0;
		int p = 1;// 8^0 =1;
		while (n != 0) {
			int r = n % 10;
			n = n / 10;
			sum = sum + r * p;
			p = p * 8;

		}
		System.out.println(sum);
	}

}
