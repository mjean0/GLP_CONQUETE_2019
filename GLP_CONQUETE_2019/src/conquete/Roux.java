package people;

import gui.elements.Constant;

public class Roux extends Characters {
	//Attributes
	private boolean validateRoux;
	private boolean mapValidateRoux;
	private boolean drawRouxOnTheMap; 
	//Constructor
	public Roux(){
		super("Roux",Constant.DEFAULT_QUANTITY,0,null);
		this.validateRoux = false;
		this.mapValidateRoux = false;
		this.drawRouxOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateRoux() {
		return validateRoux;
	}
	public void setValidateRoux(boolean validateRoux) {
		this.validateRoux = validateRoux;
	}
	public boolean isMapValidateRoux() {
		return mapValidateRoux;
	}
	public void setMapValidateRoux(boolean mapValidateRoux) {
		this.mapValidateRoux = mapValidateRoux;
	}
	public boolean isDrawRouxOnTheMap() {
		return drawRouxOnTheMap;
	}
	public void setDrawRouxOnTheMap(boolean drawRouxOnTheMap) {
		this.drawRouxOnTheMap = drawRouxOnTheMap;
	}
	
}
