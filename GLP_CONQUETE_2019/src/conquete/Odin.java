package warrios;

import gui.elements.Constant;
import people.Characters;

public class Odin extends Characters {
	//Attributes
	private boolean validateOdin;
	private boolean mapValidateOdin;
	private boolean drawOdinOnTheMap; 
	//Constructor
	public Odin(){
		super("Odin",Constant.DEFAULT_QUANTITY,0,null);
		this.validateOdin = false;
		this.mapValidateOdin = false;
		this.drawOdinOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateOdin() {
		return validateOdin;
	}
	public void setValidateOdin(boolean validateOdin) {
		this.validateOdin = validateOdin;
	}
	public boolean isMapValidateOdin() {
		return mapValidateOdin;
	}
	public void setMapValidateOdin(boolean mapValidateOdin) {
		this.mapValidateOdin = mapValidateOdin;
	}
	public boolean isDrawOdinOnTheMap() {
		return drawOdinOnTheMap;
	}
	public void setDrawOdinOnTheMap(boolean drawOdinOnTheMap) {
		this.drawOdinOnTheMap = drawOdinOnTheMap;
	}
	
}
