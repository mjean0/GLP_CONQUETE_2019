package test;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;

public interface UnMovedStrategy {

	//Arrow
	void unMoved(Arrow staticArrow);
	
	//Cannon
	void unMoved(Cannon staticCannon);
	
	//Char1
	void unMoved(Char1 staticChar1);
	
	//Char2
	void unMoved(Char2 staticChar2);
	
	//Char3
	void unMoved(Char3 staticChar3);
	
	//Char4
	void unMoved(Char4 staticChar4);
	
	//Char5
	void unMoved(Char5 staticChar5);
}
