import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
 
public class SimpleGame extends BasicGame
{
	private GameContainer game = null;
	private Menu menu = null;
	private Gameover gameover = null;
	private Background background = null;
	private Clouds clouds = null;
	private Sun sun = null;
	private Bird bird;
	private Health birdHealth;
	//private Enemy enemy;
	private EntityManager entityManager;
	private EntityQueueHandler entityQueueHandler;
	private Score score;
	private boolean inMenu = true;
	private boolean exitGame;
	
    public SimpleGame()
    {
        super("Bird Poop!");
    }

    @Override
    public void init(GameContainer gc) 
			throws SlickException 
	{
    	game = gc;
    	
    	if(inMenu){
    		menu = new Menu(gc);
    		inMenu = false;
    	} else {
    	
    	score = new Score();
    	birdHealth = new Health();
    	background = new Background(IMAGES.BACKGROUND, IMAGES.BACKGROUND);
    	clouds = new Clouds(IMAGES.CLOUDS, IMAGES.CLOUDS);
    	sun = new Sun(IMAGES.SUN.getScaledCopy(GLOBAL.SUN_SCALE));
    	gameover = new Gameover(gc, score);
    	
    	Image[] iBird = IMAGES.getNewBird();
    	bird = new Bird(iBird);
    	
    	entityManager = new EntityManager(bird, birdHealth);
    	entityQueueHandler = new EntityQueueHandler(entityManager);
    	}
    }
 
    @Override
    public void update(GameContainer gc, int delta) 
			throws SlickException     
    {
    	// Button listeners:
    	Input input = gc.getInput();
    	
    	if(menu.getStartgame()){
    		menu.setActive(false);
    		inMenu = false;
    		this.init(gc);
    		menu.setStartgame(false);
    	}
    	if(menu.isActive()){
    		menu.update(input, delta);
    	}else if(this.exitGame){
    		gameover.update(input, delta);
    	}else{
	    	if(input.isKeyPressed(Input.KEY_H)){
	    		entityManager.addEntity(Human.getRandomlyPlacedHuman());
	    	}
	    	if(input.isKeyPressed(Input.KEY_E)){
	    		entityManager.addEntity(Enemy.getRandomlyPlacedEnemy(bird));
	    	}
	    	if(input.isKeyPressed(Input.KEY_C)){
	    		entityManager.addEntity(Car.getRandomlyPlacedCar());
	    	}
	    	if(input.isKeyPressed(Input.KEY_T)){
	    		entityManager.addEntity(Tree.getRandomlyPlacedTree());
	    	}
	    	if(input.isKeyPressed(Input.KEY_P)){
	    		entityQueueHandler.increaseDelay();
	    		System.out.println("Increased Queue delay: " + entityQueueHandler.getDelay());
	    	}
	    	if(input.isKeyPressed(Input.KEY_O)){
	    		entityQueueHandler.decreaseDelay();
	    		System.out.println("Decreased Queue delay: " + entityQueueHandler.getDelay());
	    	}
	    	
	    	// Updates
	    	background.update(delta);
	    	clouds.update(delta);
	    	
	    	entityQueueHandler.update();
	    	this.exitGame = entityManager.update(input, delta);
	    	score.update();
	    	if (this.exitGame){
	    		System.out.println("GAME OVER!");
	    	}
    	}
    }
    
    @Override
    public void render(GameContainer gc, Graphics g) 
			throws SlickException 
    {
    	if(menu.isActive()){
    		menu.draw();
    	}else if(this.exitGame){
    		gameover.draw();
    	}else{
    	
    	background.draw();
    	sun.draw();
    	clouds.draw();
    	entityManager.draw();
    	
    	gc.getGraphics().drawString(score.getScorePrintable(), GLOBAL.SCREEN_WIDTH - 75, 0);
    	}
    }
 
    /**
     * Entry point
     * @param args
     * @throws SlickException
     */
    public static void main(String[] args) 
			throws SlickException
    {    	
         AppGameContainer app = new AppGameContainer(new SimpleGame());
 
         app.setDisplayMode(GLOBAL.SCREEN_WIDTH, GLOBAL.SCREEN_HEIGHT, false);
         app.setTargetFrameRate(60);
         app.start();
    }
}