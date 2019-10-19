package lecture5_Feb10;

public class SubsetOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30};
		int k = arr.length;
		int no = (1<<k);
		//System.out.println(np);
		for(int i = 0; i<no;i++){
			//for(int i = 0;i<(1<<arr.length);i++){
			//System.out.println(Integer.toBinaryString(i));
			for(int b = arr.length - 1, j=0;b>=0;b--,j++) {
				int bm = (1<<b);
				if((i & bm)==bm){
					//bit is on
					System.out.print(arr[j]+" ");
				}
				else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
