package test;

import java.awt.event.MouseEvent;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Constant;
import gui.elements.IconsDrawer;
import gui.elements.Map;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;

public class ItemsDraggedStrategy implements DraggedStrategy {
	
	private Variables variables;
	private IconsDrawer iconsDrawer;
	private Map map;
	
	public ItemsDraggedStrategy(Variables variables,IconsDrawer iconsDrawer,Map map){
		this.variables = variables;
		this.iconsDrawer = iconsDrawer;
		this.map = map;
	}
	//Arrow
	@Override
	public void moveOnTheMap(Arrow staticArrow, MouseEvent e, Arrow[] arrow) {
		arrow[variables.getLastIndex()[staticArrow.getID()]].setPosX(e.getX());
		arrow[variables.getLastIndex()[staticArrow.getID()]].setPosY(e.getY());
	}
	@Override
	public void moveFromResourcesToTheMap(Arrow staticArrow, MouseEvent e, Arrow[] arrow) {
		//cest ici que je dois prendre en compte la difference de position entre la map et la frame je dois adpater les pos des arrow et compagnie avec cette modification
		//Pour cela, on fait taille de la map - e.getY()
		arrow[variables.getCurrentIndex()[staticArrow.getID()]].setPosX(e.getX());
		arrow[variables.getCurrentIndex()[staticArrow.getID()]].setPosY(e.getY()-130);//valeur provisoire
	    //iconsDrawer.setBounds(e.getX(),e.getY(), 50, 50);
		iconsDrawer.setPositions(e.getX(), e.getY());
		iconsDrawer.setBounds(iconsDrawer.getPosX(),iconsDrawer.getPosY(), 50, 50);
	    if(iconsDrawer.isIconsDrawerOnTheMap()){
			variables.setDrawArrowOnTheMap(true);
	    }
	}
	@Override
	public void limits(Arrow staticArrow, MouseEvent e) {
		if(e.getY()>Constant.MAP_ACTUAL_HEIGH && variables.isMapvalidateArrow()){
			variables.setMapvalidateArrow(false);
		}
	}
	//Cannon
	@Override
	public void moveOnTheMap(Cannon staticCannon, MouseEvent e, Cannon[] cannon) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveFromResourcesToTheMap(Cannon staticCannon, MouseEvent e, Cannon[] cannon) {
		cannon[variables.getCurrentIndex()[staticCannon.getID()]].setPosX(e.getX());
		cannon[variables.getCurrentIndex()[staticCannon.getID()]].setPosY(e.getY());
		iconsDrawer.setBounds(cannon[variables.getCurrentIndex()[staticCannon.getID()]].getPosX(), cannon[variables.getCurrentIndex()[staticCannon.getID()]].getPosY(), 50, 50);
	}
	@Override
	public void limits(Cannon staticCannon, MouseEvent e) {
		if(e.getY()>700 && variables.isMapvalidateCannon()){
			variables.setMapvalidateCannon(false);
		}
	}
	//Char1
	@Override
	public void moveOnTheMap(Char1 staticChar1, MouseEvent e, Char1[] char1) {
		char1[variables.getLastIndex()[staticChar1.getID()]].setPosX(e.getX());
		char1[variables.getLastIndex()[staticChar1.getID()]].setPosY(e.getY());
	}
	@Override
	public void moveFromResourcesToTheMap(Char1 staticChar1, MouseEvent e, Char1[] Char1) {
		
		char1[variables.getCurrentIndex()[staticChar1.getID()]].setPosX(e.getX());
		char1[variables.getCurrentIndex()[staticChar1.getID()]].setPosY(e.getY()-130);//valeur provisoire
		iconsDrawer.setPositions(e.getX(), e.getY());
		iconsDrawer.setBounds(iconsDrawer.getPosX(),iconsDrawer.getPosY(), 50, 50);
	    if(iconsDrawer.isIconsDrawerOnTheMap()){
			variables.setDrawChar1OnTheMap(true);
	    }
	}
	@Override
	public void limits(Char1 staticChar1, MouseEvent e) {
		if(e.getY()>Constant.MAP_ACTUAL_HEIGH && variables.isMapvalidateChar1()){
			variables.setMapvalidateChar1(false);
		}
	}
	//Char2
	@Override
	public void moveOnTheMap(Char2 staticChar2, MouseEvent e, Char2[] char2) {
		char2[variables.getLastIndex()[staticChar2.getID()]].setPosX(e.getX());
		char2[variables.getLastIndex()[staticChar2.getID()]].setPosY(e.getY());
	}
	@Override
	public void moveFromResourcesToTheMap(Char2 staticChar2, MouseEvent e, Char2[] Char2) {
		
		char2[variables.getCurrentIndex()[staticChar2.getID()]].setPosX(e.getX());
		char2[variables.getCurrentIndex()[staticChar2.getID()]].setPosY(e.getY()-130);//valeur provisoire
		iconsDrawer.setPositions(e.getX(), e.getY());
		iconsDrawer.setBounds(iconsDrawer.getPosX(),iconsDrawer.getPosY(), 50, 50);
	    if(iconsDrawer.isIconsDrawerOnTheMap()){
			variables.setDrawChar2OnTheMap(true);
	    }
	}
	@Override
	public void limits(Char2 staticChar2, MouseEvent e) {
		if(e.getY()>Constant.MAP_ACTUAL_HEIGH && variables.isMapvalidateChar2()){
			variables.setMapvalidateChar2(false);
		}
	}
	//Char3
	@Override
	public void moveOnTheMap(Char3 staticChar1, MouseEvent e, Char3[] char3) {
		char3[variables.getLastIndex()[staticChar3.getID()]].setPosX(e.getX());
		char3[variables.getLastIndex()[staticChar3.getID()]].setPosY(e.getY());
	}
	@Override
	public void moveFromResourcesToTheMap(Char3 staticChar3, MouseEvent e, Char3[] Char3) {
		
		char3[variables.getCurrentIndex()[staticChar3.getID()]].setPosX(e.getX());
		char3[variables.getCurrentIndex()[staticChar3.getID()]].setPosY(e.getY()-130);//valeur provisoire
		iconsDrawer.setPositions(e.getX(), e.getY());
		iconsDrawer.setBounds(iconsDrawer.getPosX(),iconsDrawer.getPosY(), 50, 50);
	    if(iconsDrawer.isIconsDrawerOnTheMap()){
			variables.setDrawChar3OnTheMap(true);
	    }
	}
	@Override
	public void limits(Char3 staticChar3, MouseEvent e) {
		if(e.getY()>Constant.MAP_ACTUAL_HEIGH && variables.isMapvalidateChar3()){
			variables.setMapvalidateChar3(false);
		}
	}
	//Char4
	@Override
	public void moveOnTheMap(Char4 staticChar4, MouseEvent e, Char1[] char4) {
		char4[variables.getLastIndex()[staticChar4.getID()]].setPosX(e.getX());
		char4[variables.getLastIndex()[staticChar4.getID()]].setPosY(e.getY());
	}
	@Override
	public void moveFromResourcesToTheMap(Char4 staticChar4, MouseEvent e, Char4[] Char4) {
		
		char4[variables.getCurrentIndex()[staticChar4.getID()]].setPosX(e.getX());
		char4[variables.getCurrentIndex()[staticChar4.getID()]].setPosY(e.getY()-130);//valeur provisoire
		iconsDrawer.setPositions(e.getX(), e.getY());
		iconsDrawer.setBounds(iconsDrawer.getPosX(),iconsDrawer.getPosY(), 50, 50);
	    if(iconsDrawer.isIconsDrawerOnTheMap()){
			variables.setDrawChar4OnTheMap(true);
	    }
	}
	@Override
	public void limits(Char4 staticChar4, MouseEvent e) {
		if(e.getY()>Constant.MAP_ACTUAL_HEIGH && variables.isMapvalidateChar4()){
			variables.setMapvalidateChar4(false);
		}
	}
	//Char5
	@Override
	public void moveOnTheMap(Char5 staticChar5, MouseEvent e, Char5[] char5) {
		char5[variables.getLastIndex()[staticChar5.getID()]].setPosX(e.getX());
		char5[variables.getLastIndex()[staticChar5.getID()]].setPosY(e.getY());
	}
	@Override
	public void moveFromResourcesToTheMap(Char5 staticChar5, MouseEvent e, Char5[] Char5) {
		
		char5[variables.getCurrentIndex()[staticChar5.getID()]].setPosX(e.getX());
		char5[variables.getCurrentIndex()[staticChar5.getID()]].setPosY(e.getY()-130);//valeur provisoire
		iconsDrawer.setPositions(e.getX(), e.getY());
		iconsDrawer.setBounds(iconsDrawer.getPosX(),iconsDrawer.getPosY(), 50, 50);
	    if(iconsDrawer.isIconsDrawerOnTheMap()){
			variables.setDrawChar5OnTheMap(true);
	    }
	}
	@Override
	public void limits(Char5 staticChar5, MouseEvent e) {
		if(e.getY()>Constant.MAP_ACTUAL_HEIGH && variables.isMapvalidateChar5()){
			variables.setMapvalidateChar5(false);
		}
	}
}