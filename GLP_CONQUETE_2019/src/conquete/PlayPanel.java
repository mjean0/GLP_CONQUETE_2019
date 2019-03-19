package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayPanel extends JPanel {
	
	  /**
	 * 
	 */
	  private static final long serialVersionUID = 1L;
	  private static final Font MY_FONT = new Font("arial", Font.BOLD, 15) ;
	  private static final Color COLOR_BUTTON = new Color( 39, 174, 96);
	  
	  private JButton jbSolo ,jbMulti ,jbBackToMain;
	  private JLabel background ,modeGame ;
	  private ImageIcon img ;
	  
	  private Font customFont ;
	  
	  private PlayPanel instancePlayPanel = this;
	  
      public PlayPanel() {
//	    img = new ImageIcon("img/background1.png");
//	    background = new JLabel("",img,JLabel.CENTER);
//	    background.setSize(1500,800);
//	    this.add(background);
	    
	    setLayout(null);
	    this.setSize(1500, 800);
	    setBackground(Color.DARK_GRAY);
	    
	    jbSolo = new JButton("Conquest");
	    jbMulti = new JButton("Multiplayer");
	    jbBackToMain = new JButton("Home");
	    modeGame = new JLabel("Mode Game");
	    
	    
	    modeGame.setBounds(560, 120, 500, 100);
	    modeGame.setFont(new Font("arial", Font.BOLD, 42));
	    modeGame.setForeground(Color.WHITE);
	   
	    jbSolo.setFont(MY_FONT);
	    jbSolo.setBackground(Color.black);
	   	jbSolo.setForeground(Color.WHITE);
	   	jbSolo.setFocusPainted(false);
	   	
	   	
//	   	jbMulti.setFont(MY_FONT); 
	   	jbMulti.setBackground(Color.black);
	   	jbMulti.setForeground(Color.WHITE);
	   	jbMulti.setFocusPainted(false);
	   	
//	   	jbBackToMain.setFont(MY_FONT); 
	   	jbBackToMain.setBackground(Color.black);
	   	jbBackToMain.setForeground(Color.WHITE);
	   	jbBackToMain.setFocusPainted(false);
	   	
	   	jbSolo.setBounds(600,300,190,30);
	   	jbMulti.setBounds(600,340,190,30);
	   	jbBackToMain.setBounds(600,380,190,30);
	   	
	   	add(jbMulti);
	   	add(jbSolo);
	   	add(jbBackToMain);
	   	add(modeGame);
	   	
//	    try {
//            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("font/PixelGameFont.ttf")).deriveFont(42);
//            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("font/PixelGameFont.ttf")).deriveFont(42));
//	        }catch (Exception e) {
//				// TODO: handle exception
//			}
      }

	public JButton getJbSolo() {
		return jbSolo;
	}

	public JButton getJbMulti() {
		return jbMulti;
	}

	public PlayPanel getInstancePlayPanel() {
		return instancePlayPanel;
	}

	public JButton getJbBackToMain() {
		return jbBackToMain;
	}
	

}
