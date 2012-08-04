
import java.util.ArrayList;

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
	private ArrayList<Image> animationFrames;
	private Image spriteImage;

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
	 * @return the animationFrames
	 */
	public ArrayList<Image> getAnimationFrames()
	{
		return animationFrames;
	}
	/**
	 * @param animationFrames the animationFrames to set
	 */
	public void setAnimationFrames(ArrayList<Image> animationFrames)
	{
		this.animationFrames = animationFrames;
	}
	/**
	 * @return the spriteImage
	 */
	public Image getSpriteImage()
	{
		return spriteImage;
	}
	/**
	 * @param image add an individual image to the animationFrame list
	 */
	public void setIndividualAnimationFrame(Image image)
	{
		animationFrames.add(image);
	}
	/**
	 * @param spriteImage the spriteImage to set
	 */
	public void setSpriteImage(Image spriteImage)
	{
		this.spriteImage = spriteImage;
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
		this.animationFrames = new ArrayList<Image>();
		this.spriteImage = image;
	}
	
	/**
	 * Constructor that also allows for the animationFrames
	 * @param image
	 * @param animationFrames
	 */
	public Entity(Image image, ArrayList<Image> animationFrames)
	{		
		this.position = new Vector2f(0, 0);
		this.velocity = 0.0f;
		this.direction = 0;
		this.animationFrames = animationFrames;
		this.spriteImage = image;
	}
}
