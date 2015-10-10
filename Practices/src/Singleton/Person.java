package Singleton;

public class Person {
	private static Person person;   //单例模式
	
	private String name;
	private String age;
	private String sex;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	private Person(){    //私有化构造方法
		
	}

	
	public static synchronized Person getPerson(){ //创建实例
		if(person == null){
			person = new Person();
		}
		return person;
	}

	
	@Override
	public String toString(){
		return name;
	}
}
