package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class MainGui extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	
	private Dashboard dashboard;
	private InfoPanel infoPanel;
	private MenuSoldier menuSoldier;

	public MainGui() {
		super();
		dashboard = new Dashboard();
		infoPanel = new InfoPanel();
		menuSoldier = new MenuSoldier();

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(BorderLayout.NORTH, dashboard);
		contentPane.add(infoPanel);
		contentPane.add(dashboard);
		contentPane.add(menuSoldier);
		setSize(Simupara.WINDOW_WIDTH, Simupara.WINDOW_HEIGHT);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
