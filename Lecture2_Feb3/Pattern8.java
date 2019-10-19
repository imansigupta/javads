package Lecture2_Feb3;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//number diamond
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int space = n/2;
		int num = 1;
		int counter =1;
		int var =1;
		for(int i = 1; i<=n;i++){
			for(int j = 1; j<=space;j++){
				System.out.print(" ");
			}
			var=counter;
			for(int k = 1; k<=num;k++){
				System.out.print(var);
				
//				if(k<=(num/2)){
//					var++;
//				}
//				else{
//					var--;
//				}
				var = (k<=num/2)?var +1:var -1;
				
			}
			
			if(i<=n/2){
				space --;
				num+=2;
				counter++;
			}
			else{
				space++;
				num-=2;
				counter--;
			}
			System.out.println();
		}

	}

}
