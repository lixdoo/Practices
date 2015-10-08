package HashMap;

import java.util.HashMap;
public class HashCodeDemo {
	public static void main(String[] args){
		HashMap<Code,Person> map = new HashMap<>();
		Person p1 = new Person("张三",new Code(123));
		Person p2 = new Person("李四",new Code(456));
		map.put(p1.getId(),p1);
		map.put(p2.getId(),p2);
		System.out.println("HashMap中存放的人员信息：\n"+map);
		Person p3 = new Person("张山",new Code(123));
		map.put(p3.getId(), p3);
		System.out.println("张山改名后,HashMap中存放的人员信息:\n"+map);
		System.out.println("查找身份证为：123的人员信息："+map.get(new Code(123)));
		
	}
}
