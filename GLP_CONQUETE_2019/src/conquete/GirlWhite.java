package people;

import gui.elements.Constant;

public class GirlWhite extends Characters {
	//Attributes
	private boolean validateGirlWhite;
	private boolean mapValidateGirlWhite;
	private boolean drawGirlWhiteOnTheMap; 
	//Constructor
	public GirlWhite(){
		super("GirlWhite",Constant.DEFAULT_QUANTITY,0,null);
		this.validateGirlWhite = false;
		this.mapValidateGirlWhite = false;
		this.drawGirlWhiteOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateGirlWhite() {
		return validateGirlWhite;
	}
	public void setValidateGirlWhite(boolean validateGirlWhite) {
		this.validateGirlWhite = validateGirlWhite;
	}
	public boolean isMapValidateGirlWhite() {
		return mapValidateGirlWhite;
	}
	public void setMapValidateGirlWhite(boolean mapValidateGirlWhite) {
		this.mapValidateGirlWhite = mapValidateGirlWhite;
	}
	public boolean isDrawGirlWhiteOnTheMap() {
		return drawGirlWhiteOnTheMap;
	}
	public void setDrawGirlWhiteOnTheMap(boolean drawGirlWhiteOnTheMap) {
		this.drawGirlWhiteOnTheMap = drawGirlWhiteOnTheMap;
	}
	
}
