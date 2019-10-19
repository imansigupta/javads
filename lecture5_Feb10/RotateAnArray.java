package lecture5_Feb10;

import java.util.Scanner;

public class RotateAnArray {

	public static void main(String[] args) {
		
		// int[] arr = { 2, 5, 7, 9, 3, 6, 1 };
		// Scanner s = new Scanner(System.in);
		// System.out.println("Enter the no to be rotated from ");
		// int n = s.nextInt();
		// int x;
		// for (int i = 0; i < arr.length - n; i++) {
		// x = arr[i];
		// arr[i] = arr[arr.length - n -1 + i];
		// arr[arr.length - 1-n + i] = x;
		// }
		// for(int i = 0 ; i<arr.length;i++){
		// System.out.println(arr[i]);
		// }
		int[] arr = { 2, 5, 7, 9, 3, 6, 1 };
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no to be rotated from ");
		int n = s.nextInt();
		reverse(arr,0, arr.length-1);
		reverse(arr,0,n-1);
		reverse(arr,n, arr.length-1);
		
		for(int val:arr){
			System.out.println(val);
		}
	}
	
	private static void reverse(int[] arr, int left, int right){
		for(int low=left, high = right;low<high;low++,high--){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
		}
	}

}
