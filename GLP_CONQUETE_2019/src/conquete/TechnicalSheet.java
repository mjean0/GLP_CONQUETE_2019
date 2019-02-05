package conquete;
public class TechnicalSheet {
	private String playerName;
	private int lifePoints;
	private int warriosAliveNumber;
	private int warriosDeathNumber;
	private int nbGold;
	private int nbWood;
	private int nbDiamond;
	private int nbIron;
	private int nbPlants;
	public TechnicalSheet(String playerName , int lifePoints , int warriosAliveNumber , int warriosDeathNumber , int nbGold , int nbWood , int nbDiamond , int nbIron , int nbPlants ){
		this.playerName = playerName;
		this.lifePoints = lifePoints;
		this.warriosAliveNumber=warriosAliveNumber;
		this.warriosDeathNumber= warriosDeathNumber;
		this.nbGold=nbGold;
		this.nbWood=nbWood;
		this.nbDiamond=nbDiamond;
		this.nbIron=nbIron;
		this.nbPlants=nbPlants;
	}
}
