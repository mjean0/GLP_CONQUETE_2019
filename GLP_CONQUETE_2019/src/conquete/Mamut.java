package super_warrios;

import gui.elements.Constant;
import people.Characters;

public class Mamut extends Characters {
	//Attributes
	private boolean validateMamut;
	private boolean mapValidateMamut;
	private boolean drawMamutOnTheMap; 
	//Constructor
	public Mamut(){
		super("Mamut",Constant.DEFAULT_QUANTITY,0,null);
		this.validateMamut = false;
		this.mapValidateMamut = false;
		this.drawMamutOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateMamut() {
		return validateMamut;
	}
	public void setValidateMamut(boolean validateMamut) {
		this.validateMamut = validateMamut;
	}
	public boolean isMapValidateMamut() {
		return mapValidateMamut;
	}
	public void setMapValidateMamut(boolean mapValidateMamut) {
		this.mapValidateMamut = mapValidateMamut;
	}
	public boolean isDrawMamutOnTheMap() {
		return drawMamutOnTheMap;
	}
	public void setDrawMamutOnTheMap(boolean drawMamutOnTheMap) {
		this.drawMamutOnTheMap = drawMamutOnTheMap;
	}
	
}
