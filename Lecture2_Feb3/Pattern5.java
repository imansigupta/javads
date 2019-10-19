package Lecture2_Feb3;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		//diamond
//		for(int i = 1; i <= n/2; i++){
//			for(int j =n; j>i; j--){
//				System.out.print(" ");
//				
//			}
//			for(int k = 1; k<=i;k++){
//				System.out.print("*" +" ");
//			}
//			System.out.println();
//		}
//		for(int i = (n/2)+ 1; i <= n; i++){
//			for(int j=1; j<i; j++){
//				System.out.print(" ");
//				
//			}
//			for(int k = n; k>=i;k--){
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//better Strategy
		
		int stars =1;
		int space = n/2;              
		for(int i = 1; i<=n; i++){
//			System.out.println(space+ " "+stars);
			for(int j = 1; j<=space;j++){
				System.out.print(" ");
			}
			for(int k = 1; k<=stars;k++){
				System.out.print("*");
			}
			if(i<=n/2){
				space --;
				stars+=2;
			}
			else{
				space++;
				stars-=2;
			}
			System.out.println();
		}
	}

}
