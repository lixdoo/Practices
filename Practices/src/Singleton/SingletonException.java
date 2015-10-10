package Singleton;

public class SingletonException extends RuntimeException{
	
	/**
	 * 自定义异常
	 */
	private static final long serialVersionUID = 1L;

	public SingletonException(){
		super();
	}
	
	public SingletonException(String s){
		super(s);
	}

}
