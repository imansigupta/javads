import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		//int n = 5
		Scanner scn = new Scanner(System.in);   //for taking input from user
		System.out.println("Enter a number ");
		int n = scn.nextInt();

		int counter = 1;
		while (counter <= n) {
			System.out.println(counter);
			counter++;
		}
		

	}

}
