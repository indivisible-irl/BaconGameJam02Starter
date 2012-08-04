import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;


public class Human extends Entity
{
	
	public Human(Image[] images)
	{
		 super(images);
		 this.setPosition(new Vector2f(500, 420));
		 this.setVelocity(0.15f);
		 this.boundingShape = new Rectangle(this.getPosition().x, 
					this.getPosition().y, 
					this.getAnimationFrame().getWidth(),
					this.getAnimationFrame().getHeight());
	}
	
	private void updateBoundingRect()
	{
		boundingShape.setX(this.position.x);
		boundingShape.setY(this.position.y);
	}

	public void update(Input input, int delta)
	{
		this.getPosition().x -=  this.getVelocity() * delta;
		this.updateBoundingRect();	
		
	}
	
	public void handleCollision()
	{
		
	}
	
	public void draw()
	{
		this.getAnimation().draw(this.getPosition().x, this.getPosition().y);
	}
	
}
