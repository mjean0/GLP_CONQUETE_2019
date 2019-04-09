package people;

public class Nigga extends Characters {
	//Attributes
	private boolean validateNigga;
	private boolean mapValidateNigga;
	private boolean drawNiggaOnTheMap; 
	//Constructor
	public Nigga(){
		super("Nigga",Constant.DEFAULT_QUANTITY,0,null);
		this.validateNigga = false;
		this.mapValidateNigga = false;
		this.drawNiggaOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateNigga() {
		return validateNigga;
	}
	public void setValidateNigga(boolean validateNigga) {
		this.validateNigga = validateNigga;
	}
	public boolean isMapValidateNigga() {
		return mapValidateNigga;
	}
	public void setMapValidateNigga(boolean mapValidateNigga) {
		this.mapValidateNigga = mapValidateNigga;
	}
	public boolean isDrawNiggaOnTheMap() {
		return drawNiggaOnTheMap;
	}
	public void setDrawNiggaOnTheMap(boolean drawNiggaOnTheMap) {
		this.drawNiggaOnTheMap = drawNiggaOnTheMap;
	}
	
}
