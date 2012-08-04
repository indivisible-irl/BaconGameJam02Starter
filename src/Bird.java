import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;

/*
 * Reddit BaconGameJam - Aug 2012
 * BirdPoop
 * 04/08/12
 */

public class Bird extends Entity 
{				
	private int health;									// health of our birdy	
	
	/**
	 * 
	 * @param image sprite image
	 */
	public Bird(Image image)
	{
		 super(image);
		 this.setPosition(new Vector2f(50, 50));
		 this.setVelocity(0.3f);
	}
	
	//////////////////////////////////////////////////////
	////// get & set	
	public int getHealth()
	{
		return this.health;
	}
	
	//////////////////////////////////////////////////////
	////// functional methods
	public void goUp()
	{
		
	}
	public void goDown()
	{
		
	}
	
	public void update(Input input, int delta)
	{
		if(input.isKeyDown(Input.KEY_LEFT))
		{
			this.getPosition().x -=  this.getVelocity() * delta;
		}
		if(input.isKeyDown(Input.KEY_RIGHT))
		{
			this.getPosition().x +=  this.getVelocity() * delta;
		}
		if(input.isKeyDown(Input.KEY_UP))
		{
			this.getPosition().y -=  this.getVelocity() * delta;
		}
		if(input.isKeyDown(Input.KEY_DOWN))
		{
			this.getPosition().y +=  this.getVelocity() * delta;
		}
	}	
	
	public void draw()
	{
		this.getSpriteImage().draw(this.getPosition().x, this.getPosition().y);
	}
}
