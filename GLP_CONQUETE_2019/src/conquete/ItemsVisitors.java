package test;

import java.awt.event.MouseEvent;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;

public interface ItemsVisitors<T> {
	
	T visit(Arrow staticArrow,MouseEvent e,Arrow[] arrow);
	T visit(Cannon staticCannon,MouseEvent e,Cannon[] cannon);
	T visit(Char1 staticChar1,MouseEvent e, Char1[] char1);
	T visit(Char2 staticChar2,MouseEvent e, Char2[] char2);
	T visit(Char3 staticChar3,MouseEvent e, Char3[] char3);
	T visit(Char4 staticChar4,MouseEvent e, Char4[] char4);
	T visit(Char5 staticChar5,MouseEvent e, Char5[] char5);

}
