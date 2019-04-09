package super_warrios;

import people.Characters;

public class Siren extends Characters {
	//Attributes
	private boolean validateSiren;
	private boolean mapValidateSiren;
	private boolean drawSirenOnTheMap; 
	//Constructor
	public Siren(){
		super("Siren",Constant.DEFAULT_QUANTITY,0,null);
		this.validateSiren = false;
		this.mapValidateSiren = false;
		this.drawSirenOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateSiren() {
		return validateSiren;
	}
	public void setValidateSiren(boolean validateSiren) {
		this.validateSiren = validateSiren;
	}
	public boolean isMapValidateSiren() {
		return mapValidateSiren;
	}
	public void setMapValidateSiren(boolean mapValidateSiren) {
		this.mapValidateSiren = mapValidateSiren;
	}
	public boolean isDrawSirenOnTheMap() {
		return drawSirenOnTheMap;
	}
	public void setDrawSirenOnTheMap(boolean drawSirenOnTheMap) {
		this.drawSirenOnTheMap = drawSirenOnTheMap;
	}
	
}
