package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;



public class Dashboard extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private static final int START_X = 8;
	private static final int START_Y = 8;
	private static final int WIDTH = 1345;
	private static final int HEIGHT =152;
	
	public Dashboard() {
		super();
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		printRect(g2);
	}

	private void printRect(Graphics2D g2) {
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(1));
		g2.drawRect(START_X, START_Y, WIDTH, HEIGHT);
		
	}	
}
