package Lecture3_Feb5;

import java.util.Scanner;

public class BinaryToDecimal {
//rj
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a  Binary number");
		int n = s.nextInt();
		int sum = 0;
		
		int m=1; //2^0 =1;
		
		while(n>0){
			 
			int r = n % 10 ;
			n = n/10;
//			System.out.println(r);
			int p = r*m;
			m = m*2;
			sum = sum+p;			
			
			
			
		}
		System.out.println(sum);
	}

}
