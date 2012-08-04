
import org.newdawn.slick.Animation;
//click includes
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;

public class Entity
{
	///////////////////////////////////////
	// x,y coords on screen
	private Vector2f position;		
	private float velocity;
	private float direction;
	private float scoremultiplier;
	private Animation animation;

	///////////////////////////////////////
	//Getters/Setters
	/**
	 * @return the position
	 */
	public Vector2f getPosition()
	{
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(Vector2f position)
	{
		this.position = position;
	}
	/**
	 * @return the velocity
	 */
	public float getVelocity()
	{
		return velocity;
	}
	/**
	 * @param velocity the velocity to set
	 */
	public void setVelocity(float velocity)
	{
		this.velocity = velocity;
	}
	/**
	 * @return the direction
	 */
	public float getDirection()
	{
		return direction;
	}
	/**
	 * @return the Score Multiplier
	 */
	public float getMultiplier()
	{
		return scoremultiplier;
	}
	/**
	 * @param Set the Score Multiplier
	 */
	public void setMultiplier(float scoremultiplier)
	{
		this.scoremultiplier = scoremultiplier;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(float direction)
	{
		this.direction = direction;
	}
	/**
	 * @return the current animation frame
	 */
	public Image getAnimationFrame()
	{
		return this.animation.getCurrentFrame();
	}
	/**
	 * @return Get the animation
	 */
	public Animation getAnimation()
	{
		return this.animation;
	}
	/**
	 * @param Sets the animation frame
	 */
	public void setAnimationFrames(int index)
	{
		this.animation.setCurrentFrame(index);
	}
	/**
	 * @param image add an individual image to the animationFrame list
	 */
	public void addAnimationFrame(Image image, int duration)
	{
		this.animation.addFrame(image, duration);
	}
	
	/**
	 * Default constructor requires an Image
	 * @param image
	 */
	public Entity(Image image)
	{
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
		this.animation = new Animation();
		this.addAnimationFrame(image, 1000);
	}
	
	/**
	 * Constructor that uses a SpriteSheet to make an animation
	 * @param image
	 */
	public Entity(Animation animation)
	{
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
		this.animation = animation;
	}
}
