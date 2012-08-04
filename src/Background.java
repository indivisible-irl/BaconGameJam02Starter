import java.util.ArrayList;

import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;



public class Background
{
	private static final int SCREEN_WIDTH = 800;
	private static final int SCREEN_HEIGHT = 600;
	
	Entity leadImage;
	Entity followImage;
	boolean initialized = false;
	float velocity;
	boolean stitched = false;
	
	public Background(Image leadImage, Image followImage)
	{
		this.leadImage = new Entity(leadImage);
		this.followImage = new Entity(followImage);
		this.velocity = 0.3f;		
	}
	
	public void scroll(Entity entity, int delta)
	{
		entity.setPosition(new Vector2f(
				entity.getPosition().x - velocity * delta, 
				entity.getPosition().y));
	}
	
	public void update(int delta)
	{
		int rightEdge = (int)(this.leadImage.getPosition().x + leadImage.getAnimationFrame().getWidth());
		if(rightEdge == 0)
		{
			System.out.println("right edge is == 0!");
			Entity tempEntity = this.leadImage;
			this.leadImage = this.followImage;
			this.followImage = tempEntity;
			
			Vector2f stitch = new Vector2f(this.leadImage.getPosition().x + this.leadImage.getAnimationFrame().getWidth(), 
					this.leadImage.getPosition().y);
			followImage.setPosition(stitch);
		}
		//bothScroll(delta);
		this.scroll(leadImage, delta);
		this.scroll(followImage, delta);
	}
	
	public void draw()
	{
		if(!initialized) 
		{
			this.leadImage.setPosition(new Vector2f(0, 0));
			this.followImage.setPosition(new Vector2f(this.leadImage.getPosition().x + this.leadImage.getAnimationFrame().getWidth(), 0));
			initialized = true;
		}
		this.leadImage.getAnimationFrame().draw(this.leadImage.getPosition().x, this.leadImage.getPosition().y);
		this.followImage.getAnimationFrame().draw(this.followImage.getPosition().x, this.followImage.getPosition().y);
	}
}