package super_warrios;

import gui.elements.Constant;
import people.Characters;

public class Ifrit extends Characters {
	//Attributes
	private boolean validateIfrit;
	private boolean mapValidateIfrit;
	private boolean drawIfritOnTheMap; 
	//Constructor
	public Ifrit(){
		super("Ifrit",Constant.DEFAULT_QUANTITY,0,null);
		this.validateIfrit = false;
		this.mapValidateIfrit = false;
		this.drawIfritOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateIfrit() {
		return validateIfrit;
	}
	public void setValidateIfrit(boolean validateIfrit) {
		this.validateIfrit = validateIfrit;
	}
	public boolean isMapValidateIfrit() {
		return mapValidateIfrit;
	}
	public void setMapValidateIfrit(boolean mapValidateIfrit) {
		this.mapValidateIfrit = mapValidateIfrit;
	}
	public boolean isDrawIfritOnTheMap() {
		return drawIfritOnTheMap;
	}
	public void setDrawIfritOnTheMap(boolean drawIfritOnTheMap) {
		this.drawIfritOnTheMap = drawIfritOnTheMap;
	}
	
}
