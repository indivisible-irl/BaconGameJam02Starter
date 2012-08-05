/*
 * Reddit BaconGameJam - Aug 2012
 * Team maeT
 * 04/08/2012
 * Score.java
 */

import java.util.Date;
import java.text.DecimalFormat;

import org.newdawn.slick.Font;
import org.newdawn.slick.SpriteSheetFont;

public class Score {
	private static DecimalFormat format = new DecimalFormat("#");
	private static long START = new Date().getTime();
	
	private double score;
	private double multiplier;
	private int bonus;
	private long time;
	private long lastTime;
	private SpriteSheetFont fontimage;
	private Font font;
	
	/////////////////////////////////////////////////
	
	/**
	 * Returns the current score
	 * @return int
	 */
	public double getScore(){
		return this.score;
	}
	/**
	 * Sets the score
	 * @param num
	 */
	public void setScore(double num){
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
	public long getTime(){
		return this.time;
	}
	/**
	 * Set the time
	 * @param time
	 */
	public void setTime(){
		this.time = new Date().getTime();
	}
	/**
	 * Return the last time the multiplier was updated
	 * @return
	 */
	public long getLastTime(){
		return this.lastTime;
	}
	/**
	 * Set the most recent multiplier update time
	 * @param time
	 */
	public void setLastTime(long time){
		this.lastTime = time;
	}
	
	///////////////////////////////////////////////
	
	/**
	 * Add a bonus to the score.
	 * @param bonus
	 */
	public void addBonus(int bonus){
		setScore(getScore() + bonus);
	}
	/**
	 * Increase the score multiplier by 0.2
	 */
	public void increaseMultiplier(){
		setMultiplier(getMultiplier() + GLOBAL.MULTIPLIER_MULTIPLIER);
	}
	/**
	 * Reset the multiplier to it's base value.
	 * For use when an object it hit or such.
	 */
	public void resetMultiplier(){
		setMultiplier(1);
	}
	public String getScorePrintable(){
		return format.format(getScore());
	}
	/**
	 * Work out how many milliseconds the game as been running
	 * @return long
	 */
	public long calcRunTime(){
		return getTime() - START;
	}
	/**
	 * Update the score multiplier if enough time has passed since last time
	 */
	public void updateMultiplier(){
		setTime();
		if( (getTime() - START) - getLastTime() > GLOBAL.DIFFICULTY_INCREASE_PERIOD){
			increaseMultiplier();
		}
	}
	/**
	 * Main score update method to be called from the game.
	 */
	public void update(){
		updateMultiplier();
		setScore(getScore() + (GLOBAL.BASE_SCORE * getMultiplier()));
	}
	
	public void draw(){
	}
	
	//////////////////////////////////////////////
	
	/**
	 * Main constructor
	 */
	public Score(){
		
		setScore(0);
		setMultiplier(1.0);
		setBonus(0);
	}
	public Score(long score){
		setScore(score);
		setMultiplier(1.0);
		setBonus(0);
	}
}
