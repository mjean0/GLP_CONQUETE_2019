package test;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;
import gui.elements.IconsDrawer;

public class ItemsUnMovedStrategy implements UnMovedStrategy {

	private Variables variables;
	
	public ItemsUnMovedStrategy(Variables variables){
		this.variables = variables;
	}
	
	@Override
	public void unMoved(Arrow staticArrow) {
		variables.setValidateArrow(false);
		variables.setMapvalidateArrow(false);
	}

	@Override
	public void unMoved(Cannon staticCannon) {
		variables.setValidateCannon(false);
		variables.setMapvalidateCannon(false);
	}
	
	@Override
	public void unMoved(Char1 staticChar1) {
		variables.setValidateChar1(false);
		variables.setMapvalidateChar1(false);
	}
	@Override
	public void unMoved(Char2 staticChar2) {
		variables.setValidateChar2(false);
		variables.setMapvalidateChar2(false);
	}
	@Override
	public void unMoved(Char3 staticChar3) {
		variables.setValidateChar3(false);
		variables.setMapvalidateChar3(false);
	}
	@Override
	public void unMoved(Char4 staticChar4) {
		variables.setValidateChar4(false);
		variables.setMapvalidateChar4(false);
	}
	@Override
	public void unMoved(Char5 staticChar5) {
		variables.setValidateChar5(false);
		variables.setMapvalidateChar5(false);
	}

}
