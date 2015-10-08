package HashSetTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSortExample {
	public static void  main(String[] args){
		Set set1 = new HashSet();
		Set set2 = new LinkedHashSet<>();
		for(int i=0;i<5;i++){
			int s = (int)(Math.random()*100);
			set1.add(s);
			set2.add(s);
			System.out.println("第"+i+"次产生的随机数为:"+s);
		}
		
		System.out.println("未排序前HashSet:"+set1);
		
		System.out.println("未排序前LinkedHashSet为：  "+set2);
		
		
		Set sortedSet = new TreeSet(set1);
		
		System.out.println("排序后TreeSet :"+sortedSet);
		
		
	}
}
