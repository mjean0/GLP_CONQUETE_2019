package super_warrios;

import gui.elements.Constant;
import people.Characters;

public class Hulk extends Characters {
	//Attributes
	private boolean validateHulk;
	private boolean mapValidateHulk;
	private boolean drawHulkOnTheMap; 
	//Constructor
	public Hulk(){
		super("Hulk",Constant.DEFAULT_QUANTITY,0,null);
		this.validateHulk = false;
		this.mapValidateHulk = false;
		this.drawHulkOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateHulk() {
		return validateHulk;
	}
	public void setValidateHulk(boolean validateHulk) {
		this.validateHulk = validateHulk;
	}
	public boolean isMapValidateHulk() {
		return mapValidateHulk;
	}
	public void setMapValidateHulk(boolean mapValidateHulk) {
		this.mapValidateHulk = mapValidateHulk;
	}
	public boolean isDrawHulkOnTheMap() {
		return drawHulkOnTheMap;
	}
	public void setDrawHulkOnTheMap(boolean drawHulkOnTheMap) {
		this.drawHulkOnTheMap = drawHulkOnTheMap;
	}
	
}
