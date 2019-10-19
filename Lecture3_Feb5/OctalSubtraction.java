package Lecture3_Feb5;

import java.util.Scanner;

public class OctalSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The first number");
		int n1 = s.nextInt();
		System.out.println("Enter The Second Number");
		int n2 = s.nextInt();
		int borrow = 0;
		int sub = 0;
		int result;
		int p = 1;
		while (n1 > 0 || n2 > 0 || borrow > 0) {
			int r1 = n1 % 10;
			n1 = n1 / 10;
			int r2 = n2 % 10;
			n2 = n2 / 10;
			r1 = r1 + borrow;
			if(r1>=r2){
				borrow = 0;
				
			}
			else{
				r1+=8;
				borrow = -1;
			}
			result = r1 - r2;
			sub = sub + result *p;
			p = p*10;
			
		}
		System.out.println(sub);
	}

}
