import org.newdawn.slick.Image;
//import org.newdawn.slick.geom.Vector2f;

public class Impact
{
	private Image[] images;
	private Image currentImage;
	private int position;
	private boolean isActive;
	
	/**
	 * Constructs an Impact object. Gets drawn on collision to notify user.
	 * @param Image[] frames
	 */
	public Impact(Image[] imgs)
	{
		images = imgs;
		position = 0;
		isActive = false;
	}
	
	/**
	 * Update the eggs . Call draw() to display the changes.
	 * @param delta
	 */
	public void trigger()
	{
		position = 0;
		isActive = true;
	}
	
	/**
	 * Draw the sun at its current position.
	 */
	public void draw()
	{
		if(isActive){
			currentImage = images[position];
			currentImage.draw(0, 0);
			position += 1;
			if (position == images.length){
				isActive = false;
			}
		}
	}
}
