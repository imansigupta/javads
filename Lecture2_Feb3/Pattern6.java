package Lecture2_Feb3;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hollow diamond
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int star = 3;
		int space = 1;
		for(int i = 1;i<=n;i++){
			//System.out.println(star + " "+space + " "+star);
			for(int j = 1; j<= star;j++){
				System.out.print("*");
			}
			for(int k = 1;k<=space;k++){
				System.out.print(" ");
			}
			for(int j = 1; j<= star;j++){
				System.out.print("*");
			}
			
			if(i<=n/2){
				star--;
				space+=2;
			}
			else{
				star++;
				space-=2;
			}
			System.out.println();
		}
		

	}

}
