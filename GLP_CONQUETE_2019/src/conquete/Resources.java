package data;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Constant;
import gui.elements.Diamond;
import gui.elements.FireBall;
import gui.elements.Gold;
import gui.elements.Iron;
import gui.elements.Plant;
import gui.elements.Wood;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;

public class Resources {

		//staticItems 
		private Arrow staticArrow;
		private Cannon staticCannon;
		private Diamond staticDiamond;
		private FireBall staticFireBall;
		private Gold staticGold;
		private Iron staticIron;
		private Plant staticPlant;
		private Wood staticWood;
		private Arrow staticChar1;
		private Arrow staticChar2;
		private Arrow staticChar3;
		private Arrow staticChar4;
		private Arrow staticChar5;
		
		//All Items
		private Arrow[] arrow;
		private Cannon[] cannon;
		private Diamond[] diamond;
		private FireBall[] fireBall;
		private Gold[] gold;
		private Iron[] iron;
		private Plant[] plant;
		private Wood[] wood;
		private Char1[] char1;
		private Char2[] char2;
		private Char3[] char3;
		private Char4[] char4;
		private Char5[] char5;
		//Initials Positons
		private int initialX;
		private int initialY;
		
		public Resources(int initialX,int initialY){
			//static
			staticArrow = new Arrow();
			staticCannon = new Cannon();
			staticDiamond = new Diamond();
			staticFireBall = new FireBall();
			staticGold = new Gold();
			staticIron = new Iron();
			staticPlant = new Plant();
			staticWood = new Wood();
			staticChar1 = new Char1();
			staticChar2 = new Char2();
			staticChar3 = new Char3();
			staticChar4 = new Char4();
			staticChar5 = new Char5();
			//Items
			arrow = new Arrow[Constant.MAX_ELEMENTS];
			cannon = new Cannon[Constant.MAX_ELEMENTS];
			diamond = new Diamond[Constant.MAX_ELEMENTS];
			fireBall = new FireBall[Constant.MAX_ELEMENTS];
			gold = new Gold[Constant.MAX_ELEMENTS];
			iron = new Iron[Constant.MAX_ELEMENTS];
			plant = new Plant[Constant.MAX_ELEMENTS]; 
			wood = new Wood[Constant.MAX_ELEMENTS];
			char1 = new Char1[Constant.MAX_ELEMENTS];
			char2 = new Char2[Constant.MAX_ELEMENTS];
			char3 = new Char3[Constant.MAX_ELEMENTS];
			char4 = new Char4[Constant.MAX_ELEMENTS];
			char5 = new Char5[Constant.MAX_ELEMENTS];
			this.initialX = initialX;
			this.initialY = initialY;

			initAllItems();
			setInitialPositions();
		}
		
		public void initAllItems(){
			for(int i = 0; i<Constant.MAX_ELEMENTS; i++){
				arrow[i] = new Arrow();
				cannon[i] = new Cannon(); 
				diamond[i] = new Diamond();
				fireBall[i] = new FireBall();
				gold[i] = new Gold();
				iron[i] = new Iron();
				plant[i] = new Plant();
				wood[i] = new Wood();
				char1[i] = new Char1();
				char2[i] = new Char2();
				char3[i] = new Char3();
				char4[i] = new Char4();
				char5[i] = new Char5();
			}
		}
		
		public void setInitialPositions(){
			staticArrow.setPosX(initialX);
			staticArrow.setPosY(initialY);

			staticCannon.setPosX(initialX+Constant.ICON_WIDTH);
			staticCannon.setPosY(initialY);
			
			staticDiamond.setPosX(initialX+Constant.ICON_WIDTH*2);
			staticDiamond.setPosY(initialY);
			
			staticFireBall.setPosX(initialX+Constant.ICON_WIDTH*3);
			staticFireBall.setPosY(initialY);
						
			staticGold.setPosX(initialX+Constant.ICON_WIDTH*4); 
			staticGold.setPosY(initialY);
			
			staticIron.setPosX(initialX+Constant.ICON_WIDTH*5);
			staticIron.setPosY(initialY);
			
			staticPlant.setPosX(initialX+Constant.ICON_WIDTH*6);
			staticPlant.setPosY(initialY);
			
			staticWood.setPosX(initialX+Constant.ICON_WIDTH*7);
			staticWood.setPosY(initialY);
			
			staticChar1.setPosX(initialX+Constant.ICON_WIDTH*8);
			staticChar1.setPosY(initialY);
			
			staticChar2.setPosX(initialX+Constant.ICON_WIDTH*9);
			staticChar2.setPosY(initialY);
			
			staticChar3.setPosX(initialX+Constant.ICON_WIDTH*10);
			staticChar3.setPosY(initialY);
			
			staticChar4.setPosX(initialX+Constant.ICON_WIDTH*11);
			staticChar4.setPosY(initialY);
			
			staticChar5.setPosX(initialX+Constant.ICON_WIDTH*12);
			staticChar5.setPosY(initialY);
		}
		
		//Getters and setters
		//Static
		public Arrow getStaticArrow() {
			return staticArrow;
		}

		public Cannon getStaticCannon() {
			return staticCannon;
		}

		public Diamond getStaticDiamond() {
			return staticDiamond;
		}

		public FireBall getStaticFireBall() {
			return staticFireBall;
		}

		public Gold getStaticGold() {
			return staticGold;
		}

		public Iron getStaticIron() {
			return staticIron;
		}

		public Plant getStaticPlant() {
			return staticPlant;
		}

		public Wood getStaticWood() {
			return staticWood;
		}
		
		public Char1 getStaticChar1() {
			return staticChar1;
		}
		
		public Char2 getStaticChar2() {
			return staticChar2;
		}
		
		public Char3 getStaticChar3() {
			return staticChar3;
		}
		
		public Char4 getStaticChar4() {
			return staticChar4;
		}
		
		public Char5 getStaticChar5() {
			return staticChar5;
		}
		//non Static
		public Arrow[] getArrow() {
			return arrow;
		}
		public Cannon[] getCannon() {
			return cannon;
		}

		public Diamond[] getDiamond() {
			return diamond;
		}

		public FireBall[] getFireBall() {
			return fireBall;
		}

		public Gold[] getGold() {
			return gold;
		}

		public Iron[] getIron() {
			return iron;
		}

		public Plant[] getPlant() {
			return plant;
		}

		public Wood[] getWood() {
			return wood;
		}
		
		public Char1[] getChar1() {
			return char1;
		}
		
		public Char2[] getChar2() {
			return char2;
		}
		
		public Char3[] getChar3() {
			return char3;
		}
		
		public Char4[] getChar4() {
			return char4;
		}
		
		public Char5[] getChar5() {
			return char5;
		}
}
