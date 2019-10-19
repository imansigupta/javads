package Lecture2_Feb3;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonacci pattern 
		//0
		//11
		//235
		//8....
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int a = 0;
		int b =1;
		
		for(int i =1; i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a + " ");
				int t = a + b;
				a=b;
				b = t;
				
			}
			System.out.println();
		}

	}
	}

