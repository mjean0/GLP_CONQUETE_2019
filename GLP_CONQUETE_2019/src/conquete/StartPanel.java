package gui;
/***
 * 
 * @author ollaid
 */

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel{
	
	   private JLabel jlPlayer1 ,jlPlayer2 ,jlVS;
	   private JButton jbBack , jbStart;
	   
	   private JLabel background ;
	   private ImageIcon img ;
	   
	public StartPanel() {
		super();
//		img = new ImageIcon("img/background1.png");
//	    background = new JLabel("",img,JLabel.CENTER);
//	    this.add(background);
//	    background.setBounds(0,0,1440,900);
	    
	    setLayout(null);
	    this.setBounds(0,0,1440,900);
	    setBackground(Color.DARK_GRAY);
	    
	    jlPlayer1= new JLabel();
	    jlPlayer2= new JLabel();
	    jlVS = new JLabel("VS");
	    jbBack = new JButton("Back");
	    jbStart = new JButton("Start");
	    
	    jlPlayer1.setForeground(Color.WHITE);
	    jlPlayer1.setFont(new Font("arial", Font.ITALIC, 41));
	    jlPlayer2.setForeground(Color.white);
	    jlPlayer2.setFont(new Font("arial", Font.ITALIC, 41));
	    jlVS.setForeground(Color.WHITE);
	   
	    
	  
	    jlPlayer1.setBounds(460, 120, 500, 100);
	    jlPlayer2.setBounds(660, 220, 500, 100);
	    jlVS.setBounds(600, 180, 500, 100);
	  	jbBack.setBounds(400,400,190,30);
	  	jbStart.setBounds(800,400,190,30);
	  	
	  	add(jlPlayer1);
		add(jlPlayer2);
		add(jlVS);
		add(jbBack);
		add(jbStart);
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
}
