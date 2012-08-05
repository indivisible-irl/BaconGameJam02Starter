import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;

public class Eggs
{
	Image image;
	float velocity = 0;
	
	/**
	 * Constructs a Sun object, These two images need to be the same
	 * @param leadImage
	 * @param followImage
	 */
	public Eggs(Image image)
	{
		this.image = image;
	}
	
	/**
	 * Update the eggs . Call draw() to display the changes.
	 * @param delta
	 */
	public void update(int delta)
	{
	}
	
	/**
	 * Draw the sun at its current position.
	 */
	public void draw()
	{
		image.draw(500, 0);
	}
}
