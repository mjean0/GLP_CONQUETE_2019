package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.Chronometer;
import gui.CyclicCounter;


public class InfoPanel extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;
	private static final int CHRONO_SPEED = 100;
	private Font font = new Font(Font.MONOSPACED, Font.BOLD, 14);
	private InfoPanel instance = this;
	private boolean stop = true;
	private JLabel soldierAlive = new JLabel("ALIVE :");
	private JLabel soldierDead = new JLabel("DEAD :");
	private JLabel canonLabel = new JLabel("CANON : ");
	private JLabel chipslabel = new JLabel("CHIPS : ");
	private JLabel goldLabel = new JLabel("GOLD :");
	private JLabel woodLabel = new JLabel("WOOD : ");
	private JLabel playerLabel = new JLabel("PLAYER : ");
	
	private JButton startButton = new JButton(" Start ");
	private JLabel valSoldierAlive = new JLabel("0");
	private JLabel valSoldierDead = new JLabel("0");
	private JLabel valCanonLabel = new JLabel();
	private JLabel valChipsLabel = new JLabel("0");
	private JLabel valGoldLabel = new JLabel();
	private JLabel valWoodLabel = new JLabel();
	
	private static Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 20);
	private JLabel soldierAliveIA = new JLabel("ALIVE :");
	private JLabel soldierDeadIA = new JLabel("DEAD :");
	private JLabel canonLabelIA = new JLabel("CANON : ");
	private JLabel chipslabelIA = new JLabel("CHIPS : ");
	private JLabel goldLabelIA = new JLabel("GOLD :");
	private JLabel woodLabelIA = new JLabel("WOOD : ");
	private JLabel playerLabelIA = new JLabel("PLAYER : ");
	
	private JLabel valSoldierAliveIA = new JLabel("0");
	private JLabel valSoldierDeadIA = new JLabel("0");
	private JLabel valCanonLabelIA = new JLabel();
	private JLabel valChipsLabelIA = new JLabel("0");
	private JLabel valGoldLabelIA = new JLabel();
	private JLabel valWoodLabelIA = new JLabel();
	
	private JLabel hourValue = new JLabel("00:");
	private JLabel minuteValue = new JLabel("00:");
	private JLabel secondValue = new JLabel("00");
	
	private Chronometer chronometer = new Chronometer();


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
		
		
		chipslabel.setFont(font);
		chipslabel.setBounds(25,65,90,30);
		
		valChipsLabel.setFont(font);
		valChipsLabel.setBounds(125,65,30,30);
		
		goldLabel.setFont(font);
		goldLabel.setBounds(25,85,90,30);
		
		valGoldLabel.setFont(font);
		valGoldLabel.setBounds(125,85,30,30);
		
		woodLabel.setFont(font);
		woodLabel.setBounds(25,105,90,30);
		
		valWoodLabel.setFont(font);
		valWoodLabel.setBounds(125,105,30,30);
		
		playerLabel.setFont(font);
		playerLabel.setBounds(300,5,90,30);
		
		hourValue.setFont(font1);
		hourValue.setBounds(610,20,80,30);
		add(hourValue);
		
		minuteValue.setFont(font1);
		minuteValue.setBounds(650,20,80,30);
		add(minuteValue);
		
		secondValue.setFont(font1);
		secondValue.setBounds(690,20,80,30);
		add(secondValue);
		
		startButton.setFont(font);
		startButton.setBounds(550,100,180,40);
		startButton.addActionListener(new StartStopAction());
		add(startButton);
		
		add(soldierAlive);
		add(soldierDead);
		add(canonLabel);
		add(chipslabel);
		add(goldLabel);
		add(woodLabel);
		add(playerLabel);
		add(valSoldierAlive);
		add(valSoldierDead);
		add(valCanonLabel);
		add(valChipsLabel);
		add(valGoldLabel);
		add(valWoodLabel);
	}

	private void updateValues() {
		// This part is for textual time printing.
		CyclicCounter hour = chronometer.getHour();
		hourValue.setText(hour.toString() + ":");

		CyclicCounter minute = chronometer.getMinute();
		minuteValue.setText(minute.toString() + ":");

		CyclicCounter second = chronometer.getSecond();
		secondValue.setText(second.toString() + "");
	}
	private void randomNumber() {
		Random ran = new Random();
		int n;
		for(int i=0;i<=4;i++) {
			n = ran.nextInt(100);
			 if(i==1){
				String val = String.valueOf(n);
				valCanonLabel.setText(val);
			}else if(i==3) {
				String val = String.valueOf(n);
				valGoldLabel.setText(val);
			}else if(i==4){
				String val = String.valueOf(n);
				valWoodLabel.setText(val);
			}
		}
		Random ranIA = new Random();
		int m;
		for(int j = 0 ; j<=4; j++) {
			m = ranIA.nextInt(100);
			 if(j==1){
				String val = String.valueOf(m);
				valCanonLabelIA.setText(val);
			}else if(j==3) {
				String val = String.valueOf(m);
				valGoldLabelIA.setText(val);
			}else if(j==4){
				String val = String.valueOf(m);
				valWoodLabelIA.setText(val);
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
		
		chipslabelIA.setFont(font);
		chipslabelIA.setBounds(1175,65,90,30);
		
		valChipsLabelIA.setFont(font);
		valChipsLabelIA.setBounds(1275,65,30,30);
		
		goldLabelIA.setFont(font);
		goldLabelIA.setBounds(1175,85,90,30);
		
		valGoldLabelIA.setFont(font);
		valGoldLabelIA.setBounds(1275,85,30,30);
		
		woodLabelIA.setFont(font);
		woodLabelIA.setBounds(1175,105,90,30);
		
		valWoodLabelIA.setFont(font);
		valWoodLabelIA.setBounds(1275,105,30,30);
		
		playerLabelIA.setFont(font);
		playerLabelIA.setBounds(950,5,90,30);
		
		
		add(soldierAliveIA);
		add(valSoldierAliveIA);
		add(soldierDeadIA);
		add(valSoldierDeadIA);
		add(canonLabelIA);
		add(valCanonLabelIA);
		add(chipslabelIA);
		add(valChipsLabelIA);
		add(goldLabelIA);
		add(valGoldLabelIA);
		add(woodLabelIA);
		add(valWoodLabelIA);
		add(playerLabelIA);
	}	
	
	private class StartStopAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (stop) {
				startButton.setText(" Start ");
				stop = false;
				startButton.setText(" Pause ");
				Thread chronoThread = new Thread(instance);
				chronoThread.start();
			}
		}
	}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			printLine(g2);
			printCircle(g2);
		}
		private void printCircle(Graphics2D g3) {
			Color[] colors = new Color[]{Color.GREEN, Color.gray};
			int colorIndex = 0;
			g3.setColor(colors[colorIndex % 2]);
			colorIndex++;
			g3.fillOval(300, 100, 30, 30);
			//for IAplayer
			g3.setColor(Color.red);
			g3.fillOval(950, 100, 30, 30);		
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
		protected void paintComponent1(Graphics g1) {
			super.paintComponents(g1);
			Graphics2D g3 = (Graphics2D) g1;
			printCircle(g3);
		}
		public void run() {
			while (!stop) {
				try {
					Thread.sleep(CHRONO_SPEED);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				chronometer.decrement();
				
				// Ensure that the chronometer is not stopped during the iteration.
				if (!stop) {
					updateValues();
				}if(chronometer.isMax()) {
					 Graphics g1 =getGraphics();
						g1.setColor(Color.red);
						g1.fillOval(300, 100, 30, 30);
						//for IAplayer
						g1.setColor(Color.green);
						g1.fillOval(950, 100, 30, 30);	
					stop=true;
				}
			}
		}
}