import java.util.Date;
import java.util.Random;
import org.newdawn.slick.SlickException;

public class EntityQueueHandler {
	
	private EntityManager entityManger;
	private Random rGen = new Random();
	private int random;
	
	private long delay;
	private long lastUpdate;
	
	private boolean debug = false;
	
	/////////////////////////////////////////////////
	
	/**
	 * get the assigned EntityManager
	 * @return
	 */
	public EntityManager getEntityManager(){
		return this.entityManger;
	}
	/**
	 * set the EntityManager
	 * @param em
	 */
	public void setEntityManager(EntityManager em){
		this.entityManger = em;
	}
	/**
	 * returns the current randomly generated number
	 * @return
	 */
	public int getRandom(){
		return this.random;
	}
	/**
	 * set the current random number
	 */
	public void setRandom(){
		this.random = rGen.nextInt(GLOBAL.RANDOM_MAX);
	}
	/**
	 * get the delay between attempted seeding
	 * @return
	 */
	public long getDelay(){
		return this.delay;
	}
	/**
	 * set the delay frequency
	 * @param wait
	 */
	public void setDelay(long wait){
		this.delay = wait;
	}
	/**
	 * return the last time a seed was attempted
	 * @return
	 */
	private long getLastUpdate(){
		return this.lastUpdate;
	}
	/**
	 * set the lastUpdate when a seed is performed
	 * @param update
	 */
	private void setLastUpdate(long update){
		this.lastUpdate = update;
	}
	
	/////////////////////////////////////////////////
	
	/**
	 * the main method to call to get the Queue to handler to do its magic
	 */
	public void update(){
		if (new Date().getTime() - getLastUpdate() > getDelay())
		{
			if (debug){
				System.out.println("Possible queue seed");
			}
			setRandom();
			if( getRandom() < GLOBAL.HUMAN_FREQUENCY ) {
				if (debug){
					System.out.println("Adding a dude.");
				}
				try {
					getEntityManager().addEntity(Human.getRandomlyPlacedHuman());
				} catch (SlickException e) {
					e.printStackTrace();
				}
			} else if ( getRandom() < GLOBAL.CAT_FREQUENCY) {
				if (debug){
					System.out.println("I would have placed a cat. I like cats.");
				}
			} else if ( getRandom() < GLOBAL.BIRD_FREQUENCY) {
				if (debug){
					System.out.println("Another evil birdy");
				}
				try {
					getEntityManager().addEntity(Enemy.getRandomlyPlacedEnemy(getEntityManager().getBird()));
				} catch (SlickException e) {
					e.printStackTrace();
				}
			} else if ( getRandom() < GLOBAL.CAR_FREQUENCY) {
				if (debug){
					System.out.println("Vroom VROOM!");
				}
				try {
					getEntityManager().addEntity(Car.getRandomlyPlacedCar());
				} catch (SlickException e) {
					e.printStackTrace();
				}
			} else if ( getRandom() < GLOBAL.TREE_FREQUENCY) {
				if (debug){
					System.out.println("TREE!!");
				}
				try {
					getEntityManager().addEntity(Tree.getRandomlyPlacedTree());
				} catch (SlickException e) {
					e.printStackTrace();
				}
			} else {
				// do nothing
			}
			setLastUpdate(new Date().getTime());
		}
	}
	/**
	 * decrease the delay interval between seed attempts
	 */
	public void decreaseDelay(){
		setDelay(getDelay() - GLOBAL.ENTITY_INCREMENT);
	}
	public void increaseDelay(){
		setDelay(getDelay() + GLOBAL.ENTITY_INCREMENT);
	}
	
	////////////////////////////////////////////////
	
	/**
	 * Default constructor, needs to be passed the EntityManager.
	 * @param em
	 */
	public EntityQueueHandler(EntityManager em){
		setEntityManager(em);
		setLastUpdate(new Date().getTime());
		setDelay(GLOBAL.ENTITY_DELAY);
	}
}
