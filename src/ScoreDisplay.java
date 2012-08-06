import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;


@SuppressWarnings("unused")
public class ScoreDisplay extends Entity
{
	private static final String NAME = "ScoreNums";
	private Image[] images;
	private int index;
	private Score score;
	
	private boolean debug = false;
	
	/**
	 * Constructor
	 * @param image - score image
	 * @param parent - entity to draw above
	 */
	public ScoreDisplay(Image[] images, int index, Score score)
	{
		super(images);
		super.velocity = 0;
		this.index = index;
		this.score = score;
		this.colidable = false;
		this.setPosition(new Vector2f(
				(GLOBAL.SCORE_LOCATION_X + (index*this.getAnimationFrame().getWidth())),
				(GLOBAL.SCORE_LOCATION_Y)
				)
		);
		this.setAnimationFrames(0);
		this.boundingShape = new Rectangle(this.getPosition().x, 
				this.getPosition().y, 
				this.getAnimationFrame().getWidth(),
				this.getAnimationFrame().getHeight()
				);
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
		String scoreString = score.getScorePrintable();
		char thisChar = scoreString.charAt(index);
		this.setAnimationFrames((int)(thisChar));
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
