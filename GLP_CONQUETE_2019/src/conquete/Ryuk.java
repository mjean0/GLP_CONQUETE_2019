package super_warrios;

import gui.elements.Constant;
import people.Characters;

public class Ryuk extends Characters {
	//Attributes
	private boolean validateRyuk;
	private boolean mapValidateRyuk;
	private boolean drawRyukOnTheMap; 
	//Constructor
	public Ryuk(){
		super("Ryuk",Constant.DEFAULT_QUANTITY,0,null);
		this.validateRyuk = false;
		this.mapValidateRyuk = false;
		this.drawRyukOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateRyuk() {
		return validateRyuk;
	}
	public void setValidateRyuk(boolean validateRyuk) {
		this.validateRyuk = validateRyuk;
	}
	public boolean isMapValidateRyuk() {
		return mapValidateRyuk;
	}
	public void setMapValidateRyuk(boolean mapValidateRyuk) {
		this.mapValidateRyuk = mapValidateRyuk;
	}
	public boolean isDrawRyukOnTheMap() {
		return drawRyukOnTheMap;
	}
	public void setDrawRyukOnTheMap(boolean drawRyukOnTheMap) {
		this.drawRyukOnTheMap = drawRyukOnTheMap;
	}
	
}
