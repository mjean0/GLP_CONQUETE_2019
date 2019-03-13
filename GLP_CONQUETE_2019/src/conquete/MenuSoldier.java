package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MenuSoldier extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton war ;

	public MenuSoldier() {
		super();
		setLayout(null);
		war = new JButton();
		war.setBounds(150,400,40,40);
		Image soldier = new ImageIcon(this.getClass().getResource("/war.png")).getImage();
		war.setIcon(new ImageIcon(soldier));
		war.addActionListener(new Characters());
		add(war);
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// We used Graphic2D for more draw options.
		Graphics2D g2 = (Graphics2D) g;
		printRect(g2);
	}
	private void printRect(Graphics2D g2) {
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(1));
		g2.drawRect(20,400,300,200);
		//g2.drawImage();
	}
	
	private class Characters implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}	
	}
}
