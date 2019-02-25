package data;

import gui.elements.ItemsPanel;

/**
 * @author macbook
 *
 */
public class Players{
//Attributes
	private String playerName;
	private int lifePoint;
	private String playerCountry;
	private Players ennemy;
	//private Rounds round;
	private boolean play;
	private ItemsPanel items;
	private int id;
	
	public Players(String playerName, int lifePoint,Players ennemy, String playerCountry,boolean play,ItemsPanel items) {
		this.playerName = playerName;
		this.lifePoint = lifePoint;
		this.playerCountry = playerCountry;
		this.ennemy = ennemy; 
		//this.round = round;
		this.play = play;
		this.items = items;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getLifePoint() {
		return lifePoint;
	}
	public void setLifePoint(int lifePoint) {
		this.lifePoint = lifePoint;
	}
	public String getPlayerCountry() {
		return playerCountry;
	}
	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
		
	}
	public Players getEnnemy() {
		return ennemy;
	}
	public void setEnnemy(Players ennemy) {
		this.ennemy = ennemy;
	}
	public boolean isPlay() {
		return play;
	}
	public void setPlay(boolean play) {
		this.play = play;
	}
	public ItemsPanel getItems() {
		return items;
	}
	public void setItems(ItemsPanel items) {
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean getPlay() {
		return play;
	}
	
	
}
