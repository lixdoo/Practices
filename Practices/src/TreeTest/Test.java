package TreeTest;

public class Test {
	public static void main(String[] args){
		System.out.println(Test.computerAge(8));
	}
	public static int computerAge(int n){
		if(n==1){
			return 10;
		}else{
			return computerAge(n-1)+2;
		}
	}
}
