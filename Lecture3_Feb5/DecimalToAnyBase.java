package Lecture3_Feb5;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = s.nextInt();		
		System.out.println("Enter The Base");
		int b = s.nextInt();
		int m =1;
		int sum = 0;
		//rj
		while(n>0){
			int r = n % b;
			n = n/b;
//			System.out.println(r);
			int p = r*m;
			m = m*10;
			sum = sum+p;			
			
			
		}
		System.out.println(sum);

	}

}
