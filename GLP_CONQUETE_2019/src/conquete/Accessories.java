package gui.elements;

import javax.swing.JLabel;

public abstract class Accessories{
	
	private String name;
	private String filePath;
	private int quantity;
	private int id;
	private int posX;
	private int posY;
	
	public Accessories(String name, int quantity,int id,String filePath){
		this.name = name;
		this.filePath = filePath;
		this.quantity = quantity;
		this.id = id;
	}

	public int getID() {
		return id;
	}
	
	public String getName(){
		return name; 
	}
	
	public String getFilePath(){
		return filePath; 
	}
	
	public int getPosX() {
		return posX;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public int getPosY() {
		return posY;
	}
	
	
	public String setFilePath(){
		this.filePath= filePath; 
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
