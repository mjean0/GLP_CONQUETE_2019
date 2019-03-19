package test;

import java.awt.event.MouseEvent;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;

public interface DraggedStrategy {
	//Arrow
	void moveOnTheMap(Arrow staticArrow,MouseEvent e,Arrow[] arrow);
	void moveFromResourcesToTheMap(Arrow staticArrow,MouseEvent e,Arrow[] arrow);
	void limits(Arrow staticArrow,MouseEvent e);
	//Cannon
	void moveOnTheMap(Cannon staticCannon,MouseEvent e,Cannon[] cannon);
	void moveFromResourcesToTheMap(Cannon staticCannon,MouseEvent e,Cannon[] cannon);
	void limits(Cannon staticCannon,MouseEvent e);
	//Char1
	void moveOnTheMap(Char1 staticChar1,MouseEvent e,Char1[] char1);
	void moveFromResourcesToTheMap(Char1 staticChar1,MouseEvent e,Char1[] char1);
	void limits(Char1 staticChar1,MouseEvent e);
	//Char2
	void moveOnTheMap(Char2 staticChar2,MouseEvent e,Char2[] char2);
	void moveFromResourcesToTheMap(Char2 staticChar2,MouseEvent e,Char2[] char2);
	void limits(Char2 staticChar2,MouseEvent e);
	//Char3
	void moveOnTheMap(Char3 staticChar3,MouseEvent e,Char3[] char3);
	void moveFromResourcesToTheMap(Char3 staticChar3,MouseEvent e,Char3[] char3);
	void limits(Char3 staticChar3,MouseEvent e);
	//Char4
	void moveOnTheMap(Char4 staticChar4,MouseEvent e,Char4[] char4);
	void moveFromResourcesToTheMap(Char4 staticChar4,MouseEvent e,Char4[] char4);
	void limits(Char4 staticChar4,MouseEvent e);
	//Char5
	void moveOnTheMap(Char5 staticChar5,MouseEvent e,Char5[] char5);
	void moveFromResourcesToTheMap(Char5 staticChar5,MouseEvent e,Char5[] char5);
	void limits(Char5 staticChar5,MouseEvent e);
}
