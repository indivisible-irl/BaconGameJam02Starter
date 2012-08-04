import org.newdawn.slick.Animation;
import org.newdawn.slick.Input;

//click includes
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;

public class Entity
{
	///////////////////////////////////////
	// instance variables
	
	protected Vector2f position;		
	protected float velocity;
	protected float direction;
	protected float scoremultiplier;
	protected float health;
	protected Animation animation;
	protected Image[] images;
	protected Shape boundingShape;
	protected boolean colidable;

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
	 * @return the Score Multiplier
	 */
	public float getMultiplier()
	{
		return scoremultiplier;
	}
	
	/**
	 * @param Set the Health
	 */
	public void setHealth(float health)
	{
		this.health = health;
	}
	
	/**
	 * @return the Health
	 */
	public float getHealth()
	{
		return health;
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
	public float getDirection()
	{
		return this.direction;
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
	 * Sets the animation with an Animation
	 * @param animation
	 */
	public void setAnimation(Animation animation){
		this.animation = animation;
	}
	
	/**
	 * Sets the animation with an image array
	 * @param animation
	 */
	public void setAnimation(Image[] images){
		this.animation = new Animation(images, 100);
	}
	
	/**
	 * @param Sets the animation frame
	 */
	public void setAnimationFrames(int index)
	{
		this.animation.setCurrentFrame(index);
	}
	
	/**
	 * @param append an image to the animation
	 */
	public void addAnimationFrame(Image image, int duration)
	{
		this.animation.addFrame(image, duration);
	}	
	
	/**
	 * @return the boundingShape
	 */
	public Shape getBoundingShape()
	{
		return boundingShape;
	}

	/**
	 * @param boundingShape the boundingShape to set
	 */
	public void setBoundingShape(Shape boundingShape)
	{
		this.boundingShape = boundingShape;
	}
	
	/**
	 * @return the colidable
	 */
	public boolean isColidable()
	{
		return colidable;
	}

	/**
	 * @param colidable the colidable to set
	 */
	public void setColidable(boolean colidable)
	{
		this.colidable = colidable;
	}

	/**
	 * Default constructor
	 *
	 */
	public Entity()
	{
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
	}
	
	/**
	 * Constructor that requires an Image
	 * @param image
	 */
	public Entity(Image image)
	{
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
		this.animation = new Animation();
		this.addAnimationFrame(image, 1000);
		this.colidable = false;
	}
	
	public Entity(Image image, boolean colidable)
	{
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
		this.animation = new Animation();
		this.addAnimationFrame(image, 1000);
		this.colidable = colidable;
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
		this.animation.start();
		this.animation.setAutoUpdate(true);
		this.colidable = false;
	}
	
	/**
	 * 
	 * @param images
	 * @param colidable
	 */
	public Entity(Image[] images, boolean colidable){
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
		this.images = images;
		this.animation = new Animation(images, 100);
		this.animation.start();
		this.animation.setAutoUpdate(true);
		this.colidable = colidable;
	}
	
	/**
	 * @return Get the Name
	 */
	public String getName()
	{
		return "Entity";
	}
	
	protected void handleCollision(Entity entity)
	{
		
	}
	
	public void update(Input input, int delta)
	{
		
	}
	
	public void draw()
	{
		
	}

}
