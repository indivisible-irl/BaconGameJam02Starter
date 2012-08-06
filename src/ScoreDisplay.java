import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;


@SuppressWarnings("unused")
public class ScoreDisplay extends Entity
{
	public static final String NAME = "ScoreNums";
	private int currentFrame;
	
	protected boolean isActive = false;
	protected Entity parentEntity;
	
	private boolean debug = false;
	
	/**
	 * Constructor
	 * @param image - score image
	 * @param parent - entity to draw above
	 */
	public ScoreDisplay(Image[] images, int index, Score score)
	{
		super(images);
		super.velocity = GLOBAL.SCROLL_SPEED;
		this.colidable = false;
		this.setPosition(new Vector2f(
				(this.parentEntity.position.x + this.parentEntity.getAnimationFrame().getWidth() / 2 - this.getAnimationFrame().getWidth() / 2),
				(this.parentEntity.position.y - 30)
				)
			);
		this.setAnimationFrames(this.currentFrame);
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
	public void update(Input input, int delta)
	{
		//this.position.y -= this.velocity * delta;				// move up some more
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
}
