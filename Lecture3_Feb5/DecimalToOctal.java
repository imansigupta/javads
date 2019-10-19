package Lecture3_Feb5;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int sum = 0;
		int p = 1; // 10^0 = 1;
		while (n > 0) {
			int r = n % 8;
			n = n/8;
			sum = sum + r*p;
			p=p*10;

		}
		System.out.println(sum);
	}

}
