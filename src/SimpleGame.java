
import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
 
public class SimpleGame extends BasicGame
{
	Background background = null;
	Bird bird;
	
    public SimpleGame()
    {
        super("Bird Poop!");
    }
 
    @Override
    public void init(GameContainer gc) 
			throws SlickException 
	{
    	background = new Background(new Image("resources/BackgroundSample.jpg"), new Image("resources/BackgroundSample.jpg"));
    	bird = new Bird(new Image("resources/BirdMoveUp.png"));
    	//bird = new Bird(new Image("resources/BirdMoveUp.png"));
    	//SpriteSheet ss = new SpriteSheet(new Image("resources/DudeWalking_L2R.jpg"), 28, 49);
    	//Image [] ii = {ss.getSubImage(0, 0), ss.getSubImage(1, 0)};
    	//int [] dur = {100, 100};
    	//bird = new Bird(new Animation(ii, 100));
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
 
         app.setDisplayMode(800, 600, false);
         app.start();
    }
}