
//import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
//import org.newdawn.slick.SpriteSheet;
 
public class SimpleGame extends BasicGame
{
	static final int SCREEN_HEIGHT = 800;
	static final int SCREEN_WIDTH = 600;
	
	Background background = null;
	Bird bird;
	Human dude;
	
    public SimpleGame()
    {
        super("Bird Poop!");
    }
 
    @Override
    public void init(GameContainer gc) 
			throws SlickException 
	{
    	background = new Background(new Image("resources/background.png"), new Image("resources/background.png"));
    	bird = new Bird(new Image("resources/BirdMoveUp.png"));
    	//bird = new Bird(new Image("resources/BirdMoveUp.png"));
    	//SpriteSheet ss = new SpriteSheet(new Image("resources/DudeWalking_L2R.jpg"), 28, 49);
    	//Image [] ii = {ss.getSubImage(0, 0), ss.getSubImage(1, 0)};
    	//int [] dur = {100, 100};
    	//bird = new Bird(new Animation(ii, 100));
    	dude = new Human(new Image("resources/Dude_R2L_28x49.png"), 28, 49);
    	dude.getAnimation().setAutoUpdate(true);
    	dude.getAnimation().start();
    	
    	bird.getAnimation().setAutoUpdate(true);
    	bird.getAnimation().start();
    }
 
    @Override
    public void update(GameContainer gc, int delta) 
			throws SlickException     
    {
    	Input input = gc.getInput();
    	background.update(delta);
    	bird.update(input, delta);
    }
    
    @Override
    public void render(GameContainer gc, Graphics g) 
			throws SlickException 
    {
    	background.draw();
    	bird.draw();
    }
 
    public static void main(String[] args) 
			throws SlickException
    {    	
         AppGameContainer app = new AppGameContainer(new SimpleGame());
 
         app.setDisplayMode(SCREEN_HEIGHT, SCREEN_WIDTH, false);
         app.start();
    }
}