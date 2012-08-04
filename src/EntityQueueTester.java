import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
 
public class EntityQueueTester extends BasicGame
{	
	private Background background = null;
	private Bird bird;
	private EntityManager entityManager;
	private EntityQueueHandler entityQueueHandler;
	
    public EntityQueueTester()
    {
        super("Bird Poop!");
    }
 
    @Override
    public void init(GameContainer gc) 
			throws SlickException 
	{
    	background = new Background(new Image(GLOBAL.BACKGROUND), new Image(GLOBAL.BACKGROUND));
    	
    	Image[] ibird = {
    			new Image(GLOBAL.BIRD_WHITE_1, GLOBAL.chromakey), 
    			new Image(GLOBAL.BIRD_WHITE_2, GLOBAL.chromakey), 
    			new Image(GLOBAL.BIRD_WHITE_3, GLOBAL.chromakey), 
    			new Image(GLOBAL.BIRD_WHITE_4, GLOBAL.chromakey), 
    			new Image(GLOBAL.BIRD_WHITE_5, GLOBAL.chromakey)
    			};
    	bird = new Bird(ibird);
    	
    	entityManager = new EntityManager(bird);
    	entityQueueHandler = new EntityQueueHandler(entityManager);
    	entityManager.addEntity(Human.getRandomlyPlacedHuman());
    }

    @Override
    public void update(GameContainer gc, int delta) 
			throws SlickException     
    {
    	Input input = gc.getInput();
    	
    	if(input.isKeyDown(Input.KEY_H)){
    		entityManager.addEntity(Human.getRandomlyPlacedHuman());
    	}
    	
    	entityQueueHandler.update();
    	background.update(delta);
    	//bird.update(input, delta);
    	entityManager.update(input, delta);
    }
    
    @Override
    public void render(GameContainer gc, Graphics g) 
			throws SlickException 
    {
    	background.draw();
    	//bird.draw();
    	entityManager.draw();
    }
 
    /**
     * Entry point
     * @param args
     * @throws SlickException
     */
    public static void main(String[] args) 
			throws SlickException
    {    	
         AppGameContainer app = new AppGameContainer(new EntityQueueTester());
 
         app.setDisplayMode(GLOBAL.SCREEN_WIDTH, GLOBAL.SCREEN_HEIGHT, false);
         app.setTargetFrameRate(60);
         app.start();
    }
}