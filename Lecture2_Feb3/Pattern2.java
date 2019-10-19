package Lecture2_Feb3;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		//23
		//456
		//78910
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int counter = 1;
		for(int i =1; i<n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(counter);
				counter++;
				
			}
			System.out.println();
		}

	}

}
