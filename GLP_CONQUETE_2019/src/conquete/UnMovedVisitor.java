package test;

import java.awt.event.MouseEvent;

import gui.elements.Arrow;
import gui.elements.Cannon;
import gui.elements.Char1;
import gui.elements.Char2;
import gui.elements.Char3;
import gui.elements.Char4;
import gui.elements.Char5;



public class UnMovedVisitor implements ItemsVisitors<Void> {

	UnMovedStrategy unMovedStrategy;
	private Variables variables;
	
	public UnMovedVisitor(Variables variables){
		this.variables = variables;
		unMovedStrategy = new ItemsUnMovedStrategy(this.variables);
	}
	
	@Override
	public Void visit(Arrow staticArrow, MouseEvent e, Arrow[] arrow) {
		unMovedStrategy.unMoved(staticArrow);
		return null;
	}

	@Override
	public Void visit(Cannon staticCannon, MouseEvent e, Cannon[] cannon) {
		unMovedStrategy.unMoved(staticCannon);
		return null;
	}
	
	@Override
	public Void visit(Char1 staticChar1, MouseEvent e, Char1[] char1) {
		unMovedStrategy.unMoved(staticChar1);
		return null;
	}
	
	@Override
	public Void visit(Char2 staticChar2, MouseEvent e, Char2[] char2) {
		unMovedStrategy.unMoved(staticChar2);
		return null;
	}
	
	@Override
	public Void visit(Char3 staticChar3, MouseEvent e, Char3[] char3) {
		unMovedStrategy.unMoved(staticChar3);
		return null;
	}
	
	@Override
	public Void visit(Char4 staticChar4, MouseEvent e, Char4[] char4) {
		unMovedStrategy.unMoved(staticChar4);
		return null;
	}
	
	@Override
	public Void visit(Char5 staticChar5, MouseEvent e, Char5[] char5) {
		unMovedStrategy.unMoved(staticChar5);
		return null;
	}
}
