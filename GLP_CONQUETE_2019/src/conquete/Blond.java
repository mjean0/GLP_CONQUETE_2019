package people;



public class Blond extends Characters {
	//Attributes
	private boolean validateBlond;
	private boolean mapValidateBlond;
	private boolean drawBlondOnTheMap; 
	//Constructor
	public Blond(){
		super("Blond",Constant.DEFAULT_QUANTITY,0,null);
		this.validateBlond = false;
		this.mapValidateBlond = false;
		this.drawBlondOnTheMap = false;
	}
	public boolean isValidateBlond() {
		return validateBlond;
	}
	public void setValidateBlond(boolean validateBlond) {
		this.validateBlond = validateBlond;
	}
	public boolean isMapValidateBlond() {
		return mapValidateBlond;
	}
	public void setMapValidateBlond(boolean mapValidateBlond) {
		this.mapValidateBlond = mapValidateBlond;
	}
	public boolean isDrawBlondOnTheMap() {
		return drawBlondOnTheMap;
	}
	public void setDrawBlondOnTheMap(boolean drawBlondOnTheMap) {
		this.drawBlondOnTheMap = drawBlondOnTheMap;
	}
	
	
}
