package HashMap;

import java.util.HashMap;

public class testHashMap {
	public static void main(String[] args){
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		HashMap<Integer,String> mapTest = new HashMap<Integer,String>();
		
		map.put(1,"2");
		map.put(2, "3");
		
		System.out.println(map);
		map.put(1, "3");
		System.out.println(map);
		System.out.println(map.get(1));
	}
}
