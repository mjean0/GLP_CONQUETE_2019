package people;

public class GirlWhite extends Characters {
	private int currentPosition;

	public GirlWhite(int id, int currentPosition) {
		super(id);
		this.currentPosition = currentPosition;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	
}
