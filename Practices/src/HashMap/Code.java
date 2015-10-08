package HashMap;

public class Code {
	private final int id;
	public Code(int i){
		this.id = i;
	}
	
	@Override
	public boolean equals(Object anObject){
		if(anObject instanceof Code){
			Code other = (Code) anObject;
			return this.id == other.id ;
		}
		return false;
	}
	@Override
	public String toString(){
		return "身份证："+id;
	}
	@Override
	public int hashCode(){
		return id;
	}
	
}
