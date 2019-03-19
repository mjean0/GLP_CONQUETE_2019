package test;

import gui.elements.Constant;

public class Variables {

	private int[]newIndex = new int[Constant.MAX_ITEMS];
	private int[]currentIndex = new int[Constant.MAX_ITEMS];
	private int[]lastIndex = new int[Constant.MAX_ITEMS];
	
	private boolean drawArrowOnTheMap;
	private boolean drawCannonOnTheMap;
	private boolean drawChar1OnTheMap;
	private boolean drawChar2OnTheMap;
	private boolean drawChar3OnTheMap;
	private boolean drawChar4OnTheMap;
	private boolean drawChar5OnTheMap;
	
	private boolean MapvalidateArrow;
	private boolean MapvalidateCannon;
	private boolean MapvalidateChar1;
	private boolean MapvalidateChar2;
	private boolean MapvalidateChar3;
	private boolean MapvalidateChar4;
	private boolean MapvalidateChar5;
	
	private boolean validateArrow;
	private boolean validateCannon;
	private boolean validateChar1;
	private boolean validateChar2;
	private boolean validateChar3;
	private boolean validateChar4;
	private boolean validateChar5;
	
	//IconsDrawer variables management
	private boolean iconsDrawerIsOnTheMap;

	
	public Variables(){
		init();
	}
	
	public void init(){
		for(int i = 0; i<Constant.MAX_ITEMS; i++){
			newIndex[i] = 0;
			currentIndex[i] = 0; 
			lastIndex[i] = 0;
		}
		drawArrowOnTheMap = false;
		drawCannonOnTheMap = false;
		drawChar1OnTheMap = false;
		drawChar2OnTheMap = false;
		drawChar3OnTheMap = false;
		drawChar4OnTheMap = false;
		drawChar5OnTheMap = false;
		
		MapvalidateArrow = false;
		MapvalidateCannon = false;
		MapvalidateChar1 = false;
		MapvalidateChar2 = false;
		MapvalidateChar3 = false;
		MapvalidateChar4 = false;
		MapvalidateChar5 = false;
		
		validateArrow = false;
		validateCannon = false;
		validateChar1 = false;
		validateChar2 = false;
		validateChar3 = false;
		validateChar4 = false;
		validateChar5 = false;
		
		iconsDrawerIsOnTheMap = false;
	}

	public int[] getNewIndex() {
		return newIndex;
	}

	public int[] getCurrentIndex() {
		return currentIndex;
	}

	public int[] getLastIndex() {
		return lastIndex;
	}

	public boolean isMapvalidateArrow() {
		return MapvalidateArrow;
	}

	public boolean isMapvalidateCannon() {
		return MapvalidateCannon;
	}
	
	public boolean isMapvalidateChar1() {
		return MapvalidateChar1;
	}
	
	public boolean isMapvalidateChar2() {
		return MapvalidateChar2;
	}
	
	public boolean isMapvalidateChar3() {
		return MapvalidateChar3;
	}
	
	public boolean isMapvalidateChar4() {
		return MapvalidateChar4;
	}
	
	public boolean isMapvalidateChar5() {
		return MapvalidateChar5;
	}
	public boolean isValidateArrow() {
		return validateArrow;
	}

	public boolean isValidateCannon() {
		return validateCannon;
	}
	
	public boolean isValidateChar1() {
		return validateChar1;
	}
	
	public boolean isValidateChar2() {
		return validateChar3;
	}
	
	public boolean isValidateChar3() {
		return validateChar3;
	}
	
	public boolean isValidateChar4() {
		return validateChar4;
	}
	
	public boolean isValidateChar5() {
		return validateChar5;
	}

	public void setMapvalidateArrow(boolean mapvalidateArrow) {
		MapvalidateArrow = mapvalidateArrow;
	}

	public void setMapvalidateCannon(boolean mapvalidateCannon) {
		MapvalidateCannon = mapvalidateCannon;
	}
	
	public void setMapvalidateChar1(boolean mapvalidateChar1) {
		MapvalidateChar1 = mapvalidateChar1;
	}
	
	public void setMapvalidateChar2(boolean mapvalidateChar2) {
		MapvalidateChar2 = mapvalidateChar2;
	}
	
	public void setMapvalidateChar3(boolean mapvalidateChar3) {
		MapvalidateChar3 = mapvalidateChar3;
	}
	
	public void setMapvalidateChar4(boolean mapvalidateChar4) {
		MapvalidateChar4 = mapvalidateChar4;
	}
	
	public void setMapvalidateChar5(boolean mapvalidateChar5) {
		MapvalidateChar5 = mapvalidateChar5;
	}

	public void setValidateArrow(boolean validateArrow) {
		this.validateArrow = validateArrow;
	}

	public void setValidateCannon(boolean validateCannon) {
		this.validateCannon = validateCannon;
	}
	
	public void setValidateChar1(boolean validateChar1) {
		this.validateChar1 = validateChar1;
	}
	
	public void setValidateChar2(boolean validateChar2) {
		this.validateChar2 = validateChar2;
	}
	
	public void setValidateChar3(boolean validateChar3) {
		this.validateChar3 = validateChar3;
	}
	
	public void setValidateChar4(boolean validateChar4) {
		this.validateChar4 = validateChar4;
	}
	
	public void setValidateChar5(boolean validateChar5) {
		this.validateChar5 = validateChar5;
	}

	public boolean isDrawArrowOnTheMap() {
		return drawArrowOnTheMap;
	}

	public void setDrawArrowOnTheMap(boolean moveArrow) {
		this.drawArrowOnTheMap = moveArrow;
	}

	public boolean isDrawCannonOnTheMap(){
		return drawCannonOnTheMap;
	}

	public void setDrawCannonOnTheMap(boolean moveCannon) {
		this.drawCannonOnTheMap = moveCannon;
	}

	public boolean isIconsDrawerIsOnTheMap() {
		return iconsDrawerIsOnTheMap; 
	} 

	public void setIconsDrawerIsOnTheMap(boolean iconsDrawerIsOnTheMap) {
		this.iconsDrawerIsOnTheMap = iconsDrawerIsOnTheMap;
	}
	
	public boolean isDrawChar1OnTheMap() {
		return drawChar1OnTheMap;
	}

	public void setDrawChar1OnTheMap(boolean moveChar1) {
		this.drawChar1OnTheMap = moveChar1;
	}
	
	public boolean isDrawChar2OnTheMap() {
		return drawChar2OnTheMap;
	}

	public void setDrawChar2OnTheMap(boolean moveChar2) {
		this.drawChar2OnTheMap = moveChar2;
	}
	
	public boolean isDrawChar3OnTheMap() {
		return drawChar3OnTheMap;
	}

	public void setDrawChar3OnTheMap(boolean moveChar3) {
		this.drawChar3OnTheMap = moveChar3;
	}
	
	public boolean isDrawChar4OnTheMap() {
		return drawChar4OnTheMap;
	}

	public void setDrawChar4OnTheMap(boolean moveChar4) {
		this.drawChar4OnTheMap = moveChar4;
	}
	
	public boolean isDrawChar5OnTheMap() {
		return drawChar5OnTheMap;
	}

	public void setDrawChar5OnTheMap(boolean moveChar5) {
		this.drawChar5OnTheMap = moveChar5;
	}
	
}
