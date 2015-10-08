package Bulider;

import java.util.Vector;

public class choiceFactory {
	multiChoice ui ;
	
	public multiChoice getChoiceUI(Vector choices){
		if(choices.size()<=3){
			ui = new checkBoxChoice(choices);
		}else{
			ui = new listBoxChoice(choices);
		}
		return ui;
	}
}
