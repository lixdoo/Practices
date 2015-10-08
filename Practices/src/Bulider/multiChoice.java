package Bulider;

import java.awt.Panel;
import java.util.Vector;

public abstract class multiChoice {
	//抽象基类
	private Vector choices;
	
	public multiChoice(Vector choiceList){
		choices = choiceList;
		
	}
	 public abstract Panel getUI();
	 abstract public String[] getSelected();
	 abstract public void clearAll();
}


class listBoxChoice extends multiChoice{

	public listBoxChoice(Vector choiceList) {
		super(choiceList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Panel getUI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getSelected() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearAll() {
		// TODO Auto-generated method stub
		
	}
	
}

class checkBoxChoice extends multiChoice{

	public checkBoxChoice(Vector choiceList) {
		super(choiceList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Panel getUI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getSelected() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearAll() {
		// TODO Auto-generated method stub
		
	}
	
}