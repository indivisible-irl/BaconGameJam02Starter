import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;

public class Sun
{
	Image image;
	float velocity;
	
	/**
	 * Constructs a Sun object, These two images need to be the same
	 * @param leadImage
	 * @param followImage
	 */
	public Sun(Image image)
	{
		this.image = image;
	}
	
	/**
	 * scrolls the sun to the left
	 * @param entity
	 * @param delta
	 */
	
	/**
	 * Update the sun's position. Call draw() to display the changes.
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
