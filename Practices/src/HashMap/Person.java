package HashMap;

public class Person {
	private Code id;
	private String name;
	
	public Person(String name, Code id){
		this.name = name;
		this.id = id;
	}
	
	public Code getId() {
		return id;
	}

	public void setId(Code id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public boolean equals(Object anObject){
		if(anObject instanceof Person){
			Person other = (Person)anObject;
			return this.id.equals(other.id); 
		}
		return false;
	}
	
	public String toString(){
		return "姓名："+name+"\n";
	}
}
