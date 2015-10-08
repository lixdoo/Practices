package Singleton;

public class Spooler {
	static boolean instance_flag = false; //if存在实例则返回true
	
	public Spooler() throws SingletonException{
		if(instance_flag){
			throw new SingletonException("Only one printer allowed");
		}else{
			instance_flag =true;
		}
		System.out.println("printer opened");
	}
}
