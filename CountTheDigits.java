import java.util.Scanner;

public class CountTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int counter =0;
		while(n>0){
			n = n/10;
			counter++;
		
		}
		System.out.println("Number of digits in counter are "+counter);
		
	}

}
