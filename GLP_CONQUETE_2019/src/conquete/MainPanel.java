package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainPanel extends JPanel {
	
	   private static final Dimension DIMENSION_BUTTON = new Dimension(100, 30) ;
	   private static final Font MY_FONT = new Font("Arial", Font.BOLD, 15) ;
	   private static final Color COLOR_BUTTON = Color.DARK_GRAY;
	 
	   private JButton [] tabButton ;
	
	   private JLabel background ;
	   private ImageIcon img ;
	   private Font customFont ;
	  
	   private MainPanel instanceMainPanel = this ;

	public MainPanel() {
//		img = new ImageIcon("img/background1.png");
//	    background = new JLabel("",img,JLabel.CENTER);
//	    background.setBounds(0,0,1500,800);
	    
	    setLayout(null);
	    this.setBounds(0,0,1500,800);
	    this.setBackground(Color.darkGray);
	    
	     tabButton = new JButton [3] ;
	     String [] textButton = {"Play","Options","Quit"};
	     for(int i=0;i<tabButton.length;i++) {
	  
	    	 tabButton[i] = new JButton(textButton[i]);
	    	 tabButton[i].setText(textButton[i]);
	    	 tabButton[i].setPreferredSize(DIMENSION_BUTTON);
	    	 tabButton[i].setFont(MY_FONT);
	    	 tabButton[i].setBackground(Color.black);
	    	 tabButton[i].setForeground(Color.WHITE);
	    	 tabButton[i].setFocusPainted(false);
	    	 add(tabButton[i]);

	         }
	        tabButton[0].setBounds(600,320,190,30);
	        tabButton[1].setBounds(600,360,190,30);
	        tabButton[2].setBounds(600,400,190,30);
	        
	        try {
             customFont = Font.createFont(Font.TRUETYPE_FONT, new File("font/PixelGameFont.ttf"));
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
             ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("font/PixelGameFont.ttf")));
	        }catch (Exception e) {
				// TODO: handle exception
			}
	        
	 }
	 public JButton getJbMain (int i) {
		    return tabButton[i] ;
	 }
	
}
