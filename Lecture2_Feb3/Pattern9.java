package Lecture2_Feb3;

public class Pattern9 {

	public static void main(String[] args) {
		//graph pattern
		int[] arr = { 2, 7, 3, 4, 5 };
		int max = arr[0];
		for (int i = 1; i <= 4; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		for(int i =1; i<=max;i++){
			for(int j = 0; j<=4;j++){
				if(i>=max-arr[j]+1){
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
