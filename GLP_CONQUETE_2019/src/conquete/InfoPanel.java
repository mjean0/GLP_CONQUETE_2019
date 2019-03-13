package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InfoPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private Font font = new Font(Font.MONOSPACED, Font.BOLD, 14);
	
	private JLabel soldierAlive = new JLabel("ALIVE :");
	private JLabel soldierDead = new JLabel("DEAD :");
	private JLabel canonLabel = new JLabel("CANON : ");
	private JLabel cyborglabel = new JLabel("CYBORG : ");
	private JLabel goldLabel = new JLabel("GOLD :");
	private JLabel monsterLabel = new JLabel("MONSTER : ");
	private JLabel playerLabel = new JLabel("PLAYER : ");
	
	private JLabel valSoldierAlive = new JLabel();
	private JLabel valSoldierDead = new JLabel("0");
	private JLabel valCanonLabel = new JLabel();
	private JLabel valCyborgLabel = new JLabel();
	private JLabel valGoldLabel = new JLabel();
	private JLabel valMonsterLabel = new JLabel();
	
	
	private JLabel soldierAliveIA = new JLabel("ALIVE :");
	private JLabel soldierDeadIA = new JLabel("DEAD :");
	private JLabel canonLabelIA = new JLabel("CANON : ");
	private JLabel cyborglabelIA = new JLabel("CYBORG : ");
	private JLabel goldLabelIA = new JLabel("GOLD :");
	private JLabel monsterLabelIA = new JLabel("MONSTER : ");
	private JLabel playerLabelIA = new JLabel("PLAYER : ");
	
	private JLabel valSoldierAliveIA = new JLabel();
	private JLabel valSoldierDeadIA = new JLabel("0");
	private JLabel valCanonLabelIA = new JLabel();
	private JLabel valCyborgLabelIA = new JLabel();
	private JLabel valGoldLabelIA = new JLabel();
	private JLabel valMonsterLabelIA = new JLabel();
	

	public InfoPanel() {
		InfoPanelIA();
		randomNumber();
		setLayout(null);
		setBounds(10,10,1342,150);
		setBackground(Color.gray);
		soldierAlive.setFont(font);
		soldierAlive.setBounds(25,5,90,30);
		
		soldierDead.setFont(font);
		soldierDead.setForeground(Color.red);
		soldierDead.setBounds(25,25,90,30);
		
		valSoldierAlive.setFont(font);
		valSoldierAlive.setBounds(125,5,40,30);
		
		valSoldierDead.setFont(font);
		valSoldierDead.setForeground(Color.RED);
		valSoldierDead.setBounds(125,25,30,30);
		
		valCanonLabel.setFont(font);
		valCanonLabel.setBounds(125 , 45,30,30);
		
		canonLabel.setFont(font);
		canonLabel.setBounds(25,45,90,30);
		
		
		cyborglabel.setFont(font);
		cyborglabel.setBounds(25,65,90,30);
		
		valCyborgLabel.setFont(font);
		valCyborgLabel.setBounds(125,65,30,30);
		
		goldLabel.setFont(font);
		goldLabel.setBounds(25,85,90,30);
		
		valGoldLabel.setFont(font);
		valGoldLabel.setBounds(125,85,30,30);
		
		monsterLabel.setFont(font);
		monsterLabel.setBounds(25,105,90,30);
		
		valMonsterLabel.setFont(font);
		valMonsterLabel.setBounds(125,105,30,30);
		
		playerLabel.setFont(font);
		playerLabel.setBounds(300,5,90,30);
		
		
		add(soldierAlive);
		add(soldierDead);
		add(canonLabel);
		add(cyborglabel);
		add(goldLabel);
		add(monsterLabel);
		add(playerLabel);
		add(valSoldierAlive);
		add(valSoldierDead);
		add(valCanonLabel);
		add(valCyborgLabel);
		add(valGoldLabel);
		add(valMonsterLabel);
	}
	private void randomNumber() {
		Random ran = new Random();
		int n;
		for(int i=0;i<=4;i++) {
			n = ran.nextInt(100);
			if(i==0){
				String val = String.valueOf(n);
				valSoldierAlive.setText(val);
			}else if(i==1){
				String val = String.valueOf(n);
				valCanonLabel.setText(val);
			}else if(i==2) {
				String val = String.valueOf(n);
				valCyborgLabel.setText(val);
			}else if(i==3) {
				String val = String.valueOf(n);
				valGoldLabel.setText(val);
			}else if(i==4){
				String val = String.valueOf(n);
				valMonsterLabel.setText(val);
			}
		}
		Random ranIA = new Random();
		int m;
		for(int j = 0 ; j<=4; j++) {
			m = ranIA.nextInt(100);
			if(j==0){
				String val = String.valueOf(m);
				valSoldierAliveIA.setText(val);
			}else if(j==1){
				String val = String.valueOf(m);
				valCanonLabelIA.setText(val);
			}else if(j==2) {
				String val = String.valueOf(m);
				valCyborgLabelIA.setText(val);
			}else if(j==3) {
				String val = String.valueOf(m);
				valGoldLabelIA.setText(val);
			}else if(j==4){
				String val = String.valueOf(m);
				valMonsterLabelIA.setText(val);
			}
		}
	}
	private void  InfoPanelIA() {
		setLayout(null);
		
		soldierAliveIA.setFont(font);
		soldierAliveIA.setBounds(1175,5,90,30);
		
		valSoldierAliveIA.setFont(font);
		valSoldierAliveIA.setBounds(1275,5,30,30);
		
		soldierDeadIA.setFont(font);
		soldierDeadIA.setForeground(Color.red);
		soldierDeadIA.setBounds(1175,25,90,30);
		
		valSoldierDeadIA.setFont(font);
		valSoldierDeadIA.setForeground(Color.RED);
		valSoldierDeadIA.setBounds(1275,25,30,30);
		
		canonLabelIA.setFont(font);
		canonLabelIA.setBounds(1175,45,90,30);
		
		valCanonLabelIA.setFont(font);
		valCanonLabelIA.setBounds(1275,45,30,30);
		
		cyborglabelIA.setFont(font);
		cyborglabelIA.setBounds(1175,65,90,30);
		
		valCyborgLabelIA.setFont(font);
		valCyborgLabelIA.setBounds(1275,65,30,30);
		
		goldLabelIA.setFont(font);
		goldLabelIA.setBounds(1175,85,90,30);
		
		valGoldLabelIA.setFont(font);
		valGoldLabelIA.setBounds(1275,85,30,30);
		
		monsterLabelIA.setFont(font);
		monsterLabelIA.setBounds(1175,105,90,30);
		
		valMonsterLabelIA.setFont(font);
		valMonsterLabelIA.setBounds(1275,105,30,30);
		
		playerLabelIA.setFont(font);
		playerLabelIA.setBounds(950,5,90,30);
		
		
		add(soldierAliveIA);
		add(valSoldierAliveIA);
		add(soldierDeadIA);
		add(valSoldierDeadIA);
		add(canonLabelIA);
		add(valCanonLabelIA);
		add(cyborglabelIA);
		add(valCyborgLabelIA);
		add(goldLabelIA);
		add(valGoldLabelIA);
		add(monsterLabelIA);
		add(valMonsterLabelIA);
		add(playerLabelIA);
	}	
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			printLine(g2);
		}
		private void printLine(Graphics2D g2) {
			
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(1));
			g2.drawLine(200,0, 200, 200);
			
			g2.drawLine(250, 0, 250, 200);
			g2.drawLine(250, 40, 400, 40);
			g2.drawLine(200, 40, 450, 40);
			
			g2.drawLine(400, 0, 500, 80);
			
			g2.drawLine(1135, 0, 1135, 200);
			g2.drawLine(1085, 0, 1085, 200);
			g2.drawLine(1135, 40, 880, 40);
			g2.drawLine(930, 0, 830, 80);
			g2.drawRect(515, 90, 300, 52);
			g2.drawLine(500, 80, 830, 80);
		}	
}