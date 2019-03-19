package test;

import java.awt.event.MouseEvent;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;
/**
 * @author BJMEO
 *
 */
public interface PressedStrategy {
	/**
	 * This methods is used to manage all Arrows.
	 * Get any icons index on the map
	 * @param e
	 * @param arrow
	 * @return
	 */
	int getIconIndex(MouseEvent e,Arrow[] arrow);
	/**
	 * This methods is used to manage all Arrows.
	 * Detect any mouse pressed on the Map
	 * @param e
	 * @param arrow
	 * @return void
	 */
	void pressedOnTheMap(Arrow staticArrow,MouseEvent e,Arrow[] arrow);
	/**
	 * This methods is used to manage all Arrows.
	 * Detect any mouse pressed on the RessourcesPanel
	 * @param e
	 * @param arrow
	 * @return void
	 */
	void pressedOnTheRessourcesPanel(Arrow staticArrow,MouseEvent e,Arrow[] arrow);
	/**
	 * This methods is used to manage all Cannons.
	 * Get any icons index on the Map
	 * @param e
	 * @param cannon
	 * @return
	 */
	int getIconIndex(MouseEvent e,Cannon[] cannon);
	/**
	 * This methods is used to manage all Cannons.
	 * Detect any mouse pressed on the Map
	 * @param e
	 * @param cannon
	 * @return void
	 */
	void pressedOnTheMap(Cannon staticCannon,MouseEvent e,Cannon[] cannon);
	/**
	 * This methods is used to manage all Cannons.
	 * Move any object from RessourcesPanel on the Map
	 * @param e
	 * @param arrow
	 * @return void
	 */
	void pressedOnTheRessourcesPanel(Cannon staticCannon,MouseEvent e,Cannon[] cannon);
	
	int getIconIndex(MouseEvent e,Char1[] char1);
	void pressedOnTheMap(Char1 staticChar1,MouseEvent e,Char1[] char1);
	void pressedOnTheRessourcesPanel(Char1 staticChar1,MouseEvent e,Char1[] char1);
	
	int getIconIndex(MouseEvent e,Char2[] char2);
	void pressedOnTheMap(Char2 staticChar2,MouseEvent e,Char2[] char2);
	void pressedOnTheRessourcesPanel(Char2 staticChar2,MouseEvent e,Char2[] char2);
	
	int getIconIndex(MouseEvent e,Char3[] char3);
	void pressedOnTheMap(Char3 staticChar3,MouseEvent e,Char3[] char3);
	void pressedOnTheRessourcesPanel(Char3 staticChar3,MouseEvent e,Char3[] char3);
	
	int getIconIndex(MouseEvent e,Char4[] char4);
	void pressedOnTheMap(Char4 staticChar4,MouseEvent e,Char4[] char4);
	void pressedOnTheRessourcesPanel(Char4 staticChar4,MouseEvent e,Char4[] char4);
	
	int getIconIndex(MouseEvent e,Char5[] char5);
	void pressedOnTheMap(Char5 staticChar5,MouseEvent e,Char5[] char5);
	void pressedOnTheRessourcesPanel(Char5 staticChar5,MouseEvent e,Char5[] char5);
}
