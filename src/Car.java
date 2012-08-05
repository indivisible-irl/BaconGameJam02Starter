import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;


public class Car extends Entity 
{
	protected static final int VARIANCE = 42;
	protected static final int LOWER_RANDOM_BOUND = 420;
	protected static final String[][] cars =
				{
					{GLOBAL.CAR_BLUE, GLOBAL.CAR_BLUE_WRECK},
					{GLOBAL.CAR_GREEN, GLOBAL.CAR_GREEN_WRECK},
					{GLOBAL.CAR_PURPLE, GLOBAL.CAR_PURPLE_WRECK},
					{GLOBAL.CAR_RED, GLOBAL.CAR_RED_WRECK}
				};
	protected int carSelection;
	
	/////////////////////////////////////////////////////////////
	
	public int getCarSelection(){
		return this.carSelection;
	}
	public void setCarSelection(int selected){
		this.carSelection = selected;
	}
	
	/////////////////////////////////////////////////////////////
	
	public Car(Image[] images)
	{
		 super(images);
		 this.setPosition(new Vector2f(500, 420));
		 this.setVelocity(0.2f);
		 this.boundingShape = new Rectangle(this.getPosition().x, 
					this.getPosition().y, 
					this.getAnimationFrame().getWidth(),
					this.getAnimationFrame().getHeight());
		 this.colidable = true;
		 
		 this.getAnimation().stop();
	}
	
	/**
	 * Returns a Car object placed (somewhat) randomly on the road from the background
	 * and 100 pixels off the screen to the right
	 * @return
	 * @throws SlickException
	 */
	public static Car getRandomlyPlacedCar() throws SlickException
	{
		Random random = new Random();
		int carSelection = random.nextInt(cars.length);
		Image[] car = {
				new Image(cars[carSelection][0], GLOBAL.chromakey).getScaledCopy(1.7f),
				new Image(cars[carSelection][1], GLOBAL.chromakey).getScaledCopy(1.7f)
				};
		random = new Random();
		int randomYValue = random.nextInt(VARIANCE) + LOWER_RANDOM_BOUND;
		Car returnCar = new Car(car);
		returnCar.position = new Vector2f(GLOBAL.SCREEN_WIDTH + 100, randomYValue);		
		return returnCar;
	}
	
	
	private void updateBoundingRect()
	{
		boundingShape.setX(this.position.x);
		boundingShape.setY(this.position.y);
	}

	/**
	 * @return Get the Name
	 */
	public String getName()
	{
		return "Car";
	}
	
	public void update(Input input, int delta)
	{
		this.getPosition().x -=  this.getVelocity() * delta;
		this.updateBoundingRect();	
	}
	
	public void handleCollision(Entity entity)
	{
		this.setAnimationFrames(1);
		
		Random rand = new Random();
		
		this.colidable = false;

		this.setVelocity(.1f);
		
		this.getPosition().y -= 45;
	}
	
	public void draw()
	{
		this.getAnimation().draw(this.getPosition().x, this.getPosition().y);
	}
	
}
