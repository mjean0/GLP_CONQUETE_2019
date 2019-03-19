package test;

import java.awt.event.MouseEvent;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Constant;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;

public class ItemsPressedStrategy implements PressedStrategy {
	
	private Variables variables;
	
	public ItemsPressedStrategy(Variables variables){
		this.variables = variables;
	}
	
	//Arrow
	
	
	@Override
	public int getIconIndex(MouseEvent e, Arrow[] arrow) {
		for(int i = 0;i<Constant.MAX_ELEMENTS;i++){
			if((e.getX()>=arrow[i].getPosX() && e.getX()<=arrow[i].getPosX()+Constant.ICON_WIDTH) && (e.getY()>=arrow[i].getPosY() && e.getY()<=arrow[i].getPosY()+50)){
				variables.setMapvalidateArrow(true);return i;
			}
		}
		return 0;
	}
	@Override
	public void pressedOnTheMap(Arrow staticArrow, MouseEvent e, Arrow[] arrow) {
		if((e.getX()>=0 && e.getX()<=Constant.MAP_ACTUAL_WIDTH) && (e.getY()>=0 && e.getY()<=Constant.MAP_ACTUAL_HEIGH)){
			variables.getLastIndex()[staticArrow.getID()] = getIconIndex(e,arrow);
		}
	}
	@Override
	public void pressedOnTheRessourcesPanel(Arrow staticArrow, MouseEvent e, Arrow[] arrow) {
		if(variables.getNewIndex()[staticArrow.getID()]<Constant.MAX_ELEMENTS){
			variables.setValidateArrow(true);
			variables.getCurrentIndex()[staticArrow.getID()] = variables.getNewIndex()[staticArrow.getID()];
			variables.getNewIndex()[staticArrow.getID()]++;
		}else{
			variables.setValidateArrow(false);
		}
	}
	//Cannon
	@Override
	public int getIconIndex(MouseEvent e, Cannon[] cannon) {
		for(int i = 0;i<Constant.MAX_ELEMENTS;i++){
			if((e.getX()>=cannon[i].getPosX() && e.getX()<=cannon[i].getPosX()+Constant.ICON_WIDTH) && (e.getY()>=cannon[i].getPosY() && e.getY()<=cannon[i].getPosY()+50)){
				variables.setMapvalidateCannon(true);return i;
			}
		}
		return 0;
	}
	@Override
	public void pressedOnTheMap(Cannon staticCannon, MouseEvent e, Cannon[] cannon) {
		if((e.getX()>=0 && e.getX()<=1500) && (e.getY()>=0 && e.getY()<=700)){
			variables.getLastIndex()[staticCannon.getID()] = getIconIndex(e,cannon);
		}		
	}
	@Override
	public void pressedOnTheRessourcesPanel(Cannon staticCannon, MouseEvent e, Cannon[] cannon) {
		variables.setValidateCannon(true);
		if(variables.getNewIndex()[staticCannon.getID()]<Constant.MAX_ELEMENTS){
			variables.getCurrentIndex()[staticCannon.getID()] = variables.getNewIndex()[staticCannon.getID()];
			variables.getNewIndex()[staticCannon.getID()]++;
		}else{
			variables.setValidateCannon(false);
		}
	}
	
	//Char1
		@Override
		public int getIconIndex(MouseEvent e, Char1[] char1) {
			for(int i = 0;i<Constant.MAX_ELEMENTS;i++){
				if((e.getX()>=char1[i].getPosX() && e.getX()<=char1[i].getPosX()+Constant.ICON_WIDTH) && (e.getY()>=char1[i].getPosY() && e.getY()<=char1[i].getPosY()+50)){
					variables.setMapvalidateChar1(true);return i;
				}
			}
			return 0;
		}
		@Override
		public void pressedOnTheMap(char1 staticChar1, MouseEvent e, Char1[] char1) {
			if((e.getX()>=0 && e.getX()<=Constant.MAP_ACTUAL_WIDTH) && (e.getY()>=0 && e.getY()<=Constant.MAP_ACTUAL_HEIGH)){
				variables.getLastIndex()[staticChar1.getID()] = getIconIndex(e,char1);
			}
		}
		@Override
		public void pressedOnTheRessourcesPanel(Char1 staticChar1, MouseEvent e, Char1[] char1) {
			if(variables.getNewIndex()[staticChar1.getID()]<Constant.MAX_ELEMENTS){
				variables.setValidateChar1(true);
				variables.getCurrentIndex()[staticChar1.getID()] = variables.getNewIndex()[staticChar1.getID()];
				variables.getNewIndex()[staticChar1.getID()]++;
			}else{
				variables.setValidateChar1(false);
			}
		}
		//Char2
				@Override
				public int getIconIndex(MouseEvent e, Char2[] char2) {
					for(int i = 0;i<Constant.MAX_ELEMENTS;i++){
						if((e.getX()>=char2[i].getPosX() && e.getX()<=char2[i].getPosX()+Constant.ICON_WIDTH) && (e.getY()>=char2[i].getPosY() && e.getY()<=char2[i].getPosY()+50)){
							variables.setMapvalidateChar2(true);return i;
						}
					}
					return 0;
				}
				@Override
				public void pressedOnTheMap(char2 staticChar2, MouseEvent e, Char2[] char2) {
					if((e.getX()>=0 && e.getX()<=Constant.MAP_ACTUAL_WIDTH) && (e.getY()>=0 && e.getY()<=Constant.MAP_ACTUAL_HEIGH)){
						variables.getLastIndex()[staticChar2.getID()] = getIconIndex(e,char2);
					}
				}
				@Override
				public void pressedOnTheRessourcesPanel(Char2 staticChar2, MouseEvent e, Char2[] char2) {
					if(variables.getNewIndex()[staticChar2.getID()]<Constant.MAX_ELEMENTS){
						variables.setValidateChar2(true);
						variables.getCurrentIndex()[staticChar2.getID()] = variables.getNewIndex()[staticChar2.getID()];
						variables.getNewIndex()[staticChar2.getID()]++;
					}else{
						variables.setValidateChar2(false);
					}
				}
	//Char3
		@Override
		public int getIconIndex(MouseEvent e, Char3[] char3) {
		for(int i = 0;i<Constant.MAX_ELEMENTS;i++){
			if((e.getX()>=char3[i].getPosX() && e.getX()<=char3[i].getPosX()+Constant.ICON_WIDTH) && (e.getY()>=char3[i].getPosY() && e.getY()<=char3[i].getPosY()+50)){
					variables.setMapvalidateChar3(true);return i;
				}
			}
					return 0;
				}
				@Override
				public void pressedOnTheMap(char3 staticChar3, MouseEvent e, Char3[] char3) {
					if((e.getX()>=0 && e.getX()<=Constant.MAP_ACTUAL_WIDTH) && (e.getY()>=0 && e.getY()<=Constant.MAP_ACTUAL_HEIGH)){
						variables.getLastIndex()[staticChar3.getID()] = getIconIndex(e,char3);
					}
				}
				@Override
				public void pressedOnTheRessourcesPanel(Char3 staticChar3, MouseEvent e, Char3[] char3) {
					if(variables.getNewIndex()[staticChar3.getID()]<Constant.MAX_ELEMENTS){
						variables.setValidateChar3(true);
						variables.getCurrentIndex()[staticChar3.getID()] = variables.getNewIndex()[staticChar3.getID()];
						variables.getNewIndex()[staticChar3.getID()]++;
					}else{
						variables.setValidateChar3(false);
					}
				}
				
				//Char4
				@Override
				public int getIconIndex(MouseEvent e, Char4[] char4) {
					for(int i = 0;i<Constant.MAX_ELEMENTS;i++){
						if((e.getX()>=char4[i].getPosX() && e.getX()<=char4[i].getPosX()+Constant.ICON_WIDTH) && (e.getY()>=char4[i].getPosY() && e.getY()<=char4[i].getPosY()+50)){
							variables.setMapvalidateChar4(true);return i;
						}
					}
					return 0;
				}
				@Override
				public void pressedOnTheMap(char4 staticChar4, MouseEvent e, Char4[] char4) {
					if((e.getX()>=0 && e.getX()<=Constant.MAP_ACTUAL_WIDTH) && (e.getY()>=0 && e.getY()<=Constant.MAP_ACTUAL_HEIGH)){
						variables.getLastIndex()[staticChar4.getID()] = getIconIndex(e,char4);
					}
				}
				@Override
				public void pressedOnTheRessourcesPanel(Char4 staticChar4, MouseEvent e, Char4[] char4) {
					if(variables.getNewIndex()[staticChar4.getID()]<Constant.MAX_ELEMENTS){
						variables.setValidateChar4(true);
						variables.getCurrentIndex()[staticChar4.getID()] = variables.getNewIndex()[staticChar4.getID()];
						variables.getNewIndex()[staticChar4.getID()]++;
					}else{
						variables.setValidateChar4(false);
					}
				}
				//Char5
				@Override
				public int getIconIndex(MouseEvent e, Char5[] char5) {
					for(int i = 0;i<Constant.MAX_ELEMENTS;i++){
						if((e.getX()>=char5[i].getPosX() && e.getX()<=char5[i].getPosX()+Constant.ICON_WIDTH) && (e.getY()>=char5[i].getPosY() && e.getY()<=char5[i].getPosY()+50)){
							variables.setMapvalidateChar1(true);return i;
						}
					}
					return 0;
				}
				@Override
				public void pressedOnTheMap(char5 staticChar5, MouseEvent e, Char5[] char5) {
					if((e.getX()>=0 && e.getX()<=Constant.MAP_ACTUAL_WIDTH) && (e.getY()>=0 && e.getY()<=Constant.MAP_ACTUAL_HEIGH)){
						variables.getLastIndex()[staticChar5.getID()] = getIconIndex(e,char5);
					}
				}
				@Override
				public void pressedOnTheRessourcesPanel(Char5 staticChar1, MouseEvent e, Char5[] char5) {
					if(variables.getNewIndex()[staticChar5.getID()]<Constant.MAX_ELEMENTS){
						variables.setValidateChar5(true);
						variables.getCurrentIndex()[staticChar5.getID()] = variables.getNewIndex()[staticChar5.getID()];
						variables.getNewIndex()[staticChar5.getID()]++;
					}else{
						variables.setValidateChar5(false);
					}
				}
		
}
