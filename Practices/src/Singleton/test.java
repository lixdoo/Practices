package Singleton;

public class test {
	public static void main(String[] args){
		PrintSpooler s = 	PrintSpooler.getSpooler();
		s.setAge("ddfds");
		Person p = Person.getPerson();
		p.setName("lixdoo");
		System.out.println(s);
		System.out.println(p);
	}
}
