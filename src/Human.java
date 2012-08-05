import java.util.Random;

import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;


public class Human extends Entity
{
	protected static final int VARIANCE = 42;
	protected static final int LOWER_RANDOM_BOUND = 390;
	
	//private Image deadimage;
	
	
	public Human(Image[] images, Image dead)
	{
		 super(images);
		 //this.deadimage = dead;
		 this.setPosition(new Vector2f(500, 420));
		 this.setVelocity(0.15f);
		 this.boundingShape = new Rectangle(this.getPosition().x, 
					this.getPosition().y, 
					this.getAnimationFrame().getWidth(),
					this.getAnimationFrame().getHeight());
		 this.colidable = true;
		 
	}
	
	/**
	 * Returns a Human object placed (somewhat) randomly on the sidewalk from the background
	 * and 100 pixels off the screen to the right
	 * @return
	 * @throws SlickException
	 */
	public static Human getRandomlyPlacedHuman() throws SlickException
	{
		Image[] dude = IMAGES.getNewDude();
		Random rand = new Random();
		int randomYValue = rand.nextInt(VARIANCE) + LOWER_RANDOM_BOUND;
		Human returnHuman = new Human(dude, IMAGES.DUDE_DEAD);
		returnHuman.position = new Vector2f(GLOBAL.SCREEN_WIDTH + 100, randomYValue);		
		return returnHuman;
	}
	
	private void updateBoundingRect()
	{
		boundingShape.setX(this.position.x);
		boundingShape.setY(this.position.y);
	}

	/**
	 * @return Get the Name
	 */
	public String getName()
	{
		return "Human";
	}
	
	public void update(Input input, int delta)
	{
		this.getPosition().x -=  this.getVelocity() * delta;
		this.updateBoundingRect();	
	}
	
	public void handleCollision(Entity entity)
	{
		Image[] deadimages = {IMAGES.makeImage(GLOBAL.DUDE_DEAD, true, GLOBAL.DUDE_SCALE)};
		this.setAnimation(deadimages);
		this.colidable = false;
		this.getAnimation().stop();
		this.setVelocity(GLOBAL.SCROLL_SPEED);
		this.getPosition().y += 50;
	}
	
	public void draw()
	{
		this.getAnimation().draw(this.getPosition().x, this.getPosition().y);
	}
	
}
