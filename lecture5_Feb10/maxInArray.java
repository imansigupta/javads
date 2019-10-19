package lecture5_Feb10;

public class maxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {55,2,33,11,77,6};
		int max = arr[0];
		//if int max is set to 0 then it will not run for negative no and hence will give 0 as output instead of -2
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max= arr[i];
			}
			
		}
		System.out.println(max);
	}

}
