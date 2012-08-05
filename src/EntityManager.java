import java.util.ArrayList;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class EntityManager {
	
	private Bird bird;
	private Health birdHealth;
	private ArrayList<Entity> entities;
	private boolean exit;
	
	public EntityManager(Bird b) throws SlickException
	{
		entities = new ArrayList<Entity>();		
		bird = b;
		birdHealth = new Health();
	}
	public EntityManager(Bird b, Health bHealth) throws SlickException
	{
		entities = new ArrayList<Entity>();		
		bird = b;
		birdHealth = bHealth;
	}
	
	/**
	 * Appends a new entity to the list
	 * @param Entity
	 */
	public void addEntity(Entity entity)
	{
		entities.add(entity);
	}
	
	/**
	 * Removes an entity from the list
	 * @param Entity
	 */
	public void removeEntity(Entity entity)
	{
		entities.remove(entity);
	}
	
	/**
	 * @return the ArrayList
	 */
	public ArrayList<Entity> getEntityList()
	{
		return entities;
	}
	
	/**
	 * @return the Bird
	 */
	public Bird getBird()
	{
		return bird;
	}
	
	/**
	 * @return the Bird's health
	 */
	public Health getBirdHealth(){
		return birdHealth;
	}
	/**
	 * Updates all entities
	 * returns an exit boolean (true = quit)
	 * @param input
	 * @param delta
	 * @return bool - exit
	 */
	public boolean update(Input input, int delta)
	{
		this.exit = CollisionManager.checkAndHandleCollisions(bird, entities, birdHealth);
		
		for(int i = 0; i < this.entities.size(); i++)
		{
			entities.get(i).update(input, delta);
			if(entities.get(i).position.x < -(entities.get(i).getAnimationFrame().getWidth()) && this.entities.size() >= 1) entities.remove(i);
		}
		bird.update(input, delta);
		if (this.exit){
			System.out.println("You're dead! You shouldn't be playing!!!");
		}
		return this.exit;
	}
	
	/**
	 * Draws all entities
	 */
	public void draw()
	{
		for(Entity e : entities){
			e.draw();
		}
		
		bird.draw();
	}
}
