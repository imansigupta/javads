import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n = scn.nextInt();
		int flag = 2;
		while(flag <= (n/2)){
			if(n % flag ==0){
				System.out.println("Composite Number");
				return;
			}
						
			flag ++;
		}
		System.out.println("prime Number");
		
			
		

	}

}
