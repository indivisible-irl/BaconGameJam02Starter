import java.util.ArrayList;


public class CollisionManager
{	
	public static boolean checkAndHandleCollisions(Bird bird, ArrayList<Entity> entities, Health birdHealth)
	{
		Boolean exit = false;
		for (Entity entity : entities)
		{
			if(entity.colidable)
			{
				//Bird poops on shit
				if(entity.boundingShape.intersects(bird.getCrap().getBoundingShape()) && bird.getCrap().isActive)
				{
					entity.handleCollision(entity);
					bird.getCrap().handleCollision(entity);
				}
				//Bird collision with enemies
				if(entity.boundingShape.intersects(bird.boundingShape))
				{
					System.out.println("Collision detected between the bird and " + entity.getName());
					birdHealth.decreaseHealth();
					entity.handleCollision(bird);
					// if health = 0 exit game.
					exit = !(birdHealth.isAlive());
				}
			}
		}
		return exit;
	}
}
