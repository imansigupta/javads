package Lecture3_Feb5;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = s.nextInt();
		
		System.out.println("Enter The Base");
		int b = s.nextInt();
	//rj	
		int m = 1;
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			int p = r * m;
			m = m * b;
			sum = sum + p;
		}
		System.out.println(sum);
	}

}
