package gui.elements;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import data.Resources;
import process.IconsUtility;
import process.MapManager;
import process.management.MapZoomManager;
import test.Variables;

public class Map extends JPanel implements MapZoomManager{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private int windowsWidth;
	private int windowsHeight;
	
	private int zoomInWidth;
	private int zoomInHeight;
	private int extendsValue;
	
	private boolean zoomIn = true;
	private boolean zoomOut = false;
	private MapManager mapManager;
		
	//private MainFrame frame;		
	public Map(int windowsWidth,int windowsHeight,Color mapColor,MainFrame frame){
		
		this.windowsWidth = windowsWidth;
		this.windowsHeight = 570;//valeur provisoire
		this.zoomInWidth = this.getWidth();
		this.zoomInHeight = this.getHeight();
		this.extendsValue = 500;
		//this.frame = frame;
		this.setLayout(null);
		this.setBackground(mapColor);
		this.setBounds(0,0, this.windowsWidth, this.windowsHeight);
		initDimension();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//draw
		g.setColor(Color.darkGray);	
		//mapManager.drawPlayGrounds(g, this);
		g.setColor(Color.black);
		drawIsometricGrid(g);
		g.setColor(Color.black);
		//drawVerticalGrid(g);
		//drawHorizontalGrid(g);
		mapManager.drawIconsOnTheMap(g, this);
	}
	
	public void drawVerticalGrid(Graphics g){
		for(int i = 0;i<windowsWidth;i+=Constant.MAP_WIDTH){
			g.drawLine(i,0,i,windowsHeight+500);
		}
	}
	public void drawHorizontalGrid(Graphics g){
		for(int i = 0;i<windowsHeight;i+=Constant.MAP_HEIGHT){
			g.drawLine(0,i,windowsWidth,i);
		}
	}
	
	public void initDimension(){
		Constant.MAP_ACTUAL_WIDTH = this.getWidth();
		Constant.MAP_ACTUAL_HEIGH = 570;//valeur provisoire
	}

//	public void drawVerticalGrid1(Graphics g,int x, int y){
//			//g.fillOval(x, y, 100, 100);
//			//this.setPreferredSize(new Dimension(x1+1000,x1+700));
//			//x1+=100;
//			//iconsDrawer.drawInitialIcons(frame.getGraphics(), this, x, y);
//			revalidate();
//			repaint();
//	}
//	
	public void drawIsometricGrid(Graphics g){
		for(int x=0;x<windowsWidth;x+=Constant.MAP_WIDTH){
			for(int y=0;y<windowsHeight;y+=Constant.MAP_HEIGHT){
				g.drawLine(x+Constant.HALF_WIDTH,y,x,y+Constant.HALF_HEIGHT);
				g.drawLine(x,y+Constant.HALF_HEIGHT,x+Constant.HALF_WIDTH,y+Constant.MAP_HEIGHT);
				g.drawLine(x+Constant.HALF_WIDTH,y+Constant.MAP_HEIGHT,x+Constant.MAP_WIDTH,y+Constant.HALF_HEIGHT);
				g.drawLine(x+Constant.MAP_WIDTH,y+Constant.HALF_HEIGHT,x+Constant.HALF_WIDTH,y);
			}
		}
	}
	
	public void newMapIconsManager(Resources resssources,Variables variables ){
		this.mapManager = new MapManager(resssources,variables);
	}
	
	@Override
	public void zoomIn() {
		zoomInWidth+=extendsValue;
		zoomInHeight+=extendsValue;
		Constant.MAP_ACTUAL_WIDTH = zoomInWidth;
		Constant.MAP_ACTUAL_HEIGH = zoomInHeight;
		//Pour actualiser la longueur des grilles verticales
		this.windowsWidth+=extendsValue;
		this.windowsHeight+=extendsValue;
//		Constant.MAP_WIDTH+=40;
//		Constant.MAP_HEIGHT+=40;
		this.setPreferredSize(new Dimension(zoomInWidth,zoomInHeight));
		revalidate();
	}
	@Override
	public void zoomOut() {
		if(zoomInWidth>=this.getWidth() && zoomInHeight>=this.getHeight()){
			zoomInWidth-=extendsValue;
			zoomInHeight-=extendsValue;
			Constant.MAP_ACTUAL_WIDTH = zoomInWidth;
			Constant.MAP_ACTUAL_HEIGH = zoomInHeight;
			this.windowsWidth-=extendsValue;
			this.windowsHeight-=extendsValue;
//			Constant.MAP_WIDTH-=40;
//			Constant.MAP_HEIGHT-=40;
			this.setPreferredSize(new Dimension(zoomInWidth,zoomInHeight));
			revalidate();
		}else{
			this.setPreferredSize(new Dimension(zoomInWidth,zoomInHeight));
			revalidate();
		}
	}
	public boolean isZoomIn() {
		return zoomIn;
	}
	public void setZoomIn(boolean zoomIn) {
		this.zoomIn = zoomIn;
	}
	public boolean isZoomOut() {
		return zoomOut;
	}
	public void setZoomOut(boolean zoomOut) {
		this.zoomOut = zoomOut;
	} 
	
}
