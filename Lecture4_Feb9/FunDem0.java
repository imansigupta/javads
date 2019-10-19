package Lecture4_Feb9;

public class FunDem0 {

	public static void main(String[] args) {
		System.out.println("hello World");
//		helloFun();
//		helloFun();
//		helloGun();
		HelloNestedFun();
	}
	private static void HelloNestedFun(){
		System.out.println("hello nested fun");
		helloFun();
		helloGun();
	}
	private static void helloFun(){
		System.out.println("heloo fun");
	}
	private static void helloGun(){
		System.out.println("heloo gun");
	}

}
