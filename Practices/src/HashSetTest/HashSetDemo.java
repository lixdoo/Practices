package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args){
		Set set1 = new HashSet();
		
		if(set1.add("a")){
			System.out.println("1 add true");
		}
		if(!set1.add("a")){
			System.out.println("2 add false");
		}
		set1.add("a12");
		set1.add("dasf");
		set1.add("llll");
		
		System.out.println("集合set1的大小为："+set1.size());
		
		System.out.println("集合set1的内容是："+set1);
		
		set1.remove("a");
		
		System.out.println("移除元素a后set1集合的内容是："+set1);
		System.out.println("集合set1中是否包含元素a:"+set1.contains("a"));
		
		System.out.println("集合set1中是否包含元素a12:  "+set1.contains("a12"));
		
		Set set2 = new HashSet<>();
		set2.add("q");
		set2.add("llll");
		set2.addAll(set1);
		System.out.println("集合set2中的内容是："+set2);
		set2.clear(); 
		System.out.println("集合set2是否为空 ： "+set2.isEmpty());
		
		
		//**********************************迭代器**********************************************//
		
		
		
		Iterator iterator = set1.iterator();
		while(iterator.hasNext()){
			Object element = iterator.next();
			System.out.println("iterator ="+element);
		}
		
		Object s[] = set1.toArray();
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	
	
		
	}

}
