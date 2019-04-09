package super_warrios;

import gui.elements.Constant;
import people.Characters;

public class Titan extends Characters {
	//Attributes
	private boolean validateTitan;
	private boolean mapValidateTitan;
	private boolean drawTitanOnTheMap; 
	//Constructor
	public Titan(){
		super("Titan",Constant.DEFAULT_QUANTITY,0,null);
		this.validateTitan = false;
		this.mapValidateTitan = false;
		this.drawTitanOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateTitan() {
		return validateTitan;
	}
	public void setValidateTitan(boolean validateTitan) {
		this.validateTitan = validateTitan;
	}
	public boolean isMapValidateTitan() {
		return mapValidateTitan;
	}
	public void setMapValidateTitan(boolean mapValidateTitan) {
		this.mapValidateTitan = mapValidateTitan;
	}
	public boolean isDrawTitanOnTheMap() {
		return drawTitanOnTheMap;
	}
	public void setDrawTitanOnTheMap(boolean drawTitanOnTheMap) {
		this.drawTitanOnTheMap = drawTitanOnTheMap;
	}
	
}
