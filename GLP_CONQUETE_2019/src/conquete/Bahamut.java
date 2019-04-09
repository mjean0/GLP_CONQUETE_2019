package super_warrios;

import gui.elements.Constant;
import people.Characters;

public class Bahamut extends Characters {
	//Attributes
	private boolean validateBahamut;
	private boolean mapValidateBahamut;
	private boolean drawBahamutOnTheMap; 
	//Constructor
	public Bahamut(){
		super("Bahamut",Constant.DEFAULT_QUANTITY,0,null);
		this.validateBahamut = false;
		this.mapValidateBahamut = false;
		this.drawBahamutOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateBahamut() {
		return validateBahamut;
	}
	public void setValidateBahamut(boolean validateBahamut) {
		this.validateBahamut = validateBahamut;
	}
	public boolean isMapValidateBahamut() {
		return mapValidateBahamut;
	}
	public void setMapValidateBahamut(boolean mapValidateBahamut) {
		this.mapValidateBahamut = mapValidateBahamut;
	}
	public boolean isDrawBahamutOnTheMap() {
		return drawBahamutOnTheMap;
	}
	public void setDrawBahamutOnTheMap(boolean drawBahamutOnTheMap) {
		this.drawBahamutOnTheMap = drawBahamutOnTheMap;
	}
	
}