package Lecture2_Feb3;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int star = 1;
		int space = 2 * n - 3;
		int counter;
		for(int i = 1; i<=n;i++){
			int x = i;
			if(x==n){
				x=x-1;
			}
			for(int j =1; j<2*n;j++){
				if(j<=i){
				
					System.out.print(j);
					
				}
				else{
					if(j>=((2*n)-i)){
						System.out.print(x);
						x--;
					}
					else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
}

}
