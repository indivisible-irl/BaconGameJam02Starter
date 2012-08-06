import java.util.ArrayList;


public class CollisionManager
{	
	private static boolean debug = false;
	
	/**
	 * Collision handling and detection in here.
	 * Separate types of collision: bird-entity, crap-entity.
	 * @param bird
	 * @param entities
	 * @param birdHealth
	 * @param score
	 * @return bool exitGame - true if collision drops health to 0.
	 */
	public static CollisionReturn checkAndHandleCollisions(EntityManager eManager, Bird bird, ArrayList<Entity> entities, Health birdHealth, Score score)
	{
		CollisionReturn cReturn = new CollisionReturn();
		for (Entity entity : entities)
		{
			if(entity.colidable)
			{
				//Bird poops on shit
				if(entity.boundingShape.intersects(bird.getCrap().getBoundingShape()) && bird.getCrap().isActive)
				{
					entity.handleCollision(entity);
					bird.getCrap().handleCollision(entity);
					score.addBonus(entity.getScore());
					cReturn.setEntity(entity);
				}
				//Bird collision with enemies
				if(entity.boundingShape.intersects(bird.boundingShape))
				{
					if (entity.boundingShape.getX() > GLOBAL.BUFFER_RIGHT + 32){
						if (debug){
							System.out.println("Avoided a collision. WHEW!");
						}
						continue;
					}
					if (debug){
						System.out.println("Collision detected between the bird and " + entity.getName());
					}
					birdHealth.decreaseHealth();
					entity.handleCollision(bird);
					// if health = 0 exit game.
					cReturn.setExit(!(birdHealth.isAlive()));
					if (debug){
						System.out.println("Collision: Exit? " +cReturn.getExit());
					}
				}
			}
		}
		return cReturn;
	}
}
