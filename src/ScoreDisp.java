import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;

/**
 * @author 
 *
 */
@SuppressWarnings("unused")
public class ScoreDisp extends Entity
{
	public static final String NAME = "Score";
	
	protected boolean isActive = false;
	protected Entity parentEntity;
	
	public ScoreDisp(Image image, Entity parent)
	{
		super(image);
		super.velocity = 0.2f;
		parentEntity = parent;
	}
	
	/**
	 * @return Get the Name
	 */
	public String getName()
	{
		return NAME;
	}
	
	public void update(int delta)
	{
		if(!isActive) return;  //if the poop isn't active, don't do shit!  GET IT?
		
		this.position.y -= this.velocity * delta;
		if(this.position.y < -20)
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
		this.position = new Vector2f(parentEntity.getPosition().x + (parentEntity.getAnimationFrame().getWidth() / 2),
				parentEntity.getPosition().y + parentEntity.getAnimationFrame().getHeight());
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
