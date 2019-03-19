package test;

import java.awt.event.MouseEvent;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.IconsDrawer;
import gui.elements.Map;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;

public class DraggedVisitor implements ItemsVisitors<Void> {

	DraggedStrategy draggedStrategy;
	private Variables variables;
	
	public DraggedVisitor(Variables variables,IconsDrawer iconsDrawer,Map map){
		this.variables = variables;
		draggedStrategy = new ItemsDraggedStrategy(variables,iconsDrawer,map);
	}
	
	@Override
	public Void visit(Arrow staticArrow, MouseEvent e, Arrow[] arrow) {
		if(variables.isValidateArrow()){
			draggedStrategy.moveFromResourcesToTheMap(staticArrow,e,arrow);
		}else if(variables.isMapvalidateArrow()) {
			draggedStrategy.moveOnTheMap(staticArrow,e,arrow);//mettre moveOnTheMap ici
		}
		return null; 
	}
	
	@Override
	public Void visit(Cannon staticCannon, MouseEvent e, Cannon[] cannon) {
		if(variables.isValidateCannon()){
			draggedStrategy.moveFromResourcesToTheMap(staticCannon,e,cannon);
		}else if(variables.isMapvalidateCannon()) {
			draggedStrategy.moveOnTheMap(staticCannon,e,cannon);
		}
		return null;
	}
	@Override
	public Void visit(Char1 staticChar1, MouseEvent e, Char1[] char1) {
		if(variables.isValidateChar1()){
			draggedStrategy.moveFromResourcesToTheMap(staticChar1,e,char1);
		}else if(variables.isMapvalidateChar1()) {
			draggedStrategy.moveOnTheMap(staticChar1,e,char1);
		}
		return null;
	}
	@Override
	public Void visit(Char2 staticChar2, MouseEvent e, Char2[] char2) {
		if(variables.isValidateChar2()){
			draggedStrategy.moveFromResourcesToTheMap(staticChar2,e,char2);
		}else if(variables.isMapvalidateChar2()) {
			draggedStrategy.moveOnTheMap(staticChar2,e,char2);
		}
		return null;
	}
	@Override
	public Void visit(Char3 staticChar3, MouseEvent e, Char3[] char3) {
		if(variables.isValidateChar3()){
			draggedStrategy.moveFromResourcesToTheMap(staticChar3,e,char3);
		}else if(variables.isMapvalidateChar3()) {
			draggedStrategy.moveOnTheMap(staticChar3,e,char3);
		}
		return null;
	}
	@Override
	public Void visit(Char4 staticChar4, MouseEvent e, Char4[] char4) {
		if(variables.isValidateChar4()){
			draggedStrategy.moveFromResourcesToTheMap(staticChar4,e,char4);
		}else if(variables.isMapvalidateChar4()) {
			draggedStrategy.moveOnTheMap(staticChar4,e,char4);
		}
		return null;
	}
	@Override
	public Void visit(Char5 staticChar5, MouseEvent e, Char5[] char5) {
		if(variables.isValidateChar5()){
			draggedStrategy.moveFromResourcesToTheMap(staticChar5,e,char5);
		}else if(variables.isMapvalidateChar5()) {
			draggedStrategy.moveOnTheMap(staticChar5,e,char5);
		}
		return null;
	}
}
