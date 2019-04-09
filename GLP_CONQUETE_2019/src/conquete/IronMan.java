package warrios;

import gui.elements.Constant;
import people.Characters;

public class IronMan extends Characters {
	//Attributes
	private boolean validateIronMan;
	private boolean mapValidateIronMan;
	private boolean drawIronManOnTheMap; 
	//Constructor
	public IronMan(){
		super("IronMan",Constant.DEFAULT_QUANTITY,0,null);
		this.validateIronMan = false;
		this.mapValidateIronMan = false;
		this.drawIronManOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateIronMan() {
		return validateIronMan;
	}
	public void setValidateIronMan(boolean validateIronMan) {
		this.validateIronMan = validateIronMan;
	}
	public boolean isMapValidateIronMan() {
		return mapValidateIronMan;
	}
	public void setMapValidateIronMan(boolean mapValidateIronMan) {
		this.mapValidateIronMan = mapValidateIronMan;
	}
	public boolean isDrawIronManOnTheMap() {
		return drawIronManOnTheMap;
	}
	public void setDrawIronManOnTheMap(boolean drawIronManOnTheMap) {
		this.drawIronManOnTheMap = drawIronManOnTheMap;
	}
	
}
