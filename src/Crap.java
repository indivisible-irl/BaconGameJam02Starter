import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;

/**
 * @author 
 *
 */
public class Crap extends Entity
{
	private static final int SCREEN_HEIGHT = 600;
	
	boolean isActive = false;
	Bird parentBird;
	
	public Crap(Image image, Bird bird)
	{
		super(image);
		super.velocity = 0.3f;
		parentBird = bird;
	}
	
	public void update(int delta)
	{
		if(!isActive) return;  //if the poop isnt active, dont do shit!  GET IT
		
		this.position.y += this.velocity * delta;
		if(this.position.y > SCREEN_HEIGHT)
		{
			this.deactivate();
		}
	}
	
	public void draw()
	{
		this.getAnimationFrame().draw(this.getPosition().x, this.getPosition().y);
	}
	
	public void activate()
	{
		isActive = true;
		//Position the sprite at the bottom center of the parent bird sprite
		this.position = new Vector2f(parentBird.getPosition().x + (parentBird.getAnimationFrame().getWidth() / 2),
				parentBird.getPosition().y + parentBird.getAnimationFrame().getHeight());
	}
	
	public void deactivate()
	{
		isActive = false;
	}
	
	public boolean isActive()
	{
		return this.isActive;
	}
}
