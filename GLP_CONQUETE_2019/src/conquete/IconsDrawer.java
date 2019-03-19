package gui.elements;

import java.awt.Graphics;
import javax.swing.JLabel;

import data.Resources;
import process.IconsUtility;
import test.Variables;

public class IconsDrawer extends JLabel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Variables variables;
	private Resources ressource;

	//Positions
	private int posX;
	private int posY;
			 
	public IconsDrawer(Variables variables,Resources ressource){
		this.variables = variables;
		this.ressource = ressource;
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawIcons(g);
		g.dispose();
	}
	
	public void drawIcons(Graphics g){
		if(variables.isValidateArrow()){
			g.drawImage(IconsUtility.readImage(ressource.getStaticArrow().getFilePath()),0,0,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,null);
		}else if(variables.isValidateCannon()){
			g.drawImage(IconsUtility.readImage(ressource.getStaticCannon().getFilePath()),0,0,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,null);
		}else if(variables.isValidateChar1()) {
			g.drawImage(IconsUtility.readImage(ressource.getStaticChar1().getFilePath()),0,0,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,null);
		}else if(variables.isValidateChar2()) {
			g.drawImage(IconsUtility.readImage(ressource.getStaticChar2().getFilePath()),0,0,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,null);
		}else if(variables.isValidateChar3()) {
			g.drawImage(IconsUtility.readImage(ressource.getStaticChar3().getFilePath()),0,0,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,null);
		}else if(variables.isValidateChar4()) {
			g.drawImage(IconsUtility.readImage(ressource.getStaticChar4().getFilePath()),0,0,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,null);
		}else if(variables.isValidateChar5()) {
			g.drawImage(IconsUtility.readImage(ressource.getStaticChar5().getFilePath()),0,0,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,null);
		}
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPositions(int x,int y) {
		posX = x;
		posY = y;
	}
	
	public void backToInitialsPos(){
		setPositions(0,700);
	}
	
	public boolean isIconsDrawerOnTheMap(){
		if((posX>0 && posX<=Constant.MAP_ACTUAL_WIDTH) && (posY>0 && posY<=Constant.MAP_ACTUAL_HEIGH)){
			return true;
		}else {
			return false;
		}
	}
}