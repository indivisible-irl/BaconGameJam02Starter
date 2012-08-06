
public class Health {

	private int health;
	private boolean alive;
	private Impact impacts;
	
	private boolean debug = false;
	
	///////////////////////////
	
	/**
	 * Get health value
	 * @return int
	 */
	public int getHealth(){
		return this.health;
	}
	/**
	 * Set health value
	 * @param int hp
	 */
	public void setHealth(int hp){
		this.health = hp;
	}
	/**
	 * Get boolean for if lives left
	 * @return bool
	 */
	public boolean isAlive(){
		return this.alive;
	}
	/**
	 * set alive boolean
	 * @param bool alive
	 */
	public void setAlive(boolean alive){
		this.alive = alive;
	}
	public void setImpacts(Impact impact){
		this.impacts = impact;
	}
	///////////////////////////
	
	/**
	 * Increase health by 1. Cap at 5
	 */
	public void increaseHealth(){
		if (!(getHealth() == 5 || getHealth() == 0)){
			setHealth(getHealth() + 1);
		}
	}
	/**
	 * Increase health by passed int. Cap at 5.
	 * @param int hp
	 */
	public void increaseHealth(int hp){
		setHealth(getHealth() + hp);
		if (getHealth() > 5){
			setHealth(5);
		}
	}
	/**
	 * Decrease health by 1
	 */
	public void decreaseHealth(){
		this.impacts.trigger();
		if (getHealth() == 1){
			setAlive(false);
			if (debug){
				System.out.println("Health: You are dead, sorry. Alive: " +isAlive());
			}
		} else {
			setHealth(getHealth() - 1);
			if (debug){
				System.out.println("Health: Lost an egg. Current hp: " +getHealth());
			}
		}
	}
	
	///////////////////////////
	
	/**
	 * Default constructor
	 */
	public Health(Impact impact){
		setImpacts(impact);
		setHealth(3);
		setAlive(true);
	}
	public Health(Impact impact, int hp){
		setImpacts(impact);
		setHealth(hp);
		if (!(hp == 0)){
			setAlive(true);
		} else {
			setAlive(false);
		}
	}
}
