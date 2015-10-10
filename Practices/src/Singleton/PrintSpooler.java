package Singleton;

public class PrintSpooler {
	private static PrintSpooler spooler;
	
	private String age;
	private String name;
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private PrintSpooler(){
	}
	
	public static synchronized PrintSpooler getSpooler(){
		if(spooler ==null){                    //如果还未创建
			spooler = new PrintSpooler();
		}
		return spooler;
	}
	public void print(String s){
		System.out.println(s);
	}
	
	@Override
	public String toString(){
		return this.age;
	}
	
}
