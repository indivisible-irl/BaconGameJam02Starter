import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
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
	 * 
	 * @param image sprite image
	 */
	public Bird(Image image) throws SlickException
	{
		 super(image);
		 this.init();
	}
	
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
		 this.setPosition(new Vector2f(50, 50));
		 this.setVelocity(0.3f);
		 this.crap = new Crap(new Image("resources/poop.png", new Color(255, 0, 255)), this);
		 this.direction = -1;
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
	
	//////////////////////////////////////////////////////
	////// functional methods
	
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

		float rotation = this.getAnimationFrame().getRotation();
		
		if(input.isKeyDown(Input.KEY_LEFT) || input.isKeyDown(Input.KEY_A))
		{
			if(direction != -1){
				direction = -1;
				this.flip(true, false);
			}
			this.getPosition().x -=  this.getVelocity() * delta;	
			if(rotation < 0) this.getAnimationFrame().rotate(1);
			if(rotation > 0) this.getAnimationFrame().rotate(-1);
		}
		if(input.isKeyDown(Input.KEY_RIGHT) || input.isKeyDown(Input.KEY_D))
		{
			if(direction != 1){
				direction = 1;
				this.flip(true, false);
			}
			this.getPosition().x +=  this.getVelocity() * delta;
			if(rotation < 0) this.getAnimationFrame().rotate(1);
			if(rotation > 0) this.getAnimationFrame().rotate(-1);
		}
		if(input.isKeyDown(Input.KEY_UP) || input.isKeyDown(Input.KEY_W))
		{
			if(rotation > -45) this.getAnimationFrame().rotate(-1);
			this.getPosition().y -=  this.getVelocity() * delta;
		}
		if(input.isKeyDown(Input.KEY_DOWN) || input.isKeyDown(Input.KEY_S))
		{
			this.getPosition().y +=  this.getVelocity() * delta;
			if(rotation < 45) this.getAnimationFrame().rotate(1);
		}
		if(input.isKeyDown(Input.KEY_SPACE))
		{
			if(!this.crap.isActive) this.crap.activate();		
		}
		if(this.crap.isActive) this.crap.update(delta);
	}	
	
	/**
	 * handles the drawing of the bird each frame
	 */
	public void draw()
	{
		this.getAnimation().draw(this.getPosition().x, this.getPosition().y);
		if(this.crap.isActive) this.crap.draw();
	}
}
