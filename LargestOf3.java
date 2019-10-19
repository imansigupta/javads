
public class LargestOf3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>=b && a>=c){
			System.out.println("a is largest " + a);
		}else{
			if(b>=c){
				System.out.println("b is largest " + b);
			}else{
				System.out.println("c is largest " + c);
			}
		}

	}

}
