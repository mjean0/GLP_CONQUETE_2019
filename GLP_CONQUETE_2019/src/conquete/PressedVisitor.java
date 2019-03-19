package test;

import java.awt.event.MouseEvent;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;




public class PressedVisitor implements ItemsVisitors<Void> {

	PressedStrategy pressedStrategy;
	@SuppressWarnings("unused")
	private Variables variables; 
	
	public PressedVisitor(Variables variables){
		this.variables = variables;
		pressedStrategy = new ItemsPressedStrategy(variables);
	}
	@Override
	public Void visit(Arrow staticArrow,MouseEvent e,Arrow []arrow) {
		if((e.getX()>=staticArrow.getPosX() && e.getX()<=staticArrow.getPosX()+50) && (e.getY()>=staticArrow.getPosY() && e.getY()<=staticArrow.getPosY()+50)){
			pressedStrategy.pressedOnTheRessourcesPanel(staticArrow, e, arrow);
		}else{// is on the map
			pressedStrategy.pressedOnTheMap(staticArrow, e, arrow);
		}
		return null;
	}

	@Override
	public Void visit(Cannon staticCannon, MouseEvent e, Cannon[] cannon) {
		if((e.getX()>=staticCannon.getPosX() && e.getX()<=staticCannon.getPosX()+50) && (e.getY()>=staticCannon.getPosY() && e.getY()<=staticCannon.getPosY()+50)){
			pressedStrategy.pressedOnTheRessourcesPanel(staticCannon, e, cannon);
		}else{
			pressedStrategy.pressedOnTheMap(staticCannon, e, cannon);
		}
		return null;
	}	
	
	@Override
	public Void visit(Char1 staticChar1,MouseEvent e,Char1 []char1) {
		if((e.getX()>=staticChar1.getPosX() && e.getX()<=staticChar1.getPosX()+50) && (e.getY()>=staticChar1.getPosY() && e.getY()<=staticChar1.getPosY()+50)){
			pressedStrategy.pressedOnTheRessourcesPanel(staticChar1, e, char1);
		}else{// is on the map
			pressedStrategy.pressedOnTheMap(staticChar1, e, char1);
		}
		return null;
	}
	@Override
	public Void visit(Char2 staticChar2,MouseEvent e,Char2 []char2) {
		if((e.getX()>=staticChar2.getPosX() && e.getX()<=staticChar2.getPosX()+50) && (e.getY()>=staticChar2.getPosY() && e.getY()<=staticChar2.getPosY()+50)){
			pressedStrategy.pressedOnTheRessourcesPanel(staticChar2, e, char2);
		}else{// is on the map
			pressedStrategy.pressedOnTheMap(staticChar2, e, char2);
		}
		return null;
	}
	@Override
	public Void visit(Char3 staticChar3,MouseEvent e,Char3 []char3) {
		if((e.getX()>=staticChar3.getPosX() && e.getX()<=staticChar3.getPosX()+50) && (e.getY()>=staticChar3.getPosY() && e.getY()<=staticChar3.getPosY()+50)){
			pressedStrategy.pressedOnTheRessourcesPanel(staticChar3, e, char3);
		}else{// is on the map
			pressedStrategy.pressedOnTheMap(staticChar3, e, char3);
		}
		return null;
	}
	@Override
	public Void visit(Char4 staticChar4,MouseEvent e,Char4 []char4) {
		if((e.getX()>=staticChar4.getPosX() && e.getX()<=staticChar4.getPosX()+50) && (e.getY()>=staticChar4.getPosY() && e.getY()<=staticChar4.getPosY()+50)){
			pressedStrategy.pressedOnTheRessourcesPanel(staticChar4, e, char4);
		}else{// is on the map
			pressedStrategy.pressedOnTheMap(staticChar4, e, char4);
		}
		return null;
	}
	@Override
	public Void visit(Char5 staticChar5,MouseEvent e,Char5 []char5) {
		if((e.getX()>=staticChar5.getPosX() && e.getX()<=staticChar5.getPosX()+50) && (e.getY()>=staticChar5.getPosY() && e.getY()<=staticChar5.getPosY()+50)){
			pressedStrategy.pressedOnTheRessourcesPanel(staticChar5, e, char5);
		}else{// is on the map
			pressedStrategy.pressedOnTheMap(staticChar5, e, char5);
		}
		return null;
	}
	
//	public int reMoved(MouseEvent e){
//	for(int i = 0;i<Constant.MAX_ELEMENTS;i++){
//		if((e.getX()>=itemsPanel1.getArrow()[i].getPosX() && e.getX()<=itemsPanel1.getArrow()[i].getPosX()+Constant.ICON_WIDTH) && (e.getY()>=itemsPanel1.getArrow()[i].getPosY() && e.getY()<=itemsPanel1.getArrow()[i].getPosY()+50)){
//			valideArrow = true;	return i;
//		}
//	}
//	return 0;
//}
//
//public void moveOnMap(MouseEvent e){
//	if((e.getX()>=0 && e.getX()<=1500) && (e.getY()>=0 && e.getY()<=700)){
//		lastIndex=reMoved(e);
//	}
//}


}
