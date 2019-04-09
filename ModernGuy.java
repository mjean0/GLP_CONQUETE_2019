package people;

public class ModernGuy extends Characters {
	private int currentPosition;

	public ModernGuy(int id, int currentPosition) {
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
