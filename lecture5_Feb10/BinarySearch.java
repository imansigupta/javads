package lecture5_Feb10;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,2, 3,4 ,5 ,6,7 , 8,9,10};
		//If Repition
		int[] arr = {10,10,10,20,20,20,20,20,30,30,30};
		int low = 0;
		int high = arr.length - 1;
		int mid;
		int result = -1;//to tell the last or first index and if not found it will print -1 at the end
		Scanner s = new Scanner(System.in);
		System.out.println("enter the element to be found");
		int n = s.nextInt();
		while(low<= high){
			mid = (low+high)/2;	
			if(arr[mid]<n){
				low  = mid +1; 
				
			}else{
				if(arr[mid]>n){
					high = mid-1;
					
				}
				else{
					//System.out.println("found at "+mid+"element is "+n);
					//return;  // we wont return (i.e terminate ) to find the last or first index in case of repition of elements
					//low = mid +1; //for last index element
					high = high -1; //for first index
					result = mid;
				}
			}
			
			
		}
		System.out.println(result);
	}

}
