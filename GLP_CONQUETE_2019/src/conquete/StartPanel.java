package gui;
/***
 * 
 * @author ollaid
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class StartPanel extends JPanel{
	
	   private JLabel jlPlayer1 ,jlPlayer2 ,jlCountry1,jlCountry2; 
	   private JButton jbBack , jbStart;
	   
	   private JLabel background ;
	   private ImageIcon img ;
	   
	public StartPanel() {
//		img = new ImageIcon("img/background1.png");
//	    background = new JLabel("",img,JLabel.CENTER);
//	    this.add(background);
//	    background.setBounds(0,0,1440,900);
	    setLayout(null);
	    this.setBounds(0,0,1440,900);
	    setBackground(Color.DARK_GRAY);
	    
	    jlPlayer1= new JLabel();
	    jlPlayer2= new JLabel();
	    jlCountry1 = new JLabel();
	    jlCountry2 = new JLabel();
	    jbBack = new JButton("Back");
	    jbStart = new JButton("Start");
	    
	    jbBack.setBackground(Color.black);
	    jbStart.setBackground(Color.black);
	    jbStart.setForeground(Color.white);
	    jbBack.setForeground(Color.white);
	    
	    jlPlayer1.setForeground(Color.WHITE);
	    jlPlayer1.setFont(new Font("arial", Font.ITALIC, 41));
	    jlPlayer2.setForeground(Color.white);
	    jlPlayer2.setFont(new Font("arial", Font.ITALIC, 41));
	    jlCountry1.setForeground(Color.WHITE);
	    jlCountry2.setForeground(Color.WHITE);
	   
	    jlPlayer1.setBounds(60, 120, 500, 100);
	    jlPlayer2.setBounds(920, 120, 500, 100);
	    jlCountry1.setBounds(60, 220, 500, 100);
	    jlCountry2.setBounds(910, 220, 500, 100);
	  	jbBack.setBounds(580,500,190,30);
	  	jbStart.setBounds(580,540,190,30);
	  	
	  	add(jlPlayer1);
		add(jlPlayer2);
		add(jlCountry1);
		add(jlCountry2);
		add(jbBack);
		add(jbStart);
	}
	 public void paintComponent(Graphics g){
		    
		 	g.setColor(Color.GRAY);
		    g.fillRect(50, 100, 400, 500);
		    
		    g.setColor(Color.gray);
		    g.fillRect(900, 100, 400, 500);
		    
		    g.setColor(Color.white);
		    g.setFont(new Font(Font.MONOSPACED,Font.BOLD, 40));
		    g.drawString("VS", 660, 250);
		    
		    g.setFont(new Font(Font.MONOSPACED,Font.BOLD, 20));
		    g.drawString("Name :", 60, 140);
		    g.drawString("Name :", 910, 140);
		    
		    g.drawString("Country :", 60, 250);
		    g.drawString("Country :", 910, 250);
		   
		    try {
		        Image cannon1 = ImageIO.read(new File("img/cannonMobile_E.png"));
		        Image cannon2 = ImageIO.read(new File("img/cannonMobile_W.png"));
		        Image boat1 = ImageIO.read(new File("img/ship_dark_SE.png"));
		        Image boat2 = ImageIO.read(new File("img/ship_dark_SW.png"));
		        Image tank = ImageIO.read(new File("img/tanks_tankNavy1.png"));
		        Image plane = ImageIO.read(new File("img/spaceCraft4_SE.png"));
		        Image plane2 = ImageIO.read(new File("img/spaceCraft4_SW.png"));
//		        Image but = ImageIO.read(new File("img/red_button13.png"));
		        
		        g.drawImage(cannon1, 60, 500, 40,40,this);
		        g.drawImage(cannon2, 910, 500, 40,40,this);
		        g.drawImage(boat1, 60, 440, 50,50,this);
		        g.drawImage(boat2, 910, 440, 50,50,this);
		        g.drawImage(tank, 220, 500, 40,40,this);
		        g.drawImage(tank, 1080, 500, 40,40,this);
		        g.drawImage(plane, 220, 440, 50,50,this);
		        g.drawImage(plane2, 1080, 440, 50,50,this);
		        
//		        g.drawImage(but,550,500,190,30,this);
		   
		      } catch (IOException e) {
		        e.printStackTrace();
		      }  
		  }
	 
	public JLabel getPlayer1() {
		return jlPlayer1;
	}

	public JLabel getPlayer2() {
		return jlPlayer2;
	}
	public JButton getJbBack () {
		 return jbBack ;
	}
	public JButton getJbStart () {
		 return jbStart ;
	}
	public JLabel getJlCountry1() {
		return jlCountry1;
	}
	public JLabel getJlCountry2() {
		return jlCountry2;
	}
}
