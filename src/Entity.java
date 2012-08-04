
import org.newdawn.slick.Animation;
import org.newdawn.slick.SpriteSheet;
//click includes
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;

public class Entity
{
	///////////////////////////////////////
	// x,y coords on screen
	protected Vector2f position;		
	protected float velocity;
	protected float direction;
	protected float scoremultiplier;
	protected Animation animation;
	protected Image[] images;

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
	 * Sets the animation
	 * @param animation
	 */
	public void setAnimation(Animation animation){
		this.animation = animation;
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
	
	//////////////////////////////////////////////////////////////////////////
	
	/**
	 * Empty constructor because I couldn't get Sprite to init otherwise.
	 */
	public Entity()
	{
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
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
	 * Constructor that uses an Animation to make an animation
	 * @param image
	 */
	public Entity(Animation animation)
	{
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
		this.animation = animation;
	}
	/**
	 * Constructor that uses a an array of images to make an animation
	 * @param spriteSheet
	 */
	public Entity(Image[] images){
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
		this.images = images;
		this.animation = new Animation(images, 100);
	}
}
