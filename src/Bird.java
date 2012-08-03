/*
 * Reddit BaconGameJam - Aug 2012
 * BirdPoop
 * 04/08/12
 */

public class Bird {
	//////////////////////////////////////////////////////
	////// data
	
	private int[] location = new int[2];				// x,y coords on screen
	private int health;									// health of our birdy
	private boolean facingRight;						// which direction is the bird facing? 
	private static final String[] imgFrames = {			// images to swap between to animate the birdy
		"file1",
		"file2",
		"file3",
		"file4"};
	
	
	//////////////////////////////////////////////////////
	////// constructor
	
	public Bird(){
		 
	}
	
	//////////////////////////////////////////////////////
	////// get & set
	public int[] getLocation(){
		return this.location;
	}
	public void setLocation(int[] loc){
		this.location = loc;
	}
	public int getHealth(){
		return this.health;
	}
	public void setHealth(int hp){
		this.health = hp;
	}
	public String[] getImgFrames(){
		return Bird.imgFrames;
	}
	
	//////////////////////////////////////////////////////
	////// functional methods
	public void goUp(){
		
	}
	public void goDown(){
		
	}
	
	
	
}
