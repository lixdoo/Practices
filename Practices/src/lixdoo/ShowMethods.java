package lixdoo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ShowMethods {
	public static void main(String[] args) throws ClassNotFoundException{
		Class<?> c = Class.forName(args[0]);
		Method[] methods = c.getMethods();
		Constructor[] ctors = c.getConstructors();
		if (args.length ==1){
			for(Method method:methods){
				
			}
		}
		
	}
	
}
