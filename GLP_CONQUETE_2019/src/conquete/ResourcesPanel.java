package gui.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import data.Resources;
import process.ActionsEvents;
import process.IconsUtility;
import test.Variables;

public class ResourcesPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7015131661064313325L;
		//Initials positions
		private int initialX = 0;
		private int initialY = 10;
		
		//IconsDrawer positions
		private int iconsDrawerPosX;
		private int iconsDrawerPosY;
		//staticItems 
//		private Arrow staticArrowIcon;
//		private Cannon staticCannonIcon;
//		private Diamond staticDiamondIcon;
//		private FireBall staticFireBallIcon;
//		private Gold staticGoldIcon;
//		private Iron staticIronIcon;
//		private Plant staticPlantIcon;
//		private Wood staticWoodIcon;
				
		//others components
		private JPanel rootPane;
		private Map map;
		
		
		//Variables
		private Variables variables = new Variables();
		
		//Resources
		private Resources resources;
		
		//IconsDrawer
		private IconsDrawer iconsDrawer;
		
		public ResourcesPanel(JPanel rootPane,Map map,int iconsDrawerPosX,int iconsDrawerPosY){
	
			//IconsDrawer
			resources = new Resources(iconsDrawerPosX,iconsDrawerPosY);
			iconsDrawer = new IconsDrawer(variables,resources);
			//Initials positions
			this.iconsDrawerPosX = iconsDrawerPosX;
			this.iconsDrawerPosY = iconsDrawerPosY;
			//others components
			this.rootPane = rootPane;
			this.map = map;
			initLayout();
			add();
			mapAdd();
			initActions();
		}
		
		public void initLayout(){
			this.setBackground(Color.darkGray);
			this.setLayout(null);
		}
		
		public void initActions(){
			rootPane.addMouseMotionListener(new ActionsEvents(resources,iconsDrawer,variables,map));
			rootPane.addMouseListener(new ActionsEvents(resources,iconsDrawer,variables,map));
			map.addMouseMotionListener(new ActionsEvents(resources,iconsDrawer,variables,map));
			map.addMouseListener(new ActionsEvents(resources,iconsDrawer,variables,map));
//			this.addMouseMotionListener(new ActionsEvents(ressources,iconsDrawer,variables));
//			this.addMouseListener(new ActionsEvents(ressources,iconsDrawer,variables));
		}
		
		public void add(){
			iconsDrawer.setPositions(iconsDrawerPosX,iconsDrawerPosY);
			iconsDrawer.setBounds(iconsDrawer.getPosX(),iconsDrawer.getPosY(), Constant.ICON_WIDTH, Constant.ICON_HEIGHT);
			rootPane.add(iconsDrawer);
		}
		
		public void mapAdd(){
			map.newMapIconsManager(resources, variables);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			drawText(g2);
			drawLineSeparator(g2);
			drawInitialItems(g2);
		}
		
		public void drawInitialItems(Graphics2D g2){
			g2.drawImage(IconsUtility.readImage(resources.getStaticArrow().getFilePath()),initialX,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticCannon().getFilePath()),initialX+Constant.ICON_WIDTH,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticDiamond().getFilePath()),initialX+Constant.ICON_WIDTH*2,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticFireBall().getFilePath()),initialX+Constant.ICON_WIDTH*3,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticGold().getFilePath()),initialX+Constant.ICON_WIDTH*4,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticIron().getFilePath()),initialX+Constant.ICON_WIDTH*5,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticPlant().getFilePath()),initialX+Constant.ICON_WIDTH*6,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticWood().getFilePath()),initialX+Constant.ICON_WIDTH*7,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticChar1().getFilePath()),initialX,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticChar2().getFilePath()),initialX,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticChar3().getFilePath()),initialX,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticChar4().getFilePath()),initialX,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
			g2.drawImage(IconsUtility.readImage(resources.getStaticChar5().getFilePath()),initialX,initialY,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);


			
			
			//y = 10
			//initialY = 50;
//			g.drawImage(IconsUtility.readImage(staticArrowIcon.getFilePath()),staticArrowIcon.getPosX(),50,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
//			g.drawImage(IconsUtility.readImage(staticCannonIcon.getFilePath()),staticCannonIcon.getPosX(),50,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
//			g.drawImage(IconsUtility.readImage(staticDiamondIcon.getFilePath()),staticDiamondIcon.getPosX(),50,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
//			g.drawImage(IconsUtility.readImage(staticFireBallIcon.getFilePath()),staticFireBallIcon.getPosX(),50,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
//			g.drawImage(IconsUtility.readImage(staticGoldIcon.getFilePath()),staticGoldIcon.getPosX(),50,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
//			g.drawImage(IconsUtility.readImage(staticIronIcon.getFilePath()),staticIronIcon.getPosX(),50,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
//			g.drawImage(IconsUtility.readImage(staticPlantIcon.getFilePath()),staticPlantIcon.getPosX(),50,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
//			g.drawImage(IconsUtility.readImage(staticWoodIcon.getFilePath()),staticWoodIcon.getPosX(),50,Constant.ICON_WIDTH,Constant.ICON_HEIGHT,this);
		}
		
		public void drawLineSeparator(Graphics2D g2){
			int x = 335,y=100;
			g2.setColor(Color.white);
			for(int i=0;i<3;i++){
				g2.drawLine(x, 0, x,y);
				x+=335;
			}
		}
		
		public void drawText(Graphics2D g2){
			int x = 335,y=10;
			String[] text = new String[] {"Construction","Characters","Transport","Weapons"};
			g2.setColor(Color.white);
			for(int i=0;i<text.length;i++){
				if(i==0){
					g2.drawString(text[i], (x/2)-text[i].length()*5, y);
				}else if(i==1){
					g2.drawString(text[i], ((x/2)+335/2)-text[i].length()*4, y);
				}else if(i==2){
					g2.drawString(text[i], ((x/3)+x/2)-text[i].length()*3, y);
				}else if(i==3){
					g2.drawString(text[i], ((x/4)+x/2)+text[i].length()*15, y);
				}
				x+=335;
			}
		}
		
}
