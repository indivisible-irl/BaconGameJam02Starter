import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
 
public class SimpleGame extends BasicGame
{
	static final int SCREEN_HEIGHT = 800;
	static final int SCREEN_WIDTH = 600;
	
	Background background = null;
	Bird bird;
	Human dude;
	Human otherDude;
	
    public SimpleGame()
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
    	
    	
    	Image[] idude = {
    			new Image(GLOBAL.DUDE_WALK_1, GLOBAL.chromakey).getScaledCopy(1.7f), 
    			new Image(GLOBAL.DUDE_WALK_2, GLOBAL.chromakey).getScaledCopy(1.7f), 
    			new Image(GLOBAL.DUDE_WALK_3, GLOBAL.chromakey).getScaledCopy(1.7f),
    			new Image(GLOBAL.DUDE_WALK_4, GLOBAL.chromakey).getScaledCopy(1.7f),
    			new Image(GLOBAL.DUDE_WALK_5, GLOBAL.chromakey).getScaledCopy(1.7f),
    			new Image(GLOBAL.DUDE_WALK_6, GLOBAL.chromakey).getScaledCopy(1.7f),
    			new Image(GLOBAL.DUDE_WALK_7, GLOBAL.chromakey).getScaledCopy(1.7f),
    			new Image(GLOBAL.DUDE_WALK_8, GLOBAL.chromakey).getScaledCopy(1.7f),
    			new Image(GLOBAL.DUDE_WALK_9, GLOBAL.chromakey).getScaledCopy(1.7f)
    			};
    	dude = new Human(idude);
    	
    	otherDude = Human.getRandomlyPlacedHuman();
    }
 
    @Override
    public void update(GameContainer gc, int delta) 
			throws SlickException     
    {
    	Input input = gc.getInput();
    	background.update(delta);
    	bird.update(input, delta);
    	dude.update(input, delta);
    	otherDude.update(input, delta);
    }
    
    @Override
    public void render(GameContainer gc, Graphics g) 
			throws SlickException 
    {
    	background.draw();
    	bird.draw();
    	dude.draw();
    	otherDude.draw();
    }
 
    /*public static void main(String[] args) 
			throws SlickException
    {    	
         AppGameContainer app = new AppGameContainer(new SimpleGame());
 
         app.setDisplayMode(SCREEN_HEIGHT, SCREEN_WIDTH, false);
         app.setTargetFrameRate(60);
         app.start();
    }*/
}