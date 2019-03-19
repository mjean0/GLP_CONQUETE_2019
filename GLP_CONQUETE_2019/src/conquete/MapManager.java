package process;

import java.awt.Color;
import java.awt.Graphics;

import data.Resources;
import gui.elements.Arrow;
import gui.elements.Constant;
import gui.elements.Map;
import process.management.ItemsPaths;
import test.Variables;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;

public class MapManager{
	private Resources resources;
	private Variables variables;
	
	public MapManager(Resources resources,Variables variables){
		this.resources = resources;
		this.variables = variables;
	}
	
	public void drawIconsOnTheMap(Graphics g,Map map){
		if(variables.isDrawArrowOnTheMap()){
			 for(int i = 0;i<=variables.getCurrentIndex()[resources.getStaticArrow().getID()];i++){
				 System.out.println(variables.getCurrentIndex()[resources.getStaticArrow().getID()]); 
				 g.drawImage(IconsUtility.readImage(resources.getArrow()[i].getFilePath()),resources.getArrow()[i].getPosX(),resources.getArrow()[i].getPosY(),Constant.ICON_WIDTH,Constant.ICON_HEIGHT,map);
			 }
		}
		if(variables.isDrawChar1OnTheMap()){
			 for(int i = 0;i<=variables.getCurrentIndex()[resources.getStaticChar1().getID()];i++){
				 System.out.println(variables.getCurrentIndex()[resources.getStaticChar1().getID()]); 
				 g.drawImage(IconsUtility.readImage(resources.getChar1()[i].getFilePath()),resources.getChar1()[i].getPosX(),resources.getChar1()[i].getPosY(),Constant.ICON_WIDTH,Constant.ICON_HEIGHT,map);
			 }
		}
		if(variables.isDrawChar2OnTheMap()){
			 for(int i = 0;i<=variables.getCurrentIndex()[resources.getStaticChar2().getID()];i++){
				 System.out.println(variables.getCurrentIndex()[resources.getStaticChar2().getID()]); 
				 g.drawImage(IconsUtility.readImage(resources.getChar2()[i].getFilePath()),resources.getChar2()[i].getPosX(),resources.getChar2()[i].getPosY(),Constant.ICON_WIDTH,Constant.ICON_HEIGHT,map);
			 }
		}
		if(variables.isDrawChar3OnTheMap()){
			 for(int i = 0;i<=variables.getCurrentIndex()[resources.getStaticChar1().getID()];i++){
				 System.out.println(variables.getCurrentIndex()[resources.getStaticChar3().getID()]); 
				 g.drawImage(IconsUtility.readImage(resources.getChar3()[i].getFilePath()),resources.getChar3()[i].getPosX(),resources.getChar3()[i].getPosY(),Constant.ICON_WIDTH,Constant.ICON_HEIGHT,map);
			 }
		}
		if(variables.isDrawChar4OnTheMap()){
			 for(int i = 0;i<=variables.getCurrentIndex()[resources.getStaticChar4().getID()];i++){
				 System.out.println(variables.getCurrentIndex()[resources.getStaticChar4().getID()]); 
				 g.drawImage(IconsUtility.readImage(resources.getChar4()[i].getFilePath()),resources.getChar4()[i].getPosX(),resources.getChar4()[i].getPosY(),Constant.ICON_WIDTH,Constant.ICON_HEIGHT,map);
			 }
		}
		if(variables.isDrawChar5OnTheMap()){
			 for(int i = 0;i<=variables.getCurrentIndex()[resources.getStaticChar5().getID()];i++){
				 System.out.println(variables.getCurrentIndex()[resources.getStaticChar5().getID()]); 
				 g.drawImage(IconsUtility.readImage(resources.getChar5()[i].getFilePath()),resources.getChar5()[i].getPosX(),resources.getChar5()[i].getPosY(),Constant.ICON_WIDTH,Constant.ICON_HEIGHT,map);
			 }
		}
	}
	
	public void drawPlayGrounds(Graphics g,Map map){
		for(int x=0;x<1500;x+=Constant.MAP_WIDTH){
			for(int y=0;y<800;y+=Constant.MAP_HEIGHT){
				if(x==0){
					g.setColor(Color.green);
					g.fillRect(x,y,Constant.MAP_WIDTH,Constant.MAP_HEIGHT);
				}
			}
		}
	}

	public Resources getRessources() {
		return resources;
	}

	public void setRessources(Resources resources) {
		this.resources = resources;
	}

	public Variables getVariables() {
		return variables;
	}

	public void setVariables(Variables variables) {
		this.variables = variables;
	}
}
