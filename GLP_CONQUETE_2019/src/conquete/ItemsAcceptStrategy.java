package test;

import java.awt.event.MouseEvent;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;

public class ItemsAcceptStrategy implements AcceptStrategy {
	
	@Override
	public <T> T accept(ItemsVisitors<T> visitor, MouseEvent e, Arrow staticArrow, Arrow[] arrow) {
		return visitor.visit(staticArrow,e,arrow);
	}

	@Override
	public <T> T accept(ItemsVisitors<T> visitor, MouseEvent e, Cannon staticCannon, Cannon[] cannon) {
		return visitor.visit(staticCannon,e,cannon);
	}
	
	@Override
	public <T> T accept(ItemsVisitors<T> visitor, MouseEvent e, Char1 staticChar1, Char1[] char1) {
		return visitor.visit(staticChar1,e,char1);
	}
	
	@Override
	public <T> T accept(ItemsVisitors<T> visitor, MouseEvent e, Char2 staticChar1, Char2[] char2) {
		return visitor.visit(staticChar2,e,char2);
	}
	
	@Override
	public <T> T accept(ItemsVisitors<T> visitor, MouseEvent e, Char3 staticChar3, Char3[] char3) {
		return visitor.visit(staticChar3,e,char3);
	}
	
	@Override
	public <T> T accept(ItemsVisitors<T> visitor, MouseEvent e, Char4 staticChar1, Char4[] char4) {
		return visitor.visit(staticChar4,e,char4);
	}
	
	@Override
	public <T> T accept(ItemsVisitors<T> visitor, MouseEvent e, Char5 staticChar5, Char5[] char5) {
		return visitor.visit(staticChar5,e,char5);
	}
}
