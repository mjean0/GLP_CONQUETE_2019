package conquete;

/**
 * @author macbook
 *
 */
public class Players{
//Attributes
	private String playerName;
	private int lifePoint;
	private Country playerCountry;
	private Players ennemy;
	private Rounds round;
	public Players() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Players(String playerName, int lifePoint, Country playerCountry, Players ennemy, Rounds round) {
		super();
		this.playerName = playerName;
		this.lifePoint = lifePoint;
		this.playerCountry = playerCountry;
		this.ennemy = ennemy; 
		this.round = round;
	}
	
}
