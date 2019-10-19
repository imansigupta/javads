import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();

		int a = 0;
		int b = 1;

		for (int i = 0; i <= n; i++) {

			int t = a + b;
			System.out.println(a);
			a = b;
			b = t;

		}

	}

}
