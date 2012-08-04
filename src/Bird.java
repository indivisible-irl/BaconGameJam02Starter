import org.newdawn.slick.Image;

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
	}
	
	//////////////////////////////////////////////////////
	////// get & set	
	public int getHealth(){
		return this.health;
	}
	
	//////////////////////////////////////////////////////
	////// functional methods
	public void goUp(){
		
	}
	public void goDown(){
		
	}
}
