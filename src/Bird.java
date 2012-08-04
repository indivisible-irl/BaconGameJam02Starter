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
	public double getScoreMultiplier(){
		return 1;
	}
	
	
	//////////////////////////////////////////////////////
	////// functional methods
	public void goUp()
	{
		
	}
	public void goDown()
	{
		
	}
	
	/**
	 * Handles input and movement responses from the bird
	 * @param input
	 * @param delta
	 */
	public void update(Input input, int delta)
	{
		float rotation = this.getSpriteImage().getRotation();
		
		if(input.isKeyDown(Input.KEY_LEFT))
		{
			this.getPosition().x -=  this.getVelocity() * delta;	
			if(rotation < 0) this.getSpriteImage().rotate(1);
			if(rotation > 0) this.getSpriteImage().rotate(-1);
		}
		if(input.isKeyDown(Input.KEY_RIGHT))
		{
			this.getPosition().x +=  this.getVelocity() * delta;
			if(rotation < 0) this.getSpriteImage().rotate(1);
			if(rotation > 0) this.getSpriteImage().rotate(-1);
		}
		if(input.isKeyDown(Input.KEY_UP))
		{
			if(rotation > -45) this.getSpriteImage().rotate(-1);
			this.getPosition().y -=  this.getVelocity() * delta;
		}
		if(input.isKeyDown(Input.KEY_DOWN))
		{
			this.getPosition().y +=  this.getVelocity() * delta;
			if(rotation < 45) this.getSpriteImage().rotate(1);
		}
	}	
	
	/**
	 * handles the drawing of the bird each frame
	 */
	public void draw()
	{
		this.getSpriteImage().draw(this.getPosition().x, this.getPosition().y);
	}
}
