package lecture5_Feb10;

public class ReverseAnArray {

	public static void reverse(int[] arr) {
		int x;
		for(int i = 0;i<arr.length/2;i++ ){
			x = arr[i];
			arr[i] =  arr[arr.length-1-i];
			arr[arr.length-1-i] = x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		reverse(arr);
		for(int i = 0; i<arr.length;i++){
			System.out.println("new array element at "+ i +"is "+arr[i]);
		}

			
	}

}
