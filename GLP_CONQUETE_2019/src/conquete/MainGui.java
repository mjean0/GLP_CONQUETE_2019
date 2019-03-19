package gui;
/***
 * @author ollaid  
 ***/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import autre.MultiPanel;
import autre.SoloPanel;




public class MainGui extends JFrame{
	 
		  private MainPanel mainPanel ;
		  private PlayPanel playPanel ;
		  private ConquestPanel conquestPanel ;
		  private MultiPlayerPanel multiPlayerPanel ;
		  private StartPanel startPanel ;
		  private MainGui instance = this;
  
    public MainGui (String title ) {
    	
         super(title);	
         init ();
         init_action();
    } 
	  private void init_action() {
		// TODO Auto-generated method stub

			mainPanel.getJbMain(0).addActionListener(new ActionPlay());
			mainPanel.getJbMain(2).addActionListener(new ActionQuit());
			
			playPanel.getJbSolo().addActionListener(new ActionCoquest());
			playPanel.getJbMulti().addActionListener(new ActionMulti());
			playPanel.getJbBackToMain().addActionListener(new ActionBackMain());
			
			conquestPanel.getJbBackToPlay().addActionListener(new ActionBackPlay());
			conquestPanel.getJbNext().addActionListener(new ActionStartConquest());
			
			multiPlayerPanel.getJbBackToPlay().addActionListener(new ActionBackPlay());
			multiPlayerPanel.getJbStart().addActionListener(new ActionStartMulti());
			
			startPanel.getJbBack().addActionListener(new ActionBackMain());
		
	}
	private void init() {
		
	    mainPanel = new MainPanel();
	    playPanel = new PlayPanel();
	    conquestPanel = new ConquestPanel();
	    multiPlayerPanel = new MultiPlayerPanel();
	    startPanel = new StartPanel();
	  
	    setContentPane(mainPanel);
	    this.setBackground(Color.DARK_GRAY);
	    this.pack();
		this.setSize(1440,900);
		this.setResizable(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
	   }
  public class ActionPlay implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			  instance.setContentPane(playPanel);
		}	
	}
  public class ActionQuit implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			  System.exit(0);
		}	
	}
  public class ActionCoquest implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			  instance.setContentPane(conquestPanel);
		}	
	}
  public class ActionMulti implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			 instance.setContentPane(multiPlayerPanel);
		}	
	}
  public class ActionBackMain implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			 instance.setContentPane(mainPanel);
		}	
	}
  public class ActionBackPlay implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			 instance.setContentPane(playPanel);
		}	
	}
  public class ActionStartMulti implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String nameCountry []= {"Drouqua","Ebrait","Zumas" ,"Tharbes" ,"Breotrium"};
			 instance.setContentPane(startPanel);
			 
			 String player1Info = multiPlayerPanel.getJtfGamer1().getText();
			 String player2Info = multiPlayerPanel.getJtfGamer2().getText();
			 
			 startPanel.getPlayer1().setText(player1Info);
			 startPanel.getPlayer2().setText(player2Info);	 
	  }	
	}
  public class ActionStartConquest implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String nameCountry []= {"Drouqua","Ebrait","Zumas" ,"Tharbes" ,"Breotrium"};
			 instance.setContentPane(startPanel);
			 String playerInfo = conquestPanel.getJtfName().getText();
			 
			 startPanel.getPlayer1().setText(playerInfo);
			 startPanel.getPlayer2().setText("IA");	
		 startPanel.getJlCountry1().setText(nameCountry[new Random().nextInt(nameCountry.length)]);
		 startPanel.getJlCountry2().setText(nameCountry[new Random().nextInt(nameCountry.length)]);
	  }
  	}
}
