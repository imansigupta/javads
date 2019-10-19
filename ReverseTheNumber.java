import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		while(n!=0){
			int r = n%10;
			System.out.print(r);
			n = n/10;
		
		}

	}

}
