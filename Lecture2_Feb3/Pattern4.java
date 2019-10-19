package Lecture2_Feb3;             

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pascal triangle
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int k = 1;
		
		for(int i =0; i<=n;i++){
			k = 1;
			for(int j=0;j<=i;j++){
				System.out.print(k + " ");
				k = k * (i - j)/(j+1);
				
			}
			System.out.println();
		}

	}
	}
