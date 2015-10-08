package Singleton;

public class singleSpooler {
	static public void main(String[] args){
		Spooler pr1,pr2;
		System.out.println("open one spooler");
		try{
			pr1 = new Spooler();
		}catch (SingletonException e){
			System.out.println(e.getMessage());
		}
		System.out.println("open two spooler");
		try{
			pr2 = new Spooler(); 
		}catch (SingletonException e){
			System.out.println(e.getMessage());
		}
	}
}
