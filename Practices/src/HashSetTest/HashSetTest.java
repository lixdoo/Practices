package HashSetTest;

import java.util.HashSet;

import HashMap.Code;
import HashMap.Person;

public class HashSetTest {
	public static void main(String[] args){
		HashSet setTest = new HashSet();
		setTest.add(new Person("jack",new Code(123232)));
		System.out.println(setTest);
	}
}
