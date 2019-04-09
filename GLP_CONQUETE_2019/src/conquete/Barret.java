package super_warrios;

import gui.elements.Constant;
import people.Characters;

public class Barret extends Characters {
	//Attributes
	private boolean validateBarret;
	private boolean mapValidateBarret;
	private boolean drawBarretOnTheMap; 
	//Constructor
	public Barret(){
		super("Barret",Constant.DEFAULT_QUANTITY,0,null);
		this.validateBarret = false;
		this.mapValidateBarret = false;
		this.drawBarretOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateBarret() {
		return validateBarret;
	}
	public void setValidateBarret(boolean validateBarret) {
		this.validateBarret = validateBarret;
	}
	public boolean isMapValidateBarret() {
		return mapValidateBarret;
	}
	public void setMapValidateBarret(boolean mapValidateBarret) {
		this.mapValidateBarret = mapValidateBarret;
	}
	public boolean isDrawBarretOnTheMap() {
		return drawBarretOnTheMap;
	}
	public void setDrawBarretOnTheMap(boolean drawBarretOnTheMap) {
		this.drawBarretOnTheMap = drawBarretOnTheMap;
	}
	
}
