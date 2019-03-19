package gui.elements;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import gui.elements.Constant;
import gui.elements.Map;
import gui.elements.homepage.*;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MainFrame instance = this;
	private int frameWidth;
	private int frameHeight;
	 
	private Boolean acceptWater = false;
	private Boolean acceptEarth = true;
	private Boolean acceptAir = false;
	private Boolean acceptForest = false;
		
	private Map mapEarth;
	private Map mapWater;
	private Map mapAir;
	private Map mapForest;
	private JScrollPane scroll;
	private JPanel rootPane;
	
	//InfoPanel
	private InfoPanel infoPanel; 
	//private DashBord dashBord;
	private ResourcesPanel ressourcesPanel1;
	//private ResourcesPanel ressourcesPanel2;
	//HomePanels management
	private MainPanel mainPanel ; 
	private PlayPanel playPanel ;
	private ConquestPanel conquestPanel;
	private MultiPlayersPanel multiPlayersPanel ;
	private StartPanel startPanel;
		
	public MainFrame(String title){
		
		super(title);
		
		this.setSize(1500, 800);
		
		frameWidth = this.getWidth();
		frameHeight = this.getHeight();
		
		mapEarth = new Map(frameWidth,frameHeight,Constant.MAP_BATTLE_AIR_COLOR,this);
		mapWater = new Map(frameWidth,frameHeight,Constant.MAP_BATTLE_WATER_COLOR,this);
		mapAir = new Map(frameWidth,frameHeight,Constant.MAP_BATTLE_AIR_COLOR,this);
		mapForest = new Map(frameWidth,frameHeight,Constant.MAP_BATTLE_FOREST_COLOR,this);
		
		rootPane = new JPanel();
		infoPanel = new InfoPanel(); 
		ressourcesPanel1 = new ResourcesPanel(rootPane,mapEarth,0,700);
		//ressourcesPanel2 = new ResourcesPanel(rootPane,mapEarth,800,700);
		//HomePanels management
	    mainPanel = new MainPanel();
	    playPanel = new PlayPanel();
	    conquestPanel = new ConquestPanel();
	    multiPlayersPanel = new MultiPlayersPanel();
	    startPanel = new StartPanel();		
		initLayout();
		addScroll();
		add();
		initActions();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void initLayout(){ 
		this.setLayout(null);
		this.setBackground(Color.black);
		ressourcesPanel1.setBounds(0, 700, 1400, 100);
		//ressourcesPanel2.setBounds(800, 700, 750, 100);
		rootPane.setLayout(null);
		rootPane.setBounds(0, 0, 1500, 800);
	}
	public void add(){
		rootPane.add(infoPanel);
		rootPane.add(ressourcesPanel1);
		//rootPane.add(ressourcesPanel2);
		this.getContentPane().add(mainPanel);
	}
	public void addScroll(){
		if(acceptWater)
			scroll = new JScrollPane(mapWater);
		if(acceptEarth)
			scroll = new JScrollPane(mapEarth);
		if(acceptAir)
			scroll = new JScrollPane(mapAir);
		if(acceptForest)
			scroll = new JScrollPane(mapForest);
		scroll.setBounds(0, 130, 1500, 570);
		rootPane.add(scroll);
	}
	
	public void initActions(){
		mainPanel.getJbMain(0).addActionListener(new ActionPlay());
		mainPanel.getJbMain(2).addActionListener(new ActionQuit());
		
		playPanel.getJbSolo().addActionListener(new ActionCoquest());
		playPanel.getJbMulti().addActionListener(new ActionMulti());
		playPanel.getJbBackToMain().addActionListener(new ActionBackMain());
		
		conquestPanel.getJbBackToPlay().addActionListener(new ActionBackPlay());
		conquestPanel.getJbNext().addActionListener(new ActionStartConquest());
		
		multiPlayersPanel.getJbBackToPlay().addActionListener(new ActionBackPlay());
		multiPlayersPanel.getJbStart().addActionListener(new ActionStartMulti());
		
		startPanel.getJbBack().addActionListener(new ActionBackMain());
		startPanel.getJbStart().addActionListener(new ActionStart());
	}
	
	//inner class
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
			 instance.setContentPane(multiPlayersPanel);
		}	
    }
    public class ActionBackPlay implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			 instance.setContentPane(playPanel);
		}	
    }
    public class ActionBackMain implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			 instance.setContentPane(mainPanel);
		}	
    }
    public class ActionStartMulti implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			 instance.setContentPane(startPanel);
			 
			 String player1Info = multiPlayersPanel.getJtfGamer1().getText();
			 String player2Info = multiPlayersPanel.getJtfGamer2().getText();
			 
			 startPanel.getPlayer1().setText(player1Info);
			 startPanel.getPlayer2().setText(player2Info);
			 
	    }	
    }
  	public class ActionStartConquest implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			 instance.setContentPane(startPanel);
			 String playerInfo = conquestPanel.getJtfName().getText();
			 
			 startPanel.getPlayer1().setText(playerInfo);
			 startPanel.getPlayer2().setText("IA");
			 
		}
  	}
  	public class ActionStart implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			instance.setContentPane(rootPane);
			 
		}
  	}
}

