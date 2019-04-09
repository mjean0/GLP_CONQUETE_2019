package people;

public class NiggaGirl extends Characters {
	private int currentPosition;

	public NiggaGirl(int id, int currentPosition) {
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
