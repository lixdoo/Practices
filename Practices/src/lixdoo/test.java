package lixdoo;

public class test {
	public String age;
	static{
		System.out.println("init");
	}
	 public static void main(String[] args) throws ClassNotFoundException{
//		test t = new test();
		Class.forName("lixdoo.test"); 
		System.out.println(new test().getClass());
	}
}
