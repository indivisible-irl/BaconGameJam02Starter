import java.util.Date;
import java.util.Random;
import org.newdawn.slick.SlickException;

public class EntityQueueHandler {
	
	private EntityManager entityManger;
	private Random rGen = new Random();
	private int random;
	
	private long delay;
	private long lastUpdate;
	
	private boolean debug = true;
	
	/////////////////////////////////////////////////
	
	public EntityManager getEntityManager(){
		return this.entityManger;
	}
	public void setEntityManager(EntityManager em){
		this.entityManger = em;
	}
	public int getRandom(){
		return this.random;
	}
	public void setRandom(){
		this.random = rGen.nextInt(GLOBAL.RANDOM_MAX);
	}
	public long getDelay(){
		return this.delay;
	}
	public void setDelay(long wait){
		this.delay = wait;
	}
	private long getLastUpdate(){
		return this.lastUpdate;
	}
	private void setLastUpdate(long update){
		this.lastUpdate = update;
	}
	
	/////////////////////////////////////////////////
	
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
			} else {
				// do nothing
			}
			setLastUpdate(new Date().getTime());
		}
	}
	public void decreaseDelay(){
		setDelay(getDelay() - GLOBAL.ENTITY_DECREMENTS);
	}
	
	////////////////////////////////////////////////
	
	public EntityQueueHandler(EntityManager em){
		setEntityManager(em);
		setLastUpdate(new Date().getTime());
		setDelay(GLOBAL.ENTITY_DELAY);
	}
}
