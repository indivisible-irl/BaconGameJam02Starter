import org.newdawn.slick.Image;
//import org.newdawn.slick.geom.Vector2f;

public class Eggs
{
	private Image[] images;
	private Image currentImage;
	private Health birdHealth;
	
	/**
	 * Constructs a Sun object, These two images need to be the same
	 * @param leadImage
	 * @param followImage
	 */
	public Eggs(Image[] imgs, Health health)
	{
		this.images = imgs;
		this.birdHealth = health;
		update();
	}
	
	/**
	 * Update the eggs . Call draw() to display the changes.
	 * @param delta
	 */
	public void update()
	{
		this.currentImage = this.images[this.birdHealth.getHealth()-1];
	}
	
	/**
	 * Draw the sun at its current position.
	 */
	public void draw()
	{
		update();
		currentImage.draw(15, 15);
	}
}
