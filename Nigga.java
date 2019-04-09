package people;

public class Nigga extends Characters {
	private int currentPosition;

	public Nigga(int id, int currentPosition) {
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
