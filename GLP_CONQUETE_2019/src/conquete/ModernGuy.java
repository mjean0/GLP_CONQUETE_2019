package people;

public class ModernGuy extends Characters {
	//Attributes
	private boolean validateModerGuy;
	private boolean mapValidateModernGuy;
	private boolean drawModernGuyOnTheMap; 
	//Constructor
	public ModernGuy(){
		super("ModernGuy",Constant.DEFAULT_QUANTITY,0,null);
		this.validateModerGuy = false;
		this.mapValidateModernGuy = false;
		this.drawModernGuyOnTheMap = false;
	}
	//getters an setters
	public boolean isValidateModerGuy() {
		return validateModerGuy;
	}
	public void setValidateModerGuy(boolean validateModerGuy) {
		this.validateModerGuy = validateModerGuy;
	}
	public boolean isMapValidateModernGuy() {
		return mapValidateModernGuy;
	}
	public void setMapValidateModernGuy(boolean mapValidateModernGuy) {
		this.mapValidateModernGuy = mapValidateModernGuy;
	}
	public boolean isDrawModernGuyOnTheMap() {
		return drawModernGuyOnTheMap;
	}
	public void setDrawModernGuyOnTheMap(boolean drawModernGuyOnTheMap) {
		this.drawModernGuyOnTheMap = drawModernGuyOnTheMap;
	}
	
}
