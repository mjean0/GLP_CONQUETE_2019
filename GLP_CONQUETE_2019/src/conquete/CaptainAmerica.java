package warrios;

import gui.elements.Constant;
import people.Characters;

public class CaptainAmerica extends Characters {
	//Attributes
	private boolean validateCaptainAmerica;
	private boolean mapValidateCaptainAmerica;
	private boolean drawCaptainAmericaOnTheMap; 
	//Constructor
	public CaptainAmerica(){
		super("CaptainAmerica",Constant.DEFAULT_QUANTITY,0,null);
		this.validateCaptainAmerica = false;
		this.mapValidateCaptainAmerica = false;
		this.drawCaptainAmericaOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateCaptainAmerica() {
		return validateCaptainAmerica;
	}
	public void setValidateCaptainAmerica(boolean validateCaptainAmerica) {
		this.validateCaptainAmerica = validateCaptainAmerica;
	}
	public boolean isMapValidateCaptainAmerica() {
		return mapValidateCaptainAmerica;
	}
	public void setMapValidateCaptainAmerica(boolean mapValidateCaptainAmerica) {
		this.mapValidateCaptainAmerica = mapValidateCaptainAmerica;
	}
	public boolean isDrawCaptainAmericaOnTheMap() {
		return drawCaptainAmericaOnTheMap;
	}
	public void setDrawCaptainAmericaOnTheMap(boolean drawCaptainAmericaOnTheMap) {
		this.drawCaptainAmericaOnTheMap = drawCaptainAmericaOnTheMap;
	}
	
}
