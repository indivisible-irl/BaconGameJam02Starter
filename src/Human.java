import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;


public class Human extends Entity
{
	public Human(Image[] images)
	{
		 super(images);
		 this.setPosition(new Vector2f(500, 450));
		 this.setVelocity(0.3f);
	}

	public void update(Input input, int delta)
	{
		this.getPosition().x -=  this.getVelocity() * delta;
	}
	
	public void draw()
	{
		this.getAnimation().draw(this.getPosition().x, this.getPosition().y);
	}
	
}
