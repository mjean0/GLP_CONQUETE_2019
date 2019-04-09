package super_warrios;

import people.Characters;

public class Mamut extends Characters {
	private int currentPosition;
	private int speed;
	private int power;
	private int weakness;
	public Mamut(int id, int currentPosition, int speed, int power, int weakness) {
		super(id);
		this.currentPosition = currentPosition;
		this.speed = speed;
		this.power = power;
		this.weakness = weakness;
	}
	public int getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getWeakness() {
		return weakness;
	}
	public void setWeakness(int weakness) {
		this.weakness = weakness;
	}
	

}
