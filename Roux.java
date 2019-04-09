package people;

public class Roux extends Characters {
	private int currentPosition;
	
	public Roux(int id, int currentPosition) {
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
