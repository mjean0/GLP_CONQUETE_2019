package process;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.SwingUtilities;

import data.Resources;
import gui.elements.Constant;
import gui.elements.IconsDrawer;
import gui.elements.Map;
import test.AcceptStrategy;
import test.DraggedVisitor;
import test.ItemsAcceptStrategy;
import test.PressedVisitor;
import test.UnMovedVisitor;
import test.Variables;

public class ActionsEvents implements MouseMotionListener, MouseListener, MouseWheelListener {
	
	private Resources resources;
	private IconsDrawer iconsDrawer;
	private Map map;
	
	//Visitors
	private PressedVisitor pressedVisitor;
	private DraggedVisitor draggedVisitor;
	private UnMovedVisitor unMovedVisitor;
	
	//Variables
	private Variables variables;
	
	//Strategy
	private AcceptStrategy acceptStrategy = new ItemsAcceptStrategy();
	
	public ActionsEvents(Resources resources,IconsDrawer iconsDrawer,Variables variables,Map map){
		this.resources = resources;
		this.iconsDrawer = iconsDrawer;
		this.map = map;
		this.variables = variables;
		
		this.pressedVisitor = new PressedVisitor(this.variables);
		this.draggedVisitor = new DraggedVisitor(this.variables,this.iconsDrawer,this.map);
		this.unMovedVisitor = new UnMovedVisitor(this.variables);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Positions : ");
		System.out.println(e.getX());
		System.out.println(e.getY());
		if(SwingUtilities.isLeftMouseButton(e)){
			map.zoomIn();
			System.out.println(Constant.MAP_ACTUAL_WIDTH);
			System.out.println(Constant.MAP_ACTUAL_HEIGH);
		}else if(SwingUtilities.isRightMouseButton(e)){
			map.zoomOut();
			System.out.println(Constant.MAP_ACTUAL_WIDTH);
			System.out.println(Constant.MAP_ACTUAL_HEIGH);
		}	
	}
		
	@Override
	public void mousePressed(MouseEvent e) {
		acceptStrategy.accept(pressedVisitor,e,resources.getStaticArrow(),resources.getArrow());
		acceptStrategy.accept(pressedVisitor,e,resources.getStaticCannon(),resources.getCannon());
		acceptStrategy.accept(pressedVisitor,e,resources.getStaticChar1(),resources.getChar1());
		acceptStrategy.accept(pressedVisitor,e,resources.getStaticChar2(),resources.getChar2());
		acceptStrategy.accept(pressedVisitor,e,resources.getStaticChar3(),resources.getChar3());
		acceptStrategy.accept(pressedVisitor,e,resources.getStaticChar4(),resources.getChar4());
		acceptStrategy.accept(pressedVisitor,e,resources.getStaticChar5(),resources.getChar5());

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		acceptStrategy.accept(unMovedVisitor,e,resources.getStaticArrow(),resources.getArrow());
		acceptStrategy.accept(unMovedVisitor,e,resources.getStaticCannon(),resources.getCannon());
		acceptStrategy.accept(unMovedVisitor,e,resources.getStaticChar1(),resources.getChar1());
		acceptStrategy.accept(unMovedVisitor,e,resources.getStaticChar2(),resources.getChar2());
		acceptStrategy.accept(unMovedVisitor,e,resources.getStaticChar3(),resources.getChar3());
		acceptStrategy.accept(unMovedVisitor,e,resources.getStaticChar4(),resources.getChar4());	
		acceptStrategy.accept(unMovedVisitor,e,resources.getStaticChar5(),resources.getChar5());
		map.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		acceptStrategy.accept(draggedVisitor,e,resources.getStaticArrow(),resources.getArrow());
		acceptStrategy.accept(draggedVisitor,e,resources.getStaticCannon(),resources.getCannon());
		acceptStrategy.accept(draggedVisitor,e,resources.getStaticChar1(),resources.getChar1());
		acceptStrategy.accept(draggedVisitor,e,resources.getStaticChar2(),resources.getChar2());
		acceptStrategy.accept(draggedVisitor,e,resources.getStaticChar3(),resources.getChar3());
		acceptStrategy.accept(draggedVisitor,e,resources.getStaticChar4(),resources.getChar4());
		acceptStrategy.accept(draggedVisitor,e,resources.getStaticChar5(),resources.getChar5());
		map.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e){
//		if(e.getWheelRotation()>0){
//			map.zoomIn();
//		}else{
//			map.zoomOut();
//		}		
	}
}
