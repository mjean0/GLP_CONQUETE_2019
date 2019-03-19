package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConquestPanel extends JPanel {
	
	  private static final Font MY_FONT = new Font("arial", Font.PLAIN, 15) ;
	  
      private JButton jbNext , jbBackToPlay ;
      private JTextField jtfName ;
      private JLabel jlbName ,infoPlayer;
      
      private JLabel background ;
	  private ImageIcon img ;
	   
   public ConquestPanel() {
	    
//	    img = new ImageIcon("img/background1.png");
//	    background = new JLabel("",img,JLabel.CENTER);
//	    background.setBounds(0,0,1500,800);
	    
	    setLayout(null);
	    this.setBounds(0,0,1500,800);
	    
		jbNext = new JButton("Next") ;
		jbBackToPlay=new JButton("Back");
		jtfName = new JTextField(10);
		jlbName = new JLabel("Name :") ;
		
		infoPlayer = new JLabel("Player information");
	    
		infoPlayer.setBounds(460, 120, 500, 100);
		infoPlayer.setFont(new Font("arial", Font.PLAIN, 50));
		infoPlayer.setForeground(Color.WHITE);
		
	    jlbName.setFont(new Font("arial", Font.PLAIN, 20));
	    jlbName.setForeground(Color.white);
	    jtfName.setFont(new Font("arial", Font.ITALIC, 15));
	  
//	    jbNext.setFont(MY_FONT);
	    jbNext.setBackground(Color.black);
	    jbNext.setForeground(Color.WHITE);
	    jbNext.setFocusPainted(false);
	  	
//	  	jbBackToPlay.setFont(MY_FONT);
	  	jbBackToPlay.setBackground(Color.black);
	  	jbBackToPlay.setForeground(Color.WHITE);
	  	jbBackToPlay.setFocusPainted(false);
	  	
	  	jlbName.setBounds(650,280,190,30);
	  	jtfName.setBounds(600,320,190,30);
	  	jbNext.setBounds(800,400,190,30);
	  	jbBackToPlay.setBounds(400,400,190,30);
	  	
	  	add(jlbName);
	    add(jtfName);
	  	add(jbNext);
	  	add(jbBackToPlay);
	  	add(infoPlayer);
	    setBackground(Color.DARK_GRAY);
 
    }

		public JButton getJbNext() {
			return jbNext;
		}
		
		public JButton getJbBackToPlay() {
			return jbBackToPlay;
		}
		
		public JTextField getJtfName() {
			return jtfName;
		}
		
		public JLabel getJlbName() {
			return jlbName;
		}
}
