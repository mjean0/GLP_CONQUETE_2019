package people;

public class NiggaGirl extends Characters {
	//Attributes
	private boolean validateNiggaGirl;
	private boolean mapValidateNiggaGirl;
	private boolean drawNiggaGirlOnTheMap; 
	//Constructor
	public NiggaGirl(){
		super("NiggaGirl",Constant.DEFAULT_QUANTITY,0,null);
		this.validateNiggaGirl = false;
		this.mapValidateNiggaGirl = false;
		this.drawNiggaGirlOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateNiggaGirl() {
		return validateNiggaGirl;
	}
	public void setValidateNiggaGirl(boolean validateNiggaGirl) {
		this.validateNiggaGirl = validateNiggaGirl;
	}
	public boolean isMapValidateNiggaGirl() {
		return mapValidateNiggaGirl;
	}
	public void setMapValidateNiggaGirl(boolean mapValidateNiggaGirl) {
		this.mapValidateNiggaGirl = mapValidateNiggaGirl;
	}
	public boolean isDrawNiggaGirlOnTheMap() {
		return drawNiggaGirlOnTheMap;
	}
	public void setDrawNiggaGirlOnTheMap(boolean drawNiggaGirlOnTheMap) {
		this.drawNiggaGirlOnTheMap = drawNiggaGirlOnTheMap;
	}
	

}
