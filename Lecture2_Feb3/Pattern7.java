package Lecture2_Feb3;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		//cross pattern
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i == (n-j+1)) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
