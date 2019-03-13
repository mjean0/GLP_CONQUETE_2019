package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MultiPlayerPanel extends JPanel {
	
		  private static final Dimension DIMENSION_BUTTON = new Dimension(100, 30) ;
		  private static final Font MY_FONT = new Font("arial", Font.PLAIN, 15) ;
		  private static final Color COLOR_BUTTON = new Color( 39, 174, 96);
	  
		   private JButton jbStart , jbBackToPlay;
		   private JTextField jtfGamer1 , jtfGamer2 ;
		   private JLabel jlGamer1 , jlGamer2 ;
		   
		   private JLabel background ;
		   private ImageIcon img ;
	   
	 public MultiPlayerPanel() {
//		    img = new ImageIcon("img/background1.png");
//		    background = new JLabel("",img,JLabel.CENTER);
//		    this.add(background);
//		    background.setBounds(0,0,1500,800);
		    
		    setLayout(null);
		    this.setBounds(0,0,1500,800);
	    
		   jbStart  = new JButton("Start");
		   jbBackToPlay = new JButton("Back");
		   jtfGamer1  = new JTextField(10);
		   jtfGamer2 = new JTextField(10) ;
		   jlGamer1 = new JLabel("Player 1 :");
		   jlGamer2 = new JLabel("PLayer 2 :");
	    	    
	      jlGamer1.setFont(new Font("arial", Font.PLAIN, 20));
	      jlGamer1.setForeground(Color.white);
	      jlGamer2.setFont(new Font("arial", Font.PLAIN, 20));
	      jlGamer2.setForeground(Color.white);
	     
	     jbStart.setFont(MY_FONT);
	     jbStart.setBackground(Color.DARK_GRAY);
	     jbStart.setForeground(Color.WHITE);
	  	 jbStart.setFocusPainted(false);
	  	 
	  	 jbBackToPlay.setFont(MY_FONT);
	  	 jbBackToPlay.setBackground(Color.black);
	  	 jbBackToPlay.setForeground(Color.WHITE);
	  	 jbBackToPlay.setFocusPainted(false);
	  	 
	  	 jtfGamer1.setText("Enter your name");
	  	 jtfGamer2.setText("Enter your name");
	  	 jtfGamer1.setFont(new Font("arial", Font.ITALIC, 15));
	  	 jtfGamer2.setFont(new Font("arial", Font.ITALIC, 15));
	  	 
//	  	 jtfGamer1.addMouseListener(new mouseAction());
//	  	 jtfGamer2.addMouseListener(new mouseAction());
			
	  	 jlGamer1.setBounds(600,200,190,30);
	  	 jtfGamer1.setBounds(600, 240, 190, 30);
	  	 jlGamer2.setBounds(600,280,190,30);
	  	 jtfGamer2.setBounds(600, 320, 190, 30);
	  	 jbStart.setBounds(600, 360, 190, 30);
	  	 jbBackToPlay.setBounds(600,640,190,30);
	  	 
	  	 add(jlGamer1);
	  	 add(jtfGamer1);
	  	 add(jlGamer2);
	  	 add(jtfGamer2);
	  	 add(jbStart);
	  	 add(jbBackToPlay);  	 
	     setBackground(Color.DARK_GRAY);

   }

	public JButton getJbStart() {
		return jbStart;
	}

	public JButton getJbBackToPlay() {
		return jbBackToPlay;
	}

	public JTextField getJtfGamer1() {
		return jtfGamer1;
	}

	public JTextField getJtfGamer2() {
		return jtfGamer2;
	}

	public JLabel getJlGamer1() {
		return jlGamer1;
	}

	public JLabel getJlGamer2() {
		return jlGamer2;
	}
	
 }