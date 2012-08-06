import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;


@SuppressWarnings("unused")
public class ScoreDisp extends Entity
{
	public static final String NAME = "Score";
	
	protected boolean isActive = false;
	protected Entity parentEntity;
	
	/**
	 * Constructor
	 * @param image - score image
	 * @param parent - entity to draw above
	 */
	public ScoreDisp(Image image, Entity parent)
	{
		super(image);
		super.velocity = GLOBAL.SCROLL_SPEED;
		parentEntity = parent;
		this.boundingShape = new Rectangle(this.getPosition().x, 
				this.getPosition().y, 
				this.getAnimationFrame().getWidth(),
				this.getAnimationFrame().getHeight());
	}
	/**
	 * Update hit box
	 */
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
		return NAME;
	}
	/**
	 * update the score's position etc
	 * @param delta
	 */
	public void update(int delta)
	{
		if(!isActive) return;  //if the poop isn't active, don't do shit!  GET IT?
		
		this.position.y -= this.velocity * delta;
		
		if(this.position.y < -60)
		{
			this.deactivate();
		}
	}
	/**
	 * draw the score on the screen
	 */
	public void draw()
	{
		this.getAnimationFrame().draw(this.getPosition().x, this.getPosition().y);
	}
	/**
	 * Activate the score for drawing
	 */
	public void activate()
	{
		isActive = true;
		//Position the sprite at the bottom center of the parent bird sprite
//		this.position = new Vector2f(parentEntity.getPosition().x + (parentEntity.getAnimationFrame().getWidth() / 2),
//				parentEntity.getPosition().y + parentEntity.getAnimationFrame().getHeight());
		this.position = new Vector2f(parentEntity.getPosition().x, parentEntity.getPosition().y);
	}
	/**
	 * Deactivate the score drawing
	 */
	public void deactivate()
	{
		isActive = false;
	}
	
	public boolean isActive()
	{
		return this.isActive;
	}
}
