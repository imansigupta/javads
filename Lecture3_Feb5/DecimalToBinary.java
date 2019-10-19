package Lecture3_Feb5;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a  decimal number");
		int n = s.nextInt();
		int sum = 0;
		
		int m =1; //10^0 =1;
		
		while(n>0){
			 
			int r = n % 2 ;
			n = n/2;
//			System.out.println(r);
			int p = r*m;
			m = m*10;
			sum = sum+p;			
			
			
			
		}
		System.out.println(sum);
		

	}

}
