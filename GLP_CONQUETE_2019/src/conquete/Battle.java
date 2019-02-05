package conquete;

public class Battle extends Country {
		private Country country;
		private Space space;
		private String battleResult;

	public Battle(Country country , Space space , String battleResult){
		super();
		this.battleResult=battleResult;
	}
}