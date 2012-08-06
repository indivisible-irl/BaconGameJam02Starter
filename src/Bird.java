import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;

/*
 * Reddit BaconGameJam - Aug 2012
 * BirdPoop
 * 04/08/12
 */

public class Bird extends Entity 
{				
	private Crap crap;
		
	/**
	 * @param image sprite image
	 */
	public Bird(Image image) throws SlickException
	{
		 super(image);
		 this.init();
	}
	/**
	 * Use this constructor if you want your bird animated
	 * @param images
	 * @throws SlickException
	 */
	public Bird(Image[] images) throws SlickException
	{
		 super(images);
		 this.init();
	}
	
	/**
	 * Init for repeating constructor code
	 * @throws SlickException
	 */
	private void init() throws SlickException
	{
		 this.setPosition(new Vector2f(50, 140));
		 this.setVelocity(0.2f);
		 this.crap = new Crap(new Image(GLOBAL.CRAP), this);
		 this.direction = 1; 		// facing right
		 this.flip(true, false);	// flip as images face left
		 this.boundingShape = new Rectangle(this.getPosition().x, 
					this.getPosition().y, 
					this.getAnimationFrame().getWidth(),
					this.getAnimationFrame().getHeight());
		 this.colidable = true;
	}
	/**
	 * Update the hitbox
	 */
	private void updateBoundingRect()
	{
		boundingShape.setX(this.position.x);
		boundingShape.setY(this.position.y);
	}
	
	//////////////////////////////////////////////////////
	////// get & set	
	
	/**
	 * @param Set the Crap
	 */
	public void setCrap(Crap crap)
	{
		this.crap = crap;
	}
	
	/**
	 * @return Get the Crap
	 */
	public Crap getCrap()
	{
		return crap;
	}
	
	/**
	 * @return Get the Name
	 */
	public String getName()
	{
		return "Bird";
	}
	//////////////////////////////////////////////////////
	////// functional methods
	
	/**
	 * Flip the image set horizontally to face direction of movement.
	 * @param flipHorizontal
	 * @param flipVertical
	 */
	public void flip(boolean flipHorizontal, boolean flipVertical)
	{
		for(int i = 0;i < images.length;i++){
			images[i] = images[i].getFlippedCopy(flipHorizontal, flipVertical);
		}
		
		this.setAnimation(images);
	}
	
	/**
	 * Handles input and movement responses from the bird
	 * @param input
	 * @param delta
	 */
	public void update(Input input, int delta)
	{
		this.updateBoundingRect();
		//float rotation = this.getAnimationFrame().getRotation();
		
		if(input.isKeyDown(Input.KEY_LEFT) || input.isKeyDown(Input.KEY_A))
		{
			if(direction != -1){
				direction = -1;
				this.flip(true, false);
			}
			if (!(this.getPosition().getX() < GLOBAL.BUFFER_LEFT))
			{
				this.getPosition().x -=  this.getVelocity() * delta;
			}
			//if(rotation < 0) this.getAnimationFrame().rotate(1);
			//if(rotation > 0) this.getAnimationFrame().rotate(-1);
		}
		if(input.isKeyDown(Input.KEY_RIGHT) || input.isKeyDown(Input.KEY_D))
		{
			if(direction != 1){
				direction = 1;
				this.flip(true, false);
			}
			if (!(this.getPosition().getX() > GLOBAL.BUFFER_RIGHT))
			{
				this.getPosition().x +=  this.getVelocity() * delta;
			}
			//if(rotation < 0) this.getAnimationFrame().rotate(1);
			//if(rotation > 0) this.getAnimationFrame().rotate(-1);
		}
		if(input.isKeyDown(Input.KEY_UP) || input.isKeyDown(Input.KEY_W))
		{
			//if(rotation > -45) this.getAnimationFrame().rotate(-1);
			if (!(this.getPosition().getY() < GLOBAL.BUFFER_TOP))
			{
				this.getPosition().y -=  this.getVelocity() * delta;
			}
		}
		if(input.isKeyDown(Input.KEY_DOWN) || input.isKeyDown(Input.KEY_S))
		{
			if (!(this.getPosition().getY() > GLOBAL.BUFFER_BOTTOM))
			{
				this.getPosition().y +=  this.getVelocity() * delta;
			}
			//if(rotation < 45) this.getAnimationFrame().rotate(1);
		}
		if(input.isKeyDown(Input.KEY_SPACE))
		{
			if(!this.crap.isActive) this.crap.activate();		
		}
		if(this.crap.isActive) this.crap.update(delta);
	}	
	
	/**
	 * handles the drawing of the bird for each frame
	 */
	public void draw()
	{
		this.getAnimation().draw(this.getPosition().x, this.getPosition().y);
		if(this.crap.isActive) this.crap.draw();
	}
	
	
}
