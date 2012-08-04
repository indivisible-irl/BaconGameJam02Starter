/*
 * Reddit BaconGameJam - Aug 2012
 * Team maeT
 * 04/08/2012
 * Score.java
 */
public class Score {
	private int score;
	private double multiplier;
	private int bonus;
	private int time;
	
	/////////////////////////////////////////////////
	
	/**
	 * Returns the current score
	 * @return int
	 */
	public int getScore(){
		return this.score;
	}
	/**
	 * Sets the score
	 * @param num
	 */
	public void setScore(int num){
		this.score = num;
	}
	/**
	 * Gets the current score multiplier
	 * @return float
	 */
	public double getMultiplier(){
		return this.multiplier;
	}
	/**
	 * Set the score multiplier
	 * @param multi
	 */
	public void setMultiplier(double multiplier){
		this.multiplier = multiplier;
	}
	/**
	 * Return the current score bonus
	 * @return int
	 */
	public int getBonus(){
		return this.bonus;
	}
	/**
	 * set the score bonus
	 * @param num
	 */
	public void setBonus(int num){
		this.bonus = num;
	}
	/**
	 * Get the time
	 * @return
	 */
	public int getTime(){
		return this.time;
	}
	/**
	 * Set the time
	 * @param time
	 */
	public void setTime(int time){
		this.time = time;
	}
	
	///////////////////////////////////////////////
	
	public void addBonus(int bonus){
		setScore(getScore() + bonus);
	}
	public void increaseMultiplier(){
		setMultiplier(getMultiplier() + 0.1);
	}
	public void resetMultiplier(){
		setMultiplier(1);
	}
	
}
