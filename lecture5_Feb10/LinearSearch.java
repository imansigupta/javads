package lecture5_Feb10;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length;i++){
			arr[i] =  s.nextInt();
			System.out.println("Array element is "+arr[i]);
		}
		System.out.println("Enter The elememt to found");
		int n = s.nextInt();
		for(int j = 0; j<arr.length;j++){
			if(n==arr[j]){
				System.out.println("element is found at"+j+"element is "+arr[j]);
				return;
			}
			
		}
		System.out.println(-1);
		
		

	}

}
