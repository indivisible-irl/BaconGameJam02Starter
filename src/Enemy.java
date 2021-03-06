import java.util.Random;

import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;


public class Enemy extends Entity
{
	protected final int VARIANCE = 0;
	protected final int LOWER_RANDOM_BOUND = 380;
	
	private Bird bird;
	
	public Enemy(Image[] images, Bird bird) throws SlickException
	{
		super(images);
		this.bird = bird;
		this.init();
	}
	
	private void init()
	{		
		Random rand = new Random();
		int randomYValue = rand.nextInt(LOWER_RANDOM_BOUND) + VARIANCE;
		this.position.x = GLOBAL.SCREEN_WIDTH + 100;
		this.position.y = randomYValue;
		this.setVelocity(0.15f);
		this.boundingShape = new Rectangle(this.getPosition().x, 
					this.getPosition().y, 
					this.getAnimationFrame().getWidth(),
					this.getAnimationFrame().getHeight());
		 this.colidable = true;
	}
	
	public static Enemy getRandomlyPlacedEnemy(Bird bird) throws SlickException
	{
		Image[] iEnemy = IMAGES.getNewEnemy();
		Enemy returnEnemy = new Enemy(iEnemy, bird);
		
		return returnEnemy;
	}
	
	public void update(Input input, int delta)
	{
		if(!this.colidable){
			if(this.getPosition().y < 450){
				this.getPosition().y +=  0.25f * delta;
			}
			this.getPosition().x -=  this.getVelocity() * delta;
		}else{
		float birdx = bird.getPosition().x;
		float birdy = bird.getPosition().y;
		float x = this.getPosition().x - birdx;
		float y = this.getPosition().y - birdy;
		if(Math.sqrt(x * x + y * y) < 100){
			if(this.getPosition().x < birdx){
				this.getPosition().x +=  this.getVelocity() * delta;
			}else{
				this.getPosition().x -=  this.getVelocity() * delta;
			}		
			if(this.getPosition().y < birdy){
				this.getPosition().y +=  this.getVelocity() * delta;
			}else{
				this.getPosition().y -=  this.getVelocity() * delta;
			}	
		}else{
			this.getPosition().x -=  this.getVelocity() * delta;
		}
		
		}
		this.updateBoundingRect();
	}
	
	private void updateBoundingRect()
	{
		boundingShape.setX(this.position.x);
		boundingShape.setY(this.position.y);
	}
	
	public void handleCollision(Entity entity)
	{
		Random rand = new Random();
		
		this.colidable = false;
		this.getAnimation().stop();
		
		if(rand.nextBoolean()){
			this.getAnimationFrame().rotate(90);
		}else{
			this.getAnimationFrame().rotate(-90);
		}
		this.setVelocity(GLOBAL.SCROLL_SPEED);
	}
	
	public void draw()
	{
		this.getAnimation().draw(this.getPosition().x, this.getPosition().y);
	}
	
	public String getName(){
		return "enemy";
	}
	public int getScore(){
		return 500;
	}
}
