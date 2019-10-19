package lecture5_Feb10;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,2,0,3};
		int[] inv = new int[arr.length];
		for(int i =0;i<arr.length;i++){
			inv[arr[i]]  = i;
		}
		for(int val:inv){  //for-each loop
			System.out.println(val);
		}
	}

}
