import java.util.Scanner;

public class printAllPrimes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n = scn.nextInt();

		for (int i = 2; i <= n; i++) {
			boolean iIsPrime = true;

			// purana Logic Start
			int divisor = 2;
			while (divisor * divisor <= i) {
				if (i % divisor == 0) {
					iIsPrime = false;
					break;
				}
				divisor++;
			}
			// purana Logic End

			if (iIsPrime == true) {
				System.out.println(i);
			}

		}

	}

}
