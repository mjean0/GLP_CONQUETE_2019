package warrios;

import gui.elements.Constant;
import people.Characters;

public class Scherwiz extends Characters {
	//Attributes
	private boolean validateScherwiz;
	private boolean mapValidateScherwiz;
	private boolean drawScherwizOnTheMap; 
	//Constructor
	public Scherwiz(){
		super("Scherwiz",Constant.DEFAULT_QUANTITY,0,null);
		this.validateScherwiz = false;
		this.mapValidateScherwiz = false;
		this.drawScherwizOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateScherwiz() {
		return validateScherwiz;
	}
	public void setValidateScherwiz(boolean validateScherwiz) {
		this.validateScherwiz = validateScherwiz;
	}
	public boolean isMapValidateScherwiz() {
		return mapValidateScherwiz;
	}
	public void setMapValidateScherwiz(boolean mapValidateScherwiz) {
		this.mapValidateScherwiz = mapValidateScherwiz;
	}
	public boolean isDrawScherwizOnTheMap() {
		return drawScherwizOnTheMap;
	}
	public void setDrawScherwizOnTheMap(boolean drawScherwizOnTheMap) {
		this.drawScherwizOnTheMap = drawScherwizOnTheMap;
	}
	
}
