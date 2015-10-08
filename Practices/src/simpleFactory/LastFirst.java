package simpleFactory;

public class LastFirst extends Namer{
	//当采用逗号分隔姓名时
	public LastFirst(String s){
		int i = s.indexOf(",");
		if(i>0){
			last = s.substring(0,i).trim();
		}else{
			last = s;
			first = "";
		}
	}
}
