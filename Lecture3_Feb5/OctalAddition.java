package Lecture3_Feb5;

import java.util.Scanner;

public class OctalAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The first number");
		int n1 = s.nextInt();
		System.out.println("Enter The Second Number");
		int n2 = s.nextInt();
		int carry = 0;
		int sum =0;
		int p = 1;
		while(n1>0 || n2>0 || carry>0){
			int rem = n1%10;
			n1 = n1/10;
			
			int rem2 = n2%10;
			n2 = n2/10;
			int res = rem + rem2 + carry;
			carry = res/8;
			int d =  res%8;
			sum = sum + d* p;
			p = p*10;
			
		}
		System.out.println(sum);

	}

}
